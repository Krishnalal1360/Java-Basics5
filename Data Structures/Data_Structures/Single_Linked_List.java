import java.util.Scanner;

public class Single_Linked_List{

  public Node start;
  public Node start1;

  public static class Node{

    public int data;
    public Node link;

    public Node(int data){
      this.data = data;
    }

  }

  public void create(){
    int data=0;
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter data for node : ");
    data = sc.nextInt();
    Node node = new Node(data);
    System.out.println("Node "+node.data+" is created!");
    node.link = null;
    start = node;
    display();
  }

  public void display(){
    Node temp = new Node(0);
    temp.link = start;
    temp = temp.link;
    System.out.println("The linked list is: ");
    while(temp != null){
      System.out.print(temp.data+"--->");
      temp = temp.link;
    }
    System.out.print("null");
    System.out.println();
  }

  public void insertBegin(){
    int data=0;
    boolean iter=true;
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    while(iter == true){
      System.out.println("Enter data for node: ");
      data = sc.nextInt();
      Node node = new Node(data);
      System.out.println("Node "+node.data+" is inserted at beginning!");
      node.link = null;
      node.link = start;
      start = node;
      display();
      System.out.println("If you want to insert at begin then press true else false: ");
      iter = sc.nextBoolean();
    }
  }

  public void insertEnd(){
    int data=0;
    boolean iter=true;
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    Node temp = new Node(0);
    temp.link = start;
    temp = temp.link;
    while(iter == true){
      while(temp != null){
        if(temp.link == null){
          break;
        }else{
          temp = temp.link;
        }
      }
      System.out.println("Enter data for node: ");
      data = sc.nextInt();
      Node node = new Node(data);
      System.out.println("Node "+node.data+" is inserted at end!");
      node.link = null;
      temp.link = node;
      display();
      System.out.println("If you want to insert at end then press true else false: ");
      iter = sc.nextBoolean();
    }
  }

  public boolean nodeCheck(int node){
    Node temp = new Node(0);
    temp.link = start;
    temp = temp.link;
    while(temp != null){
      if(temp.data == node){
        return true;
      }else{
        temp = temp.link;
      }
    }
    return false;
  }

  public void insertAfter(){
    int data=0, after_node=0;
    boolean iter=true, result=false;
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    while(iter == true){
      System.out.println("Enter after node value: ");
      after_node = sc.nextInt();
      result = nodeCheck(after_node);
      if(result == true){
        System.out.println("Node "+after_node+" exists!");
        Node temp1 = new Node(0);
        temp1.link = start;
        temp1 = temp1.link;
        Node temp2 = new Node(0);
        temp2.link = start;
        temp2 = temp2.link;
        temp2 = temp2.link;
        while(temp1 != null){
          if(temp1.data == after_node && temp1.link == null){
            System.out.println("Enter data for node: ");
            data = sc.nextInt();
            Node node = new Node(data);
            System.out.println("Node "+node.data+" is inserted after node "+after_node);
            node.link = null;
            temp1.link = node;
            display();
            break;
          }else if(temp1.data == after_node){
            System.out.println("Enter data for node: ");
            data = sc.nextInt();
            Node node = new Node(data);
            System.out.println("Node "+node.data+" is inserted after node "+after_node);
            node.link = null;
            temp1.link = node;
            node.link = temp2;
            display();
            break;
          }else{
            temp1 = temp1.link;
            temp2 = temp2.link;
          }
        }
      }else{
        System.out.println("Node "+after_node+" does not exists!");
      }
      System.out.println("If you want to insert after a node then press true else false: ");
      iter = sc.nextBoolean();
    }
  }

  public void deleteBegin(){
    boolean iter=true;
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    while(iter == true){
      Node temp = new Node(0);
      Node temp1 = new Node(0);
      temp.link = start;
      temp = temp.link;
      temp1.link = start;
      temp1 = temp1.link;
      temp1 = temp1.link;
      if(temp.link == null){
        System.out.println("Node "+temp.data+" is deleted!");
        start = null;
        display();
      }else{
        System.out.println("Node "+temp.data+" is deleted!");
        start = temp1;
        display();
      }
      System.out.println("If you want to delete at begin then press true else false: ");
      iter = sc.nextBoolean();
    }
  }

  public void deleteEnd(){
    boolean iter=true;
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    while(iter == true){
      Node temp = new Node(0);
      Node temp1 = new Node(0);
      temp.link = start;
      temp = temp.link;
      temp1.link = start;
      temp1 = temp1.link;
      temp1 = temp1.link;
      while(true){
        if(temp.link == null){
          System.out.println("Node "+temp.data+" is deleted!");
          start = null;
          display();
          break;
        }else if(temp1.link == null){
          System.out.println("Node "+temp1.data+" is deleted!");
          temp.link = null;
          display();
          break;
        }else{
          temp = temp.link;
          temp1 = temp1.link;
        }
      }
      System.out.println("If you want to delete at end then press true else false: ");
      iter = sc.nextBoolean();
    }
  }

  public void deleteAfter(){
    int after_node=0;
    boolean iter=true, result=false;
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    while(iter == true){
      System.out.println("Enter after node: ");
      after_node = sc.nextInt();
      result = nodeCheck(after_node);
      if(result == true){
        System.out.println("Node "+after_node+" exists!");
        Node temp1 = new Node(0);
        temp1.link = start;
        temp1 = temp1.link;
        Node temp2 = new Node(0);
        temp2.link = start;
        temp2 = temp2.link;
        temp2 = temp2.link;
        while(true){
          if(temp1.data == after_node && temp1.link == null){
            System.out.println("You reached the end of list!");
            break;
          }else if(temp1.data == after_node){
            System.out.println("Node "+temp2.data+" is deleted!");
            temp1.link = temp2.link;
            display();
            break;
          }else{
            temp1 = temp1.link;
            temp2 = temp2.link;
          }
        }
      }else{
        System.out.println("Node "+after_node+" does not exists!");
      }
      System.out.println("If you want to delete after a node then press true else false: ");
      iter = sc.nextBoolean();
    }
  }

  public int numberOfNodes(){
    int count=0;
    Node temp = new Node(0);
    temp.link = start;
    temp = temp.link;
    while(temp != null){
      count = count+1;
      temp = temp.link;
    }
    System.out.println("Number of nodes: "+count);
    return count;
  }

  public void specialCaseInsertMiddle(int nn){
    int data=0, ch=0;
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    if(nn == 1){
      System.out.println("Enter data for node: ");
      data = sc.nextInt();
      Node node = new Node(data);
      System.out.println("Node "+node.data+" is inserted!");
      node.link = null;
      node.link = start;
      start = node;
      display();
    }else{
      System.out.println("Enter 1 to insert at first middle.");
      System.out.println("Enter 2 to insert at second middle.");
      System.out.println("Enter your choice: ");
      ch = sc.nextInt();
      switch(ch){
        case 1:
        System.out.println("Enter data for node: ");
        data = sc.nextInt();
        Node node = new Node(data);
        System.out.println("Node "+node.data+" is inserted!");
        node.link = null;
        node.link = start;
        start = node;
        display();
        break;
        case 2:
        Node temp1 = new Node(0);
        Node temp2 = new Node(0);
        temp1.link = start;
        temp1 = temp1.link;
        temp2.link = start;
        temp2 = temp2.link;
        temp2 = temp2.link;
        System.out.println("Enter data for node: ");
        data = sc.nextInt();
        node = new Node(data);
        System.out.println("Node "+node.data+" is inserted!");
        node.link = null;
        temp1.link = node;
        node.link = temp2;
        display();
        break;
        default:
        System.out.println("Invalid Choice!!");
      }
    }
  }

  public void insertMiddle(){
    int nn=0, data=0, ch=0;
    boolean iter=true;
    @SuppressWarnings("resource") 
    Scanner sc = new Scanner(System.in);
    while(iter == true){
      nn = numberOfNodes();
      if(nn%2 != 0){
        if(nn == 1){
          specialCaseInsertMiddle(nn);
        }else{
          Node temp = new Node(0);
          Node temp1 = new Node(0);
          temp.link = start;
          temp1.link = start;
          temp1 = temp1.link;
          for(int i=1;i<=nn/2;i++){
            temp = temp.link;
            temp1 = temp1.link;
          }
          System.out.println("Enter data for node: ");
          data = sc.nextInt();
          Node node = new Node(data);
          System.out.println("Node "+node.data+" is inserted at middle!");
          node.link = null;
          temp.link = node;
          node.link = temp1;
          display();
        }
      }else{
        if(nn == 2){
          specialCaseInsertMiddle(nn);
        }else{
          Node node1 = new Node(0);
          Node node2 = new Node(0);
          Node node3 = new Node(0);
          node1.link = start;
          node2.link = start;
          node2 = node2.link;
          node3.link = start;
          node3 = node3.link;
          node3 = node3.link;
          for(int i=1;i<=(nn/2)-1;i++){
            node1 = node1.link;
            node2 = node2.link;
            node3 = node3.link;
          } 
          System.out.println("Enter 1 to insert at first middle.");
          System.out.println("Enter 2 to insert at second middle.");
          System.out.println("Enter your choice: ");
          ch = sc.nextInt();
          switch(ch){
            case 1:
            System.out.println("Enter data for node: ");
            data = sc.nextInt();
            Node node = new Node(data);
            System.out.println("Node "+node.data+" is inserted!");
            node.link = null;
            node1.link = node;
            node.link = node2;
            display();
            break;
            case 2:
            System.out.println("Enter data for node: ");
            data = sc.nextInt();
            node = new Node(data);
            System.out.println("Node "+node.data+" is inserted!");
            node.link = null;
            node2.link = node;
            node.link = node3;
            display();
            break;
            default:
            System.out.println("Invalid Choice!!");
          }
        }
      }
      System.out.println("If you want to insert at middle then press true else false: ");
      iter = sc.nextBoolean();
    }
  }

  public void specialCaseDeleteMiddle(int nn){
    int ch=0;
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    if(nn == 1){
      start = null;
      display();
    }else{
      System.out.println("Enter 1 to delete first middle.");
      System.out.println("Enter 2 to delete second middle.");
      System.out.println("Enter your choice: ");
      ch = sc.nextInt();
      switch(ch){
        case 1:
        start = start.link;
        display();
        break;
        case 2:
        start.link = null;
        display();
        break;
        default:
        System.out.println("Invalid Choice!!");
      }
    }
  }

  public void deleteMiddle(){
    int nn=0, ch=0;
    boolean iter=true;
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    while(iter == true){
      nn = numberOfNodes();
      if(nn%2 != 0){
        if(nn == 1){
          specialCaseDeleteMiddle(nn);
        }else{
          Node temp = new Node(0);
          Node temp1 = new Node(0);
          temp.link = start;
          temp1.link = start;
          temp1 = temp1.link;
          for(int i=1;i<=nn/2;i++){
            temp = temp.link;
            temp1 = temp1.link;
          }
          System.out.println("Node "+temp1.data+" is deleted!");
          temp.link = temp1.link;
          display();
        }
      }else{
        if(nn == 2){
          specialCaseDeleteMiddle(nn);
        }else{
          Node node1 = new Node(0);
          Node node2 = new Node(0);
          Node node3 = new Node(0);
          node1.link = start;
          node2.link = start;
          node2 = node2.link;
          node3.link = start;
          node3 = node3.link;
          node3 = node3.link;
          for(int i=1;i<=(nn/2)-1;i++){
            node1 = node1.link;
            node2 = node2.link;
            node3 = node3.link;
          }
          System.out.println("Enter 1 to delete at first middle.");
          System.out.println("Enter 2 to delete at second middle.");
          System.out.println("Enter your choice: ");
          ch = sc.nextInt();
          switch(ch){
            case 1:
            System.out.println("Node "+node2.data+" is deleted!");
            node1.link = node2.link;
            display();
            break;
            case 2:
            System.out.println("Node "+node3.data+" is deleted!");
            node2.link = node3.link;
            display();
            break;
            default:
            System.out.println("Invalid Choice!!");
          }
          display();
        }
      }
      System.out.println("If you want to delete at middle then press true else false: ");
      iter = sc.nextBoolean();
    }
  }

  public void reverse(){
    int nn=0, ind;
    boolean iter=true;
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    while(iter == true){
      ind = 0;
      nn = numberOfNodes();
      int ar[] = new int[nn];
      Node temp = new Node(0);
      temp.link = start;
      temp = temp.link;
      while(temp != null){
        ar[ind] = temp.data;
        ind = ind+1;
        temp = temp.link;
      }
      temp = new Node(0);
      temp.link = start;
      temp = temp.link;
      ind = ind-1;
      while(temp != null){
        temp.data = ar[ind];
        ind = ind-1;
        temp = temp.link;
      }
      System.out.println("Reversal of linked list.");
      display();
      System.out.println("If you want to reverse linked list then press true else false: ");
      iter = sc.nextBoolean();
    }
  }

  public void search(){
    int node_value=0, count, flag;
    boolean iter=true;
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    while(iter == true){
      count = 1;
      flag = 0;
      System.out.println("Enter node value to search: ");
      node_value = sc.nextInt();
      Node temp = new Node(0);
      temp.link = start;
      temp = temp.link;
      while(temp != null){
        if(temp.data == node_value){
          System.out.println("Node "+temp.data+" exists at position "+count);
          flag = 1;
          break;
        }else{
          temp = temp.link;
          count = count+1;
        }
      }
      if(flag == 0){
        System.out.println("Node "+node_value+" does not exists!!");
      }
      System.out.println("If you want to search a node then press true else false: ");
      iter = sc.nextBoolean();
    }
  }

  public void merge(){
    int ch=0;
    boolean iter=true, iter1=true;
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    while(iter == true){
      while(iter1 == true){
        System.out.println("Second Linked List");
        System.out.println("Enter 1 to create a node.");
        System.out.println("Enter 2 to insert a node at beginning.");
        System.out.println("Enter 3 to insert a node at end.");
        System.out.println("Enter 4 to insert a node after a node.");
        System.out.println("Enter 5 to insert a node at middle.");
        System.out.println("Enter your choice: ");
        ch = sc.nextInt();
        switch(ch){
          case 1:
          create1();
          break;
          case 2:
          insertBegin1();
          break;
          case 3:
          insertEnd1();
          break;
          case 4:
          insertAfter1();
          break;
          case 5:
          insertMiddle1();
          break;
          default:
          System.out.println("Invalid Choice!!");
        }
        System.out.println("If you want to insert then press true else false: ");
        iter1 = sc.nextBoolean();
      }
      System.out.println("Enter 1 to merge first linked list with second linked list.");
      System.out.println("Enter 2 to merge second linked list with first linked list.");
      System.out.println("Enter your choice: ");
      ch = sc.nextInt();
      switch(ch){
        case 1:
        Node temp = new Node(0);
        temp.link = start;
        temp = temp.link;
        while(true){
          if(temp.link == null){
            break;
          }else{
            temp = temp.link;
          }
        }
        temp.link = start1;
        display3(start);
        temp.link = null;
        break;
        case 2:
        temp = new Node(0);
        temp.link = start1;
        temp = temp.link;
        while(true){
          if(temp.link == null){
            break;
          }else{
            temp = temp.link;
          }
        }
        temp.link = start;
        display3(start1);
        temp.link = null;
        break;
        default:
        System.out.println("Invalid Choice!!");
      }
      System.out.println("If you want to merge then press true else false: ");
      iter = sc.nextBoolean();
    }
  }

  public void display3(Node start){
    Node temp = new Node(0);
    temp.link = start;
    temp = temp.link;
    System.out.println("Merged linked list is: ");
    while(temp != null){
      System.out.print(temp.data+"--->");
      temp = temp.link;
    }
    System.out.print("null");
    System.out.println();
  }

  public void display1(){
    Node temp = new Node(0);
    temp.link = start1;
    temp = temp.link;
    System.out.println("The second linked list is: ");
    while(temp != null){
      System.out.print(temp.data+"--->");
      temp = temp.link;
    }
    System.out.print("null");
    System.out.println();
  }

  public void create1(){
    int data=0;
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter data for node 1: ");
    data = sc.nextInt();
    Node node = new Node(data);
    System.out.println("Start node "+node.data+" is created!");
    node.link = null;
    start1 = node;
    display1();
  }

  public void insertBegin1(){
    int data=0;
    boolean iter=true;
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    while(iter == true){
      System.out.println("Enter data for node: ");
      data = sc.nextInt();
      Node node = new Node(data);
      System.out.println("Node "+node.data+" is inserted at beginning!");
      node.link = null;
      node.link = start1;
      start1 = node;
      display1();
      System.out.println("If you want to insert at begin then press true else false: ");
      iter = sc.nextBoolean();
    }
  }

  public void insertEnd1(){
    int data=0;
    boolean iter=true;
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    Node temp = new Node(0);
    temp.link = start1;
    temp = temp.link;
    while(iter == true){
      while(temp != null){
        if(temp.link == null){
          break;
        }else{
          temp = temp.link;
        }
      }
      System.out.println("Enter data for node: ");
      data = sc.nextInt();
      Node node = new Node(data);
      System.out.println("Node "+node.data+" is inserted at end!");
      node.link = null;
      temp.link = node;
      display1();
      System.out.println("If you want to insert at end then press true else false: ");
      iter = sc.nextBoolean();
    }
  }

  public void insertAfter1(){
    int data=0, after_node=0;
    boolean iter=true, result=false;
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    while(iter == true){
      System.out.println("Enter after node value: ");
      after_node = sc.nextInt();
      result = nodeCheck1(after_node);
      if(result == true){
        System.out.println("Node "+after_node+" exists!");
        Node temp1 = new Node(0);
        temp1.link = start1;
        temp1 = temp1.link;
        Node temp2 = new Node(0);
        temp2.link = start1;
        temp2 = temp2.link;
        temp2 = temp2.link;
        while(true){
          if(temp1.data == after_node && temp1.link == null){
            System.out.println("Enter data for node: ");
            data = sc.nextInt();
            Node node = new Node(data);
            System.out.println("Node "+node.data+" is inserted after node "+after_node);
            node.link = null;
            temp1.link = node;
            display1();
            break;
          }else if(temp1.data == after_node){
            System.out.println("Enter data for node: ");
            data = sc.nextInt();
            Node node = new Node(data);
            System.out.println("Node "+node.data+" is inserted after node "+after_node);
            node.link = null;
            temp1.link = node;
            node.link = temp2;
            display1();
            break;
          }else{
            temp1 = temp1.link;
            temp2 = temp2.link;
          }
        }
      }else{
        System.out.println("Node "+after_node+" does not exists!");
      }
      System.out.println("If you want to insert after a node then press true else false: ");
      iter = sc.nextBoolean();
    }
  }

  public boolean nodeCheck1(int node){
    Node temp = new Node(0);
    temp.link = start1;
    temp = temp.link;
    while(temp != null){
      if(temp.data == node){
        return true;
      }else{
        temp = temp.link;
      }
    }
    return false;
  }

  public void insertMiddle1(){
    int nn=0, data=0, ch=0;
    boolean iter=true;
    @SuppressWarnings("resource") 
    Scanner sc = new Scanner(System.in);
    while(iter == true){
      nn = numberOfNodes1();
      if(nn%2 != 0){
        Node temp = new Node(0);
        Node temp1 = new Node(0);
        temp.link = start1;
        temp1.link = start1;
        temp1 = temp1.link;
        for(int i=1;i<=nn/2;i++){
          temp = temp.link;
          temp1 = temp1.link;
        }
        System.out.println("Enter data for node: ");
        data = sc.nextInt();
        Node node = new Node(data);
        System.out.println("Node "+node.data+" is inserted at middle!");
        node.link = null;
        temp.link = node;
        node.link = temp1;
        display1();
      }else{
        Node node1 = new Node(0);
        Node node2 = new Node(0);
        Node node3 = new Node(0);
        node1.link = start1;
        node2.link = start1;
        node2 = node2.link;
        node3.link = start1;
        node3 = node3.link;
        node3 = node3.link;
        for(int i=1;i<=(nn/2)-1;i++){
          node1 = node1.link;
          node2 = node2.link;
          node3 = node3.link;
        }
        System.out.println("Enter 1 to insert at first middle.");
        System.out.println("Enter 2 to insert at second middle.");
        System.out.println("Enter your choice: ");
        ch = sc.nextInt();
        switch(ch){
          case 1:
          System.out.println("Enter data for node: ");
          data = sc.nextInt();
          Node node = new Node(data);
          System.out.println("Node "+node.data+" is inserted!");
          node.link = null;
          node1.link = node;
          node.link = node2;
          display1();
          break;
          case 2:
          System.out.println("Enter data for node: ");
          data = sc.nextInt();
          node = new Node(data);
          System.out.println("Node "+node.data+" is inserted!");
          node.link = null;
          node2.link = node;
          node.link = node3;
          display1();
          break;
          default:
          System.out.println("Invalid Choice!!");
        }
      }
      System.out.println("If you want to insert at middle then press true else false: ");
      iter = sc.nextBoolean();
    }
  }

  public int numberOfNodes1(){
    int count=0;
    Node temp = new Node(0);
    temp.link = start1;
    temp = temp.link;
    while(temp != null){
      count = count+1;
      temp = temp.link;
    }
    System.out.println("Number of nodes: "+count);
    return count;
  }

  public void split(){
    int ch=0, node_value=0;
    boolean iter=true, result=false;
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    while(iter == true){
      System.out.println("Enter 1 to split first linked list.");
      System.out.println("Enter 2 to split second linked list.");
      System.out.println("Enter your choice: ");
      ch = sc.nextInt();
      switch(ch){
        case 1:
        System.out.println("Enter node to split linked list: ");
        node_value = sc.nextInt();
        result = nodeCheck(node_value);
        if(result == true){
          System.out.println("Node "+node_value+" exists!");
          Node temp = new Node(0);
          Node temp1 = new Node(0);
          temp.link = start;
          temp = temp.link;
          temp1.link = start;
          temp1 = temp1.link;
          temp1 = temp1.link;
          while(temp != null){
            if(temp.data == node_value){
              break;
            }else{
              temp = temp.link;
              temp1 = temp1.link;
            }
          }
          temp.link = null;
          display4(start, temp1);
          temp.link = temp1;
        }else{
          System.out.println("Node "+node_value+" does not exists!");
        }
        break;
        case 2:
        System.out.println("Enter node to split linked list: ");
        node_value = sc.nextInt();
        result = nodeCheck1(node_value);
        if(result == true){
          System.out.println("Node "+node_value+" exists!");
          Node temp = new Node(0);
          Node temp1 = new Node(0);
          temp.link = start1;
          temp = temp.link;
          temp1.link = start1;
          temp1 = temp1.link;
          temp1 = temp1.link;
          while(temp != null){
            if(temp.data == node_value){
              break;
            }else{
              temp = temp.link;
              temp1 = temp1.link;
            }
          }
          temp.link = null;
          display4(start1, temp1);
          temp.link = temp1;
        }else{
          System.out.println("Node "+node_value+" does not exists!");
        }
        break;
        default:
        System.out.println("Invalid Choice!!");
      }
      System.out.println("If you want to split then press true else false: ");
      iter = sc.nextBoolean();
    }
  }

  public void display4(Node start, Node temp1){
    Node temp = new Node(0);
    temp.link = start;
    temp = temp.link;
    System.out.println("First part of linked list is: ");
    while(temp != null){
      System.out.print(temp.data+"--->");
      temp = temp.link;
    }
    System.out.print("null");
    System.out.println();
    Node temp2 = new Node(0);
    temp2.link = temp1;
    temp2 = temp2.link;
    System.out.println("Second part of linked list is: ");
    while(temp2 != null){
      System.out.print(temp2.data+"--->");
      temp2 = temp2.link;
    }
    System.out.print("null");
    System.out.println();
  }

  public void choice(){
    int ch=0;
    boolean iter=true;
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    while(iter == true){
      System.out.println("Enter 1 to create node.");
      System.out.println("Enter 2 to insert node/s at beginning.");
      System.out.println("Enter 3 to insert node/s at end.");
      System.out.println("Enter 4 to insert a node after a node.");
      System.out.println("Enter 5 to delete a node from beginning.");
      System.out.println("Enter 6 to delete a node from end.");
      System.out.println("Enter 7 to delete a node after a node.");
      System.out.println("Enter 8 to insert a node at middle.");
      System.out.println("Enter 9 to delete a node at middle.");
      System.out.println("Enter 10 to reverse a linked list.");
      System.out.println("Enter 11 to search a node.");
      System.out.println("Enter 12 to merge two linked list.");
      System.out.println("Enter 13 to split the linked list.");
      System.out.println("Enter your choice: ");
      ch = sc.nextInt();
      switch(ch){
        case 1:
        create();
        break;
        case 2:
        insertBegin();
        break;
        case 3:
        insertEnd();
        break;
        case 4:
        insertAfter();
        break;
        case 5:
        deleteBegin();
        break;
        case 6:
        deleteEnd();
        break;
        case 7:
        deleteAfter();
        break;
        case 8:
        insertMiddle();
        break;
        case 9:
        deleteMiddle();
        break;
        case 10:
        reverse();
        break;
        case 11:
        search();
        break;
        case 12:
        merge();
        break;
        case 13:
        split();
        break;
        default:
        System.out.println("Invalid Choice!!");
      }
      System.out.println("If you want to continue then press true else false: ");
      iter = sc.nextBoolean();
    }
  }

  public static void main(String[] args){
    System.out.println("\nFor Object 1: ");
    Single_Linked_List ob1 = new Single_Linked_List();
    ob1.choice();
  }
}
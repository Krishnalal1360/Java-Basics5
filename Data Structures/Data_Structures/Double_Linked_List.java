import java.util.Scanner;

public class Double_Linked_List{
  
  public Node head;
  public Node tail;
  public Node head1;
  public Node tail1;

  public static class Node{

    public int data;
    public Node left;
    public Node right;

    public Node(int data){
      this.data = data;
    }

  }

  public void create(){
    int data=0;
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter data for node 1: ");
    data = sc.nextInt();
    Node node = new Node(data);
    System.out.println("Node "+node.data+" is created!");
    node.left = null;
    node.right = null;
    head = node;
    tail = node;
    display1();
    display2();
  }

  public void display1(){
    Node temp = new Node(0);
    temp.right = head;
    temp = temp.right;
    System.out.println("The traversal of list from head to tail is: ");
    while(temp != null){
      System.out.print(temp.data+"--->");
      temp = temp.right;
    }
    System.out.print("null");
    System.out.println();
  }

  public void display2(){
    Node temp = new Node(0);
    temp.left = tail;
    temp = temp.left;
    System.out.println("The traversal of list from tail to head is: ");
    while(temp != null){
      System.out.print(temp.data+"--->");
      temp = temp.left;
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
      System.out.println("Node "+node.data+" is inserted!");
      node.left = null;
      node.right = null;
      node.right = head;
      Node temp = new Node(0);
      temp.left = tail;
      temp = temp.left;
      while(true){
        if(temp.left == null){
          break;
        }else{
          temp = temp.left;
        }
      }
      temp.left = node;
      head = node;
      display1();
      display2();
      System.out.println("If you want to insert at begin then press true else false: ");
      iter = sc.nextBoolean();
    }
  }

  public void insertEnd(){
    int data=0;
    boolean iter=true;
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    while(iter == true){
      System.out.println("Enter data for node: ");
      data = sc.nextInt();
      Node node = new Node(data);
      System.out.println("Node "+node.data+" is inserted!");
      node.left = null;
      node.right = null;
      node.left = tail;
      Node temp = new Node(0);
      temp.right = head;
      temp = temp.right;
      while(true){
        if(temp.right == null){
          break;
        }else{
          temp = temp.right;
        }
      }
      temp.right = node;
      tail = node;
      display1();
      display2();
      System.out.println("If you want to insert at end then press true else false: ");
      iter = sc.nextBoolean();
    }
  }

  public boolean nodeSearch(int node_value){
    Node temp = new Node(0);
    temp.right = head;
    temp = temp.right;
    while(temp != null){
      if(temp.data == node_value){
        return true;
      }else{
        temp = temp.right;
      }
    }
    return false;
    /*Node temp = new Node(0);
    temp.left = tail;
    temp = temp.left;
    while(temp != null){
      if(temp.data == node_value){
        return true;
      }else{
        temp = temp.left;
      }
    }
    return false;*/
  }

  public void insertAfter(){
    int data=0, node_value=0;
    boolean iter=true, result=false;
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    while(iter == true){
      System.out.println("Enter node value after which new node will be insert: ");
      node_value = sc.nextInt();
      result = nodeSearch(node_value);
      if(result == true){
        System.out.println("Node "+node_value+" exists!");
        Node temp = new Node(0);
        Node temp1 = new Node(0);
        temp.right = head;
        temp = temp.right;
        if(temp.right != null){
          temp1.right = head;
          temp1 = temp1.right;
          temp1 = temp1.right;
        }
        while(true){
          if(temp.data == node_value && temp.right == null){
            System.out.println("You have reached the end of list so insert it at end!");
            insertEnd();
            break;
          }else if(temp.data == node_value){
            break;
          }else{
            temp = temp.right;
            temp1 = temp1.right;
          }
        }
        System.out.println("Enter data for node: ");
        data = sc.nextInt();
        Node node = new Node(data);
        System.out.println("Node "+node.data+" is inserted!");
        node.left = null;
        node.right = null;
        temp.right = node;
        node.right = temp1;
        temp1.left = node;
        node.left = temp;
        display1();
        display2();
      }else{
        System.out.println("Node "+node_value+" does not exists!!");
      }
      System.out.println("If you want to insert after a node then press true else false: ");
      iter = sc.nextBoolean();
    }
  }

  public void insertBefore(){
    int data=0, node_value=0;
    boolean iter=true, result=false;
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    outer:
    while(iter == true){
      System.out.println("Enter node value before which new node will be insert: ");
      node_value = sc.nextInt();
      result = nodeSearch(node_value);
      if(result == true){
        System.out.println("Node "+node_value+" exists!");
        Node temp = new Node(0);
        Node temp1 = new Node(0);
        temp.left = tail;
        temp = temp.left;
        if(temp.left != null){
          temp1.left = tail;
          temp1 = temp1.left;
          temp1 = temp1.left;
        }
        while(true){
          if(temp.data == node_value && temp.left == null){
            System.out.println("You have reached the end of list so insert it at begin!");
            insertBegin();
            break outer;
          }else if(temp.data == node_value){
            break;
          }else{
            temp = temp.left;
            temp1 = temp1.left;
          }
        }
        System.out.println("Enter data for node: ");
        data = sc.nextInt();
        Node node = new Node(data);
        node.left = null;
        node.right = null;
        System.out.println("Node "+node.data+" is inserted!");
        temp.left = node;
        node.left = temp1;
        temp1.right = node;
        node.right = temp;
        display1();
        display2();
      }else{
        System.out.println("Node "+node_value+" does not exists!!");
      }
      System.out.println("If you want to insert before a node then press true else false: ");
      iter = sc.nextBoolean();
    }
  }

  public int numberOfNodes(){
    int count=0;
    Node temp = new Node(0);
    temp.right = head;
    temp = temp.right;
    while(temp != null){
      count = count+1;
      temp = temp.right;
    }
    System.out.println("Number of nodes: "+count);
    return count;
    /*Node temp = new Node(0);
    temp.left = tail;
    temp = temp.left;
    while(temp != null){
      count = count+1;
      temp = temp.left;
    }
    System.out.println("Number of nodes: "+count);
    return count;*/
  }

  public void specialCaseInsertMiddle(int nn){
    int data=0, ch=0;
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    if(nn == 1){
      System.out.println("Inserting node at beginning!");
      insertBegin();
    }else{
      System.out.println("Enter 1 to insert first middle.");
      System.out.println("Enter 2 to insert second middle.");
      System.out.println("Enter your choice: ");
      ch = sc.nextInt();
      switch(ch){
        case 1:
        System.out.println("Inserting node at beginning!");
        insertBegin();
        break;
        case 2:
        System.out.println("Enter data for node: ");
        data = sc.nextInt();
        Node node = new Node(data);
        System.out.println("Node "+node.data+" is inserted!");
        node.left = null;
        node.right = null;
        Node temp = new Node(0);
        Node temp1 = new Node(0);
        temp.right = head;
        temp = temp.right;
        temp1.right = head;
        temp1 = temp1.right;
        temp1 = temp1.right;
        temp.right = node;
        node.right = temp1;
        temp1.left = node;
        node.left = temp;
        display1();
        display2();
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
          temp.right = head;
          temp1.right = head;
          temp1 = temp1.right;
          for(int i=1;i<=nn/2;i++){
            temp = temp.right;
            temp1 = temp1.right;
          }
          System.out.println("Enter data for node: ");
          data = sc.nextInt();
          Node node = new Node(data);
          node.left = null;
          node.right = null;
          temp.right = node;
          node.right = temp1;
          temp1.left = node;
          node.left = temp;
          display1();
          display2();
        }
      }else{
        if(nn == 2){
          specialCaseInsertMiddle(nn);
        }else{
          Node temp = new Node(0);
          Node temp1 = new Node(0);
          Node temp2 = new Node(0);
          temp.right = head;
          temp1.right = head;
          temp1 = temp1.right;
          temp2.right = head;
          temp2 = temp2.right;
          temp2 = temp2.right;
          for(int i=1;i<=(nn/2)-1;i++){
            temp = temp.right;
            temp1 = temp1.right;
            temp2 = temp2.right;
          }
          System.out.println("Enter 1 to insert at first middle.");
          System.out.println("Enter 2 to insert at second middle.");
          System.out.println("Enter your choice: ");
          ch = sc.nextInt();
          switch(ch){
            case 1:
            System.out.println("Enter node for data: ");
            data = sc.nextInt();
            Node node = new Node(data);
            System.out.println("Node "+node.data+" is inserted!");
            node.left = null;
            node.right = null;
            temp.right = node;
            node.right = temp1;
            temp1.left = node;
            node.left = temp;
            display1();
            display2();
            break;
            case 2:
            System.out.println("Enter data for node: ");
            data = sc.nextInt();  
            node = new Node(data);
            System.out.println("Node "+node.data+" is inserted!");
            node.left = null;
            node.right = null;
            temp1.right = node;
            node.right = temp2;
            temp2.left = node;
            node.left = temp1;
            display1();
            display2();
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

  public void deleteBegin(){
    boolean iter=true;
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    while(iter == true){
      Node temp = new Node(0);
      Node temp1 = new Node(0);
      temp.right = head;
      temp = temp.right;
      if(temp.right != null){
        temp1.right = head;
        temp1 = temp1.right;
        temp1 = temp1.right;
      }
      while(true){
        if(temp.right == null){
          System.out.println("Node "+temp.data+" is deleted!");
          temp.left = null;
          temp.right = null;
          head = null;
          tail = null;
          display1();
          display2();
          break;
        }else{
          System.out.println("Node "+temp.data+" is deleted!");
          temp.right = null;
          temp.left = null;
          temp1.left = null;
          head = temp1;
          display1();
          display2();
          break;
        }
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
      temp.right = head;
      temp = temp.right;
      if(temp.right != null){
        temp1.right = head;
        temp1 = temp1.right;
        temp1 = temp1.right;
      }
      while(true){
        if(temp.right == null){
          System.out.println("Node "+temp.data+" is deleted!");
          temp.left = null;
          temp.right = null;
          head = null;
          tail = null;
          display1();
          display2();
          break;
        }else if(temp1.right == null){
          System.out.println("Node "+temp1.data+" is deleted!");
          temp1.left = null;
          temp1.right = null;
          temp.right = null;
          tail = temp;
          display1();
          display2();
          break;
        }else{
          temp = temp.right;
          temp1 = temp1.right;
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
      System.out.println("Enter node value after which node will be deleted: ");
      after_node = sc.nextInt();
      result = nodeSearch(after_node);
      if(result == true){
        System.out.println("Node "+after_node+" exists!");
        Node temp = new Node(0);
        Node temp1 = new Node(0);
        Node temp2 = new Node(0);
        temp.right = head;
        temp = temp.right;
        if(temp.right != null){
          temp1.right = head;
          temp1 = temp1.right;
          temp1 = temp1.right;
        }
        if(temp1.right != null){
          temp2.right = head;
          temp2 = temp2.right;
          temp2 = temp2.right;
          temp2 = temp2.right;
        }
        while(true){
          if(temp.data == after_node && temp.right == null){
            System.out.println("Node does not exists after Node "+temp.data+" !");
            display1();
            display2();
            break;
          }else if(temp.data == after_node && temp1.right == null){
            System.out.println("Deleting last node from the list!");
            deleteEnd();
            break;
          }else if(temp.data == after_node){
            System.out.println("Node "+temp1.data+" is deleted!");
            temp1.left = null;
            temp1.right = null;
            temp.right = temp2;
            temp2.left = temp;
            display1();
            display2();
            break;
          }else{
            temp = temp.right;
            if(temp.right != null){
              temp1 = temp1.right;
            }
            if(temp1.right != null){
              temp2 = temp2.right;
            }
          }
        }
      }else{
        System.out.println("Node "+after_node+" does not exists!!");
      }
      System.out.println("If you want to delete after a node then press true else false: ");
      iter = sc.nextBoolean();
    }
  }

  public void deleteBefore(){
    int before_node=0;
    boolean iter=true, result=false;
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    Node temp = new Node(0);
    Node temp1 = new Node(0);
    Node temp2 = new Node(0);
    temp.left = tail;
    temp = temp.left;
    if(temp.left != null){
      temp1.left = tail;
      temp1 = temp1.left;
      temp1 = temp1.left;
    }
    if(temp1.left != null){
      temp2.left = tail;
      temp2 = temp2.left;
      temp2 = temp2.left;
      temp2 = temp2.left;
    }  
    outer:
    while(iter == true){
      System.out.println("Enter node value before which node will be deleted: ");
      before_node = sc.nextInt();
      result = nodeSearch(before_node);
      if(result == true){
        System.out.println("Node "+before_node+" exists!");
        while(true){
          if(temp.data == before_node && temp.left == null){
            System.out.println("Node does not exists before node "+temp.data+" !");
            display1();
            display2();
            break outer;
          }else if(temp.data == before_node && temp1.left == null){
            System.out.println("Deleting first node from the list!");
            deleteBegin();
            break;
          }else if(temp.data == before_node){
            System.out.println("Node "+temp1.data+" is deleted!");
            temp1.left = null;
            temp1.right = null;
            temp.left = temp2;
            temp2.right = temp;
            display1();
            display2();
            break;
          }else{
            temp = temp.left;
            if(temp.left != null){
              temp1 = temp1.left;
            }
            if(temp1.left != null){
              temp2 = temp2.left;
            }
          }
        }
      }else{
        System.out.println("Node "+before_node+" does not exists!!");
      }
      System.out.println("If you want to delete before a node then press true else false: ");
      iter = sc.nextBoolean();
    }
  }

  public void specialCaseDeleteMiddle(int nn){
    int ch=0;
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    if(nn == 1){
      System.out.println("Deleting first node from the list!");
      deleteBegin();
    }else{
      System.out.println("Enter 1 to delete first middle.");
      System.out.println("Enter 2 to delete second middle.");
      System.out.println("Enter your choice: ");
      ch = sc.nextInt();
      switch(ch){
        case 1:
        System.out.println("Deleting first node from the list!");
        deleteBegin();
        break;
        case 2:
        System.out.println("Deleting second node from the list!");
        deleteEnd();
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
      Node temp = new Node(0);
      Node temp1 = new Node(0);
      Node temp2 = new Node(0);
      Node temp3 = new Node(0);
      temp.right = head;
      temp1.right = head;
      temp1 = temp1.right;
      if(temp1.right != null){
        temp2.right = head;
        temp2 = temp2.right;
        temp2 = temp2.right;
      }
      if(temp2.right != null){
        temp3.right = head;
        temp3 = temp3.right;
        temp3 = temp3.right;
        temp3 = temp3.right;
      }
      nn = numberOfNodes();
      if(nn%2 != 0){
        if(nn == 1){
          specialCaseDeleteMiddle(nn);
        }else{
          for(int i=1;i<=nn/2;i++){
            temp = temp.right;
            temp1 = temp1.right;
            temp2 = temp2.right;
          }
          System.out.println("Node "+temp1.data+" is deleted!");
          temp1.left = null;
          temp1.right = null;
          temp.right = temp2;
          temp2.left = temp;
          display1();
          display2();
        }
      }else{
        if(nn == 2){
          specialCaseDeleteMiddle(nn);
        }else{
          for(int i=1;i<=(nn/2)-1;i++){
            temp = temp.right;
            temp1 = temp1.right;
            temp2 = temp2.right;
            temp3 = temp3.right;
          }
          System.out.println("Enter 1 to delete first middle.");
          System.out.println("Enter 2 to delete second middle.");
          System.out.println("Enter your choice: ");
          ch = sc.nextInt();
          switch(ch){
            case 1:
            System.out.println("Node "+temp1.data+" is deleted!");
            temp1.left = null;
            temp1.right = null;
            temp.right = temp2;
            temp2.left = temp;
            display1();
            display2();
            break;
            case 2:
            System.out.println("Node "+temp2.data+" is deleted!");
            temp2.left = null;
            temp2.right = null;
            temp1.right = temp3;
            temp3.left = temp1;
            display1();
            display2();
            break;
            default:
            System.out.println("Invalid Choice!!");
          }
        }
      }
      System.out.println("If you want to delete at middle then press true else false: ");
      iter = sc.nextBoolean();
    }
  }

  public void searchNode(){
    int search_node=0, index=0;
    boolean iter=true;
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    while(iter == true){
      index = 0;
      System.out.println("Enter node value to be searched: ");
      search_node = sc.nextInt();
      Node temp = new Node(0);
      temp.right = head;
      temp = temp.right;
      while(temp != null){
        if(temp.data == search_node){
          System.out.println("Node "+temp.data+" is found at index "+index);
          display1();
          break;
        }else{
          temp = temp.right;
          index = index+1;
        }
      }
      if(temp == null){
        System.out.println("Node "+search_node+" does not exists!");
        display1();
      }
      System.out.println("If you want to search a node then press true else false: ");
      iter = sc.nextBoolean();
    }
  }

  public void reverseNode(){
    int count=0, index=0;
    boolean iter=true;
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    while(iter == true){
      index = 0;
      count = numberOfNodes();
      int arr[] = new int[count];
      Node temp = new Node(0);
      temp.right = head;
      temp = temp.right;
      while(temp != null){
        arr[index] = temp.data;
        index = index+1;
        temp = temp.right;
      }
      index = index-1;
      temp = new Node(0);
      temp.right = head;
      temp = temp.right;
      while(temp != null){
        temp.data = arr[index];
        temp = temp.right;
        index = index-1;
      }
      System.out.println("Reverse of list.");
      display1();
      System.out.println("If you want to reverse nodes then press true else false: ");
      iter = sc.nextBoolean();
    }
  }

  public void create_second(){
    int data=0;
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter data for node 1: ");
    data = sc.nextInt();
    Node node = new Node(data);
    System.out.println("Node "+node.data+" is created!");
    node.left = null;
    node.right = null;
    head1 = node;
    tail1 = node;
    display1_second();
    display2_second();
  }

  public void display1_second(){
    Node temp = new Node(0);
    temp.right = head1;
    temp = temp.right;
    System.out.println("The traversal of second list from head to tail is: ");
    while(temp != null){
      System.out.print(temp.data+"--->");
      temp = temp.right;
    }
    System.out.print("null");
    System.out.println();
  }

  public void display2_second(){
    Node temp = new Node(0);
    temp.left = tail1;
    temp = temp.left;
    System.out.println("The traversal of second list from tail to head is: ");
    while(temp != null){
      System.out.print(temp.data+"--->");
      temp = temp.left;
    }
    System.out.print("null");
    System.out.println();
  }

  public boolean nodeSearch1(int node_value){
    Node temp = new Node(0);
    temp.right = head1;
    temp = temp.right;
    while(temp != null){
      if(temp.data == node_value){
        return true;
      }else{
        temp = temp.right;
      }
    }
    return false;
    /*Node temp = new Node(0);
    temp.left = tail1;
    temp = temp.left;
    while(temp != null){
      if(temp.data == node_value){
        return true;
      }else{
        temp = temp.left;
      }
    }
    return false;*/
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
      System.out.println("Node "+node.data+" is inserted!");
      node.left = null;
      node.right = null;
      node.right = head1;
      Node temp = new Node(0);
      temp.left = tail1;
      temp = temp.left;
      while(true){
        if(temp.left == null){
          break;
        }else{
          temp = temp.left;
        }
      }
      temp.left = node;
      head1 = node;
      display1_second();
      display2_second();
      System.out.println("If you want to insert at begin then press true else false: ");
      iter = sc.nextBoolean();
    }
  }

  public void insertEnd1(){
    int data=0;
    boolean iter=true;
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    while(iter == true){
      System.out.println("Enter data for node: ");
      data = sc.nextInt();
      Node node = new Node(data);
      System.out.println("Node "+node.data+" is inserted!");
      node.left = null;
      node.right = null;
      node.left = tail1;
      Node temp = new Node(0);
      temp.right = head1;
      temp = temp.right;
      while(true){
        if(temp.right == null){
          break;
        }else{
          temp = temp.right;
        }
      }
      temp.right = node;
      tail1 = node;
      display1_second();
      display2_second();
      System.out.println("If you want to insert at end then press true else false: ");
      iter = sc.nextBoolean();
    }
  }

  public void insertAfter1(){
    int data=0, node_value=0;
    boolean iter=true, result=false;
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    outer:
    while(iter == true){
      System.out.println("Enter node value after which new node will be insert: ");
      node_value = sc.nextInt();
      result = nodeSearch1(node_value);
      if(result == true){
        System.out.println("Node "+node_value+" exists!");
        Node temp = new Node(0);
        Node temp1 = new Node(0);
        temp.right = head1;
        temp = temp.right;
        if(temp.right != null){
          temp1.right = head1;
          temp1 = temp1.right;
          temp1 = temp1.right;
        }
        while(true){
          if(temp.data == node_value && temp.right == null){
            System.out.println("You have reached the end of list so insert it at end!");
            insertEnd1();
            break outer;
          }else if(temp.data == node_value){
            break;
          }else{
            temp = temp.right;
            temp1 = temp1.right;
          }
        }
        System.out.println("Enter data for node: ");
        data = sc.nextInt();
        Node node = new Node(data);
        node.left = null;
        node.right = null;
        System.out.println("Node "+node.data+" is inserted!");
        temp.right = node;
        node.right = temp1;
        temp1.left = node;
        node.left = temp;
        display1_second();
        display2_second();
      }else{
        System.out.println("Node "+node_value+" does not exists!!");
      }
      System.out.println("If you want to insert after a node then press true else false: ");
      iter = sc.nextBoolean();
    }
  }

  public void insertBefore1(){
    int data=0, node_value=0;
    boolean iter=true, result=false;
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    outer:
    while(iter == true){
      System.out.println("Enter node value before which new node will be insert: ");
      node_value = sc.nextInt();
      result = nodeSearch1(node_value);
      if(result == true){
        System.out.println("Node "+node_value+" exists!");
        Node temp = new Node(0);
        Node temp1 = new Node(0);
        temp.left = tail1;
        temp = temp.left;
        if(temp.left != null){
          temp1.left = tail1;
          temp1 = temp1.left;
          temp1 = temp1.left;
        }
        while(true){
          if(temp.data == node_value && temp.left == null){
            System.out.println("You have reached the end of list so insert it at begin!");
            insertBegin1();
            break outer;
          }else if(temp.data == node_value){
            break;
          }else{
            temp = temp.left;
            temp1 = temp1.left;
          }
        }
        System.out.println("Enter data for node: ");
        data = sc.nextInt();
        Node node = new Node(data);
        System.out.println("Node "+node.data+" is inserted!");
        node.left = null;
        node.right = null;
        temp.left = node;
        node.left = temp1;
        temp1.right = node;
        node.right = temp;
        display1_second();
        display2_second();
      }else{
        System.out.println("Node "+node_value+" does not exists!!");
      }
      System.out.println("If you want to insert before a node then press true else false: ");
      iter = sc.nextBoolean();
    }
  }

  public void deleteBegin1(){
    boolean iter=true;
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    while(iter == true){
      Node temp = new Node(0);
      Node temp1 = new Node(0);
      temp.right = head1;
      temp = temp.right;
      if(temp.right != null){
        temp1.right = head1;
        temp1 = temp1.right;
        temp1 = temp1.right;
      }
      while(true){
        if(temp.right == null){
          System.out.println("Node "+temp.data+" is deleted!");
          temp.left = null;
          temp.right = null;
          head1 = null;
          tail1 = null;
          display1_second();
          display2_second();
          break;
        }else{
          System.out.println("Node "+temp.data+" is deleted!");
          temp.right = null;
          temp.left = null;
          temp1.left = null;
          head1 = temp1;
          display1_second();
          display2_second();
          break;
        }
      }
      System.out.println("If you want to delete at begin then press true else false: ");
      iter = sc.nextBoolean();
    }
  }

  public void deleteEnd1(){
    boolean iter=true;
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    while(iter == true){
      Node temp = new Node(0);
      Node temp1 = new Node(0);
      temp.right = head1;
      temp = temp.right;
      if(temp.right != null){
        temp1.right = head1;
        temp1 = temp1.right;
        temp1 = temp1.right;
      }
      while(true){
        if(temp.right == null){
          System.out.println("Node "+temp.data+" is deleted!");
          temp.left = null;
          temp.right = null;
          head1 = null;
          tail1 = null;
          display1_second();
          display2_second();
          break;
        }else if(temp1.right == null){
          System.out.println("Node "+temp1.data+" is deleted!");
          temp1.left = null;
          temp1.right = null;
          temp.right = null;
          tail1 = temp;
          display1_second();
          display2_second();
          break;
        }else{
          temp = temp.right;
          temp1 = temp1.right;
        }
      }
      System.out.println("If you want to delete at end then press true else false: ");
      iter = sc.nextBoolean();
    }
  }

  public void deleteAfter1(){
    int after_node=0;
    boolean iter=true, result=false;
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);  
    while(iter == true){
      System.out.println("Enter node value after which node will be deleted: ");
      after_node = sc.nextInt();
      result = nodeSearch1(after_node);
      if(result == true){
        System.out.println("Node "+after_node+" exists!");
        Node temp = new Node(0);
        Node temp1 = new Node(0);
        Node temp2 = new Node(0);
        temp.right = head1;
        temp = temp.right;
        if(temp.right != null){
          temp1.right = head1;
          temp1 = temp1.right;
          temp1 = temp1.right;
        }
        if(temp1.right != null){
          temp2.right = head1;
          temp2 = temp2.right;
          temp2 = temp2.right;
          temp2 = temp2.right;
        }
        while(true){
          if(temp.data == after_node && temp.right == null){
            System.out.println("Node does not exists after Node "+temp.data+" !");
            display1_second();
            display2_second();
            break;
          }else if(temp.data == after_node && temp1.right == null){
            System.out.println("Deleting last node from the list!");
            deleteEnd1();
            break;
          }else if(temp.data == after_node){
            System.out.println("Node "+temp1.data+" is deleted!");
            temp1.left = null;
            temp1.right = null;
            temp.right = temp2;
            temp2.left = temp;
            display1_second();
            display2_second();
            break;
          }else{
            temp = temp.right;
            if(temp.right != null){
              temp1 = temp1.right;
            }
            if(temp1.right != null){
              temp2 = temp2.right;
            }
          }
        }
      }else{
        System.out.println("Node "+after_node+" does not exists!!");
      }
      System.out.println("If you want to delete after a node then press true else false: ");
      iter = sc.nextBoolean();
    }
  }

  public void deleteBefore1(){
    int before_node=0;
    boolean iter=true, result=false;
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    Node temp = new Node(0);
    Node temp1 = new Node(0);
    Node temp2 = new Node(0);
    temp.left = tail1;
    temp = temp.left;
    if(temp.left != null){
      temp1.left = tail1;
      temp1 = temp1.left;
      temp1 = temp1.left;
    }
    if(temp1.left != null){
      temp2.left = tail1;
      temp2 = temp2.left;
      temp2 = temp2.left;
      temp2 = temp2.left;
    } 
    outer: 
    while(iter == true){
      System.out.println("Enter node value before which node will be deleted: ");
      before_node = sc.nextInt();
      result = nodeSearch1(before_node);
      if(result == true){
        System.out.println("Node "+before_node+" exists!");
        while(true){
          if(temp.data == before_node && temp.left == null){
            System.out.println("Node does not exists before node "+temp.data+" !");
            display1_second();
            display2_second();
            break outer;
          }else if(temp.data == before_node && temp1.left == null){
            System.out.println("Deleting first node from the list!");
            deleteBegin1();
            break;
          }else if(temp.data == before_node){
            System.out.println("Node "+temp1.data+" is deleted!");
            temp1.left = null;
            temp1.right = null;
            temp.left = temp2;
            temp2.right = temp;
            display1_second();
            display2_second();
            break;
          }else{
            temp = temp.left;
            if(temp.left != null){
              temp1 = temp1.left;
            }
            if(temp1.left != null){
              temp2 = temp2.left;
            }
          }
        }
      }else{
        System.out.println("Node "+before_node+" does not exists!!");
      }
      System.out.println("If you want to delete before a node then press true else false: ");
      iter = sc.nextBoolean();
    }
  }

  public void mergeNode(){
    int ch=0;
    boolean iter=true, iter1=true;
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    while(iter == true){
      System.out.println("Second Double Linked List.");
      System.out.println("Enter 1 to create a node.");
      System.out.println("Enter 2 to insert after a node.");
      System.out.println("Enter 3 to insert before a node.");
      System.out.println("Enter 4 to delete after a node.");
      System.out.println("Enter 5 to delete before a node.");
      System.out.println("Enter your choice: ");
      ch = sc.nextInt();
      switch(ch){
        case 1:
        create_second();
        break;
        case 2:
        insertAfter1();
        break;
        case 3:
        insertBefore1();
        break;
        case 4:
        deleteAfter1();
        break;
        case 5:
        deleteBefore1();
        break;
        default:
        System.out.println("Invalid Choice!!");
      }
      System.out.println("If you want to continue for second list then press true else false: ");
      iter = sc.nextBoolean();
    }
    while(iter1 == true){
      System.out.println("Merging two linked list.");
      System.out.println("Enter 1 to merge first list with second list.");
      System.out.println("Enter 2 to merge second list with first list.");
      System.out.println("Enter your choice: ");
      ch = sc.nextInt();
      switch(ch){
        case 1:
        Node temp = new Node(0);
        temp.right = head;
        temp = temp.right;
        while(true){
          if(temp.right == null){
            break;
          }else{
            temp = temp.right;
          }
        }
        temp.right = head1;
        Node temp1 = new Node(0);
        temp1.left = tail1;
        temp1 = temp1.left;
        while(true){
          if(temp1.left == null){
            break;
          }else{
            temp1 = temp1.left;
          }
        } 
        temp1.left = tail;
        display3(head);
        display4(tail1);
        temp.right = null;
        temp1.left = null;
        break;
        case 2:
        temp = new Node(0);
        temp.right = head1;
        temp = temp.right;
        while(true){
          if(temp.right == null){
            break;
          }else{
            temp = temp.right;
          }
        }
        temp.right = head;
        temp1 = new Node(0);
        temp1.left = tail;
        temp1 = temp1.left;
        while(true){
          if(temp1.left == null){
            break;
          }else{
            temp1 = temp1.left;
          }
        }
        temp1.left = tail1;
        display3(head1);
        display4(tail);
        temp.right = null;
        temp1.left = null;
        break;
        default:
        System.out.println("Invalid Choice!!");
      }
      System.out.println("If you want to merge two list then press true else false: ");
      iter1 = sc.nextBoolean();
    }
  }

  public void display3(Node head){
    Node temp = new Node(0);
    temp.right = head;
    temp = temp.right;
    System.out.println("The traversal of merged list from head to tail is: ");
    while(temp != null){
      System.out.print(temp.data+"--->");
      temp = temp.right;
    }
    System.out.print("null");
    System.out.println();
  }

  public void display4(Node tail){
    Node temp = new Node(0);
    temp.left = tail;
    temp = temp.left;
    System.out.println("The traversal of merged list from tail to head is: ");
    while(temp != null){
      System.out.print(temp.data+"--->");
      temp = temp.left;
    }
    System.out.print("null");
    System.out.println();
  }

  public void splitNode(){
    int split_node=0;
    boolean iter=true, result=false;
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    while(iter == true){
      System.out.println("Splitting the list.");
      System.out.println("Enter the node after which the list will be split: ");
      split_node = sc.nextInt();
      result = nodeSearch(split_node);
      if(result == true){
        System.out.println("Node "+split_node+" exists!");
        Node temp = new Node(0);
        temp.right = head;
        temp = temp.right;
        while(true){
          if(temp.data == split_node && temp.right == null){
            System.out.println("You reached the end of list!");
            break;
          }else if(temp.data == split_node){
            head1 = temp.right;
            temp.right = null;
            Node temp1 = new Node(0);
            temp1.left = tail;
            temp1 = temp1.left;
            tail1 = temp1;
            while(true){
              if(temp1 == head1){
                break;
              }else{
                temp1 = temp1.left;
              }
            }
            temp1.left = null;
            tail = temp;
            display5(head, tail, head1, tail1);
            temp.right = head1;
            temp1.left = tail;
            tail = tail1;
            head1 = null;
            tail1 = null;
            break;
          }else{
            temp = temp.right;
          }
        }
      }else{
        System.out.println("Node "+split_node+" does not exists!!");
      }
      System.out.println("If you want to split the list then press true else false: ");
      iter = sc.nextBoolean();
    }
  }

  public void display5(Node head, Node tail, Node head1, Node tail1){
    Node temp = new Node(0);
    temp.right = head;
    temp = temp.right;
    System.out.println("First splitted list.");
    System.out.println("The traversal of first list from head to tail is: ");
    while(temp != null){
      System.out.print(temp.data+"--->");
      temp = temp.right;
    }
    System.out.print("null");
    System.out.println();
    temp = new Node(0);
    temp.left = tail;
    temp = temp.left;
    System.out.println("The traversal of first list from tail to head is: ");
    while(temp != null){
      System.out.print(temp.data+"--->");
      temp = temp.left;
    }
    System.out.print("null");
    System.out.println();

    temp = new Node(0);
    temp.right = head1;
    temp = temp.right;
    System.out.println("Second splitted list.");
    System.out.println("The traversal of second list from head to tail is: ");
    while(temp != null){
      System.out.print(temp.data+"--->");
      temp = temp.right;
    }
    System.out.print("null");
    System.out.println();
    temp = new Node(0);
    temp.left = tail1;
    temp = temp.left;
    System.out.println("The traversal of second list from tail to head is: ");
    while(temp != null){
      System.out.print(temp.data+"--->");
      temp = temp.left;
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
      System.out.println("Enter 1 to create a node.");
      System.out.println("Enter 2 to insert at begin.");
      System.out.println("Enter 3 to insert at end.");
      System.out.println("Enter 4 to insert after a node.");
      System.out.println("Enter 5 to insert before a node.");
      System.out.println("Enter 6 to insert at middle.");
      System.out.println("Enter 7 to delete at begin.");
      System.out.println("Enter 8 to delete at end.");
      System.out.println("Enter 9 to delete after a node.");
      System.out.println("Enter 10 to delete before a node.");
      System.out.println("Enter 11 to delete at middle.");
      System.out.println("Enter 12 to search a node.");
      System.out.println("Enter 13 to reverse nodes.");
      System.out.println("Enter 14 to merge two linked list.");
      System.out.println("Enter 15 to split two linked list.");
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
        insertBefore();
        break;
        case 6:
        insertMiddle();
        break;
        case 7:
        deleteBegin();
        break;
        case 8:
        deleteEnd();
        break;
        case 9:
        deleteAfter();
        break;
        case 10:
        deleteBefore();
        break;
        case 11:
        deleteMiddle();
        break;
        case 12:
        searchNode();
        break;
        case 13:
        reverseNode();
        break;
        case 14:
        mergeNode();
        break;
        case 15:
        splitNode();
        break;
        default:
        System.out.println("Invalid Choice!!");
      }
      System.out.println("If you want to continue then press true else false: ");
      iter = sc.nextBoolean();
    }
  }

  public static void main(String[] args){
    Double_Linked_List ob1 = new Double_Linked_List();
    ob1.choice();
  }
}
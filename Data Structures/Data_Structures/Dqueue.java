import java.util.Scanner;

public class Dqueue{
  
  public int n, ar[], fe, re;

  Dqueue(int nn){
    this.n = nn;
    this.ar = new int[this.n];
    this.fe = -1;
    this.re = -1;
  }

  public void front_insertion(){
    int ele=0;
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("Remainder: The element must be greater than 0.");
    if(this.fe == -1){
      if(this.ar[this.n-1] == -1){
        this.fe = this.n-1;
        System.out.println("Enter element: ");
        ele = sc.nextInt();
        if(ele <= 0){
          System.out.println("Invalid Input!!");
          System.exit(0);
        }else{
          this.ar[this.fe] = ele;
          System.out.println("Element "+this.ar[this.fe]+" is inserted!");
          this.display();
          this.front_rear();
        }
      }else{
        System.out.println("Delete element/s at rear end!");
        this.fe = 0;
      }
    }else if(this.fe == this.re){
      System.out.println("Queue Overflow!!");
      this.display();
      this.front_rear();
      System.exit(0);
    }else{
      System.out.println("Enter element: ");
      ele = sc.nextInt();
      if(ele <= 0){
        System.out.println("Invalid Input!!");
        System.exit(0);
      }else{
        this.ar[this.fe] = ele;
        System.out.println("Element "+this.ar[this.fe]+" is inserted!");
        this.display();
        this.front_rear();
      }
    }
  }

  public void rear_insertion(){
    int ele=0;
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("Remainder: The element must be greater than 0.");
    if(this.re == this.n){
      if(this.ar[0] == -1){
        this.re = 0;
        System.out.println("Enter element: ");
        ele = sc.nextInt();
        if(ele <= 0){
          System.out.println("Invalid Input!!");
          System.exit(0);
        }else{
          this.ar[this.re] = ele;
          System.out.println("Element "+this.ar[this.re]+" is inserted!");
          this.display();
          this.front_rear();
        }
      }else{
        System.out.println("Delete element/s at front end!");
        this.re = this.n-1;
      }
    }else if(this.re == this.fe){
      System.out.println("Queue Overflow!!");
      this.display();
      this.front_rear();
      System.exit(0);
    }else{
      System.out.println("Enter element: ");
      ele = sc.nextInt();
      if(ele <= 0){
        System.out.println("Invalid Input!!");
        System.exit(0);
      }else{
        this.ar[this.re] = ele;
        System.out.println("Element "+this.ar[this.re]+" is inserted!");
        this.display();
        this.front_rear();
      }
    }
  }

  public void front_deletion(){
    if(this.fe == -1 && this.re == -1){
      System.out.println("Queue Empty!!");
      this.display();
      this.front_rear();
      System.exit(0);
    }else if(this.fe == -1){
      this.fe = 0;
      System.out.println("Element "+this.ar[this.fe]+" is deleted!");
      this.ar[this.fe] = -1;
      this.display();
      this.front_rear();
    }else if(this.fe == this.n){
      if(this.ar[0] != -1){
        this.fe = 0;
        System.out.println("Element "+this.ar[this.fe]+" is deleted!");
        this.ar[this.fe] = -1;
        this.display();
        this.front_rear();
      }else{
        System.out.println("Insert element/s at rear end!");
        this.fe = this.n-1;
      }
    }else if(this.fe == this.re+1 && this.re != -1){
      System.out.println("Queue Underflow!!");
      this.display();
      this.front_rear();
      System.exit(0);
    }else{
      System.out.println("Element "+this.ar[this.fe]+" is deleted!");
      this.ar[this.fe] = -1;
      this.display();
      this.front_rear();
    }
  }

  public void rear_deletion(){
    if(this.fe == -1 && this.re == -1){
      System.out.println("Queue Empty!!");
      this.display();
      this.front_rear();
      System.exit(0);
    }else if(this.re == -1){
      if(this.ar[this.n-1] != -1){
        this.re = this.n-1;
        System.out.println("Element "+this.ar[this.re]+" is deleted!");
        this.ar[this.re] = -1;
        this.display();
        this.front_rear();
      }else{
        System.out.println("Insert element/s at front end!");
        this.re = 0;
      }
    }else if(this.re == this.fe-1 && this.fe != this.n-1){
      System.out.println("Queue Underflow!!");
      this.display();
      this.front_rear();
      System.exit(0);
    }else{
      System.out.println("Element "+this.ar[this.re]+" is deleted!");
      this.ar[this.re] = -1;
      this.display();
      this.front_rear();
    }
  } 

  public int search(int ele){
    for(int i=0;i<this.n;i++){
      if(this.ar[i] == ele){
        return i;
      }
    }
    return -1;
  }

  public void peep(){
    int ele=0, ind=0;
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter element: ");
    ele = sc.nextInt();
    ind = search(ele);
    if(ind != -1){
      System.out.println("Element "+ele+" is found at index "+ind);
    }else{
      System.out.println("Element "+ele+" is not found!!");
    }
    this.display();
    this.front_rear();
  }

  public void change(){
    int ele1=0, ele2=0, ind1=0, ind2=0, temp=0;
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first element: ");
    ele1 = sc.nextInt();
    System.out.println("Enter second element: ");
    ele2 = sc.nextInt();
    ind1 = search(ele1);
    ind2 = search(ele2);
    if(ind1 != -1 && ind2 != -1){
      temp = this.ar[ind1];
      this.ar[ind1] = this.ar[ind2];
      this.ar[ind2] = temp;
    }else{
      if(ind1 == -1 && ind2 == -1){
        System.out.println("Both elements are invalid!!");
      }else if(ind1 == -1){
        System.out.println("First element is invalid!!");
      }else{
        System.out.println("Second element is invalid!!");
      }
    }
    this.display();
    this.front_rear();
  }

  public void reverse(){
    int temp=0;
    if((0+this.n-1)%2 == 0){
      for(int i=0;i<(this.n-1)/2;i++){
        temp = this.ar[i];
        this.ar[i] = this.ar[this.n-1-i];
        this.ar[this.n-1-i] = temp;
      }
    }else{
      for(int i=0;i<=(this.n-1)/2;i++){
        temp = this.ar[i];
        this.ar[i] = this.ar[this.n-1-i];
        this.ar[this.n-1-i] = temp;
      }
    }
    this.display();
    this.front_rear();
  }

  public void display(){
    System.out.println("The elements in the queue are: ");
    for(int i=0;i<this.n;i++){
      if(this.ar[i] == 0){
        System.out.print("Empty"+" ");
      }else if(this.ar[i] == -1){
        System.out.print("Deleted"+" ");
      }else{
        System.out.print(this.ar[i]+" ");
      }
    }
    System.out.println();
  }

  public void front_rear(){
    System.out.println("Front End Pointer location: "+this.fe);
    System.out.println("Rear End Pointer location: "+this.re);
  }

  public void choice(){
    int ch=0;
    boolean iter=true;
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    while(iter == true){
      System.out.println("Enter 1 for front-insertion of element into the double ended queue.");
      System.out.println("Enter 2 for rear-insertion of element into the double ended queue.");
      System.out.println("Enter 3 for front-deletion of element from the double ended queue.");
      System.out.println("Enter 4 for rear-deletion of element from the double ended queue.");
      System.out.println("Enter 5 to peep element from the double ended queue.");
      System.out.println("Enter 6 to interchange elements in the double ended queue.");
      System.out.println("Enter 7 to reverse the double ended queue.");
      System.out.println("Enter your choice: ");
      ch = sc.nextInt();
      switch(ch){
        case 1:
        if(this.fe == -1){
          this.fe = this.n-1;
        }else{
          this.fe = this.fe-1;
        }
        front_insertion();
        break;
        case 2:
        this.re = this.re+1;
        rear_insertion();
        break;
        case 3:
        front_deletion();
        this.fe = this.fe+1;
        break;
        case 4:
        rear_deletion();
        this.re = this.re-1;
        break;
        case 5:
        peep();
        break;
        case 6:
        change();
        break;
        case 7:
        reverse();
        break;
        default: 
        System.out.println("Invalid Choice!!");
      }
      System.out.println("If you want to continue then press true else false: ");
      iter = sc.nextBoolean();
    }
  }

  public static void main(String[] args){
    int n=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("\nFor Object 1: ");
    System.out.println("Enter size for the double ended queue: ");
    n = sc.nextInt();
    Dqueue ob1 = new Dqueue(n);
    ob1.choice();
    sc.close();
  }
}
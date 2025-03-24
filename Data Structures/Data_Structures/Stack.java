import java.util.Scanner;

public class Stack{
  
  public int n, ar[], sp;

  Stack(int nn){
    this.n = nn;
    this.ar = new int[this.n];
    this.sp = -1;
  }

  public void push(){
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("Remainder: The element must be greater than 0.");
    if(this.sp == this.n){
      System.out.println("Stack Overflow!!");
      this.display();
      this.stack_pointer();
      System.exit(0);
    }else{
      System.out.println("Enter element: ");
      this.ar[this.sp] = sc.nextInt();
      if(this.ar[this.sp] <= 0){
        System.out.println("Invalid Input!!");
        System.exit(0);
      }else{
        System.out.println("Element "+this.ar[this.sp]+" is pushed!");
        this.display();
        this.stack_pointer();
      }
    }
  }

  public void pop(){
    if(this.sp == -1){
      System.out.println("Stack Underflow!!");
      this.display();
      this.stack_pointer();
      System.exit(0);
    }else{
      System.out.println("Element "+this.ar[this.sp]+" is popped!");
      this.ar[this.sp] = -1;
      this.display();
      this.stack_pointer();
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
    this.stack_pointer();
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
    this.stack_pointer();
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
    this.stack_pointer();
  }

  public void display(){
    System.out.println("The elements in the stack are: ");
    for(int i=this.n-1;i>=0;i--){
      if(this.ar[i] == 0){
        System.out.println("Empty");
      }else if(this.ar[i] == -1){
        System.out.println("Popped");
      }else{
        System.out.println(this.ar[i]);
      }
    }
  }

  public void stack_pointer(){
    System.out.println("Stack Pointer location: "+this.sp);
  }

  public void choice(){
    int ch=0;
    boolean iter=true;
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    while(iter == true){
      System.out.println("Enter 1 to push element into the stack.");
      System.out.println("Enter 2 to pop element from the stack.");
      System.out.println("Enter 3 to peep element from the stack.");
      System.out.println("Enter 4 to interchange elements in the stack.");
      System.out.println("Enter 5 to reverse the stack.");
      System.out.println("Enter your choice: ");
      ch = sc.nextInt();
      switch(ch){
        case 1:
        this.sp = this.sp+1;
        push();
        break;
        case 2:
        pop();
        this.sp = this.sp-1;
        break;
        case 3:
        peep();
        break;
        case 4:
        change();
        break;
        case 5:
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
    System.out.println("Enter size for the stack: ");
    n = sc.nextInt();
    Stack ob1 = new Stack(n);
    ob1.choice();
    sc.close();
  }
}
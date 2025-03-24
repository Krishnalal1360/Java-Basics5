package Stack;

import java.util.Scanner;

public class Push{

  public int n, ar[], sp;

  Push(int n){
    this.n = n;
    this.sp = -1;
    this.ar = new int[this.n];
  }

  public void stack_pointer(){
    System.out.println("Stack Pointer location: "+this.sp);
  }

  public void push(){
    boolean iter=false;
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    this.ar = new int[this.n];
    System.out.println("Remainder: Elements must be greater than 0.");
    System.out.println("If you want to push element into the stack then press true: ");
    iter = sc.nextBoolean();
    if(iter == true){
      this.sp = 0;
    }else{
      System.out.println("Stack Empty!!");
      this.display();
      this.stack_pointer();
    }
    while(iter == true){
      if(this.sp == this.n){
        System.out.println("Stack Overflow!!");
        this.display();
        this.stack_pointer();
        break;
      }else{
        System.out.println("Enter element to push into the stack: ");
        this.ar[this.sp] = sc.nextInt();
        if(this.ar[this.sp] <= 0){
          System.out.println("Element will not be pushed.");
          continue;
        }
        this.display();
        this.stack_pointer();
      }
      System.out.println("If you want to continue then press true/false: ");
      iter = sc.nextBoolean();
      if(iter == true){
        this.sp = this.sp+1;
      }
    }
  }

  public void display(){
    System.out.println("Elements in the stack are: ");
    for(int i=this.n-1;i>=0;i--){
      if(this.ar[i] == 0){
        System.out.println("ar["+i+"]=Empty");
      }else{
        System.out.println("ar["+i+"]="+this.ar[i]);
      }
    }
  }

  public static void main(String[] args){
    int n=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("\nFor Object 1: ");
    System.out.println("Enter size for the stack: ");
    n = sc.nextInt();
    Push ob1 = new Push(n);
    ob1.push();
    sc.close();
  }
}
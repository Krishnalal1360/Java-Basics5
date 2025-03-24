package Stack;

import java.util.Scanner;

public class Pop extends Push{
  
  Pop(int n){
    super(n);
  }

  public void pop(){
    boolean iter=false;
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("If you want to pop element from the stack then press true: ");
    iter = sc.nextBoolean();
    if(iter == true){
      this.push();
      if(this.sp == this.n){
        this.sp = this.n-1;
      }
    }
    while(iter == true){
      if((this.sp == -1) && (this.ar[0] == -1)){
        System.out.println("Stack Underflow!!");
        this.display();
        this.stack_pointer();
        break;
      }else{
        if(this.sp == -1){
          break;
        }
        System.out.println("Element popped is: "+this.ar[this.sp]);
        this.ar[this.sp] = -1;
        this.display();
        this.stack_pointer();
      }
      System.out.println("If you want to continue then press true/false: ");
      iter = sc.nextBoolean();
      if(iter == true){
        this.sp = this.sp-1;
      }
    }
  }

  public static void main(String[] args){
    int n=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("\nFor Object 1: ");
    System.out.println("Enter size for the stack: ");
    n = sc.nextInt();
    Pop ob1 = new Pop(n);
    ob1.pop();
    sc.close();
  }
}

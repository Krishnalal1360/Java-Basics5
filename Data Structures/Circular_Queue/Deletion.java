package Circular_Queue;

import java.util.Scanner;

public class Deletion extends Insertion{

  Deletion(int nn){
    super(nn);
  }

  public void deletion(){
    boolean iter=false;
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("If you want to delete element from the circular queue then press true.");
    iter = sc.nextBoolean();
    while(iter == true){
      if(this.fe == -1 && this.re == -1){
        System.out.println("Circular Queue Empty!!");
        this.display();
        this.front_rear();
        System.out.println("Must insert element/s!");
        this.insertion();
        if(this.ar[0] != 0){
          this.fe = 0;
          continue;
        }else{
          break;
        }
      }else if(this.fe == this.re+1){
        if(this.ar[this.fe] == -1 || this.ar[this.fe] == 0){
          System.out.println("Queue Underflow!!");
          this.display();
          this.front_rear();
          break;
        }else{
          System.out.println("Element deleted is: "+this.ar[this.fe]);
          this.ar[this.fe] = -1;
          this.display();
          this.front_rear();
        }
      }else if(this.fe == this.n && this.re != -1){
        this.fe = 0;
        System.out.println("Element deleted is: "+this.ar[this.fe]);
        this.ar[this.fe] = -1;
        this.display();
        this.front_rear();  
      }else{
        System.out.println("Element deleted is: "+this.ar[this.fe]);
        this.ar[this.fe] = -1;
        this.display();
        this.front_rear();
      }
      System.out.println("If you want to insert then press true else false: ");
      iter = sc.nextBoolean();
      if(iter == true){
        this.re = this.re+1;
        this.insertion();
      }
      System.out.println("If you want to delete then press true else false: ");
      iter = sc.nextBoolean();
      if(iter == true){
        this.fe = this.fe+1;
      }
    }
  }

  public static void main(String[] args){
    int n=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("\nFor Object 1: ");
    System.out.println("Enter size for the circular queue: ");
    n = sc.nextInt();
    Deletion ob1 = new Deletion(n);
    ob1.deletion();
    sc.close();
  }
}

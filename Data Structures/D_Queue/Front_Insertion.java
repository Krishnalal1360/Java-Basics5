package D_Queue;

import java.util.Scanner;

public class Front_Insertion{
  
  public int n, ar[], fe, re;

  Front_Insertion(int nn){
    this.n = nn;
    this.ar = new int[this.n];
    this.fe = -1;
    this.re = -1;
  }

  public void front_rear(){
    System.out.println("Front End Pointer location: "+this.fe);
    System.out.println("Rear End Pointer location: "+this.re);
  }

  public void front_insertion(){
    boolean iter=false;
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("\nFront End Insertion");
    System.out.println("Remainder: The element must be greater than 0.");
    System.out.println("If you want to insert an element into the dqueue then press true: ");
    iter = sc.nextBoolean();
    while(iter == true){
      if(this.fe == -1 && this.ar[this.fe+1] != 0){
        System.out.println("Dqueue Overflow!!");
        this.display();
        this.front_rear();
        this.fe = this.fe+1;
        break;
      }else if(this.fe == -1 && this.re == -1){
        System.out.println("Dqueue is Empty!!");
        this.display();
        this.front_rear();
        this.fe = this.n-1;
        System.out.println("Enter element: ");
        this.ar[this.fe] = sc.nextInt();
        if(this.ar[this.fe] <= 0){
          System.out.println("Element will not be inserted!");
          continue;
        }
        this.display();
        this.front_rear();
      }else if(this.fe == this.re){
        System.out.println("Dqueue Overflow!!");
        this.display();
        this.front_rear();
        this.fe = this.fe+1;
        break;
      }else{
        if(this.ar[this.fe] == 0 || this.ar[this.fe] == -1){
          System.out.println("Enter element: ");
          this.ar[this.fe] = sc.nextInt();
          if(this.ar[this.fe] <= 0){
            System.out.println("Element will not be inserted!");
            continue;
          }
          this.display();
          this.front_rear();
        }else{
          System.out.println("There is already an element exists!");
          System.out.println("Dequeue Overflow!!");
          this.display();
          this.front_rear();
          this.fe = this.fe+1;
          break;
        } 
      }
      System.out.println("If you want to insert at front end then press true else false: ");
      iter = sc.nextBoolean();
      if(iter == true){
        this.fe = this.fe-1;
      }
    }
  }

  public void display(){
    System.out.println("Elements of the Dqueue are: ");
    for(int i=0;i<this.n;i++){
      if(this.ar[i] == 0){
        System.out.print("Empty"+" ");
      }else{
        System.out.print(this.ar[i]+" ");
      }
    }
    System.out.println();
  }

  public static void main(String[] args){
    int n=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("\nFor Object 1: ");
    System.out.println("Enter size for the dqueue: ");
    n = sc.nextInt();
    Front_Insertion ob1 = new Front_Insertion(n);
    ob1.front_insertion();
    sc.close();
  }
}
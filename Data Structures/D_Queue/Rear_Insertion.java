package D_Queue;

import java.util.Scanner;

public class Rear_Insertion extends Front_Insertion{
  
  Rear_Insertion(int nn){
    super(nn);
  }

  public void rear_insertion(){
    boolean iter=false;
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("If you want to insert an element at front end then press true: ");
    iter = sc.nextBoolean();
    if(iter == true){
      this.fe = this.fe-1;
      this.front_insertion();
    }
    System.out.println("\nRear End Insertion");
    System.out.println("Remainder: The element must be greater than 0.");
    System.out.println("If you want to insert an element into the dqueue then press true: ");
    iter = sc.nextBoolean();
    while(iter == true){
      if(this.re == this.n){
        System.out.println("Dqueue Overflow!!");
        this.display();
        this.front_rear();
        this.re = this.re-1;
        break;
      }else if(this.fe == -1 && this.re == -1){
        System.out.println("Dequeue is Empty!!");
        this.display();
        this.front_rear();
        this.re = this.re+1;
        System.out.println("Enter element: ");
        this.ar[this.re] = sc.nextInt();
        if(this.ar[this.re] <= 0){
          System.out.println("Element will not be inserted!");
          continue;
        }
        this.display();
        this.front_rear();
      }else if(this.re == -1){
        this.re = this.re+1;
        if(this.ar[this.re] == 0 || this.ar[this.re] == -1){
          System.out.println("Enter element: ");
          this.ar[this.re] = sc.nextInt();
          if(this.ar[this.re] <= 0){
            System.out.println("Element will not be inserted!");
            continue;
          }
          this.display();
          this.front_rear();
        }else{
          System.out.println("There is already an element exists!");
          System.out.println("Dequeue Overflow!!");
          break;
        }
      }else if(this.re == this.fe){
        System.out.println("Dqueue Overflow!!");
        this.display();
        this.front_rear();
        this.re = this.re-1;
        break;
      }else{
        if(this.ar[this.re] == 0 || this.ar[this.re] == -1){
          System.out.println("Enter element: ");
          this.ar[this.re] = sc.nextInt();
          if(this.ar[this.re] <= 0){
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
          this.re = this.re-1;
          break;
        }
      }
      System.out.println("If you want to insert at front end then press true else false: ");
      iter = sc.nextBoolean();
      if(iter == true){
        if(this.fe == -1){
          this.fe = this.n-1;
        }else{
          this.fe = this.fe-1;
        }
        this.front_insertion();
      }
      System.out.println("If you want to insert at rear end then press true else false: ");
      iter = sc.nextBoolean();
      if(iter == true){
        this.re = this.re+1;
      }
    }
  }

  public static void main(String[] args){
    int n=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("\nFor Object 1: ");
    System.out.println("Enter size for the dqueue: ");
    n = sc.nextInt();
    Rear_Insertion ob1 = new Rear_Insertion(n);
    ob1.rear_insertion();
    sc.close();
  }
}
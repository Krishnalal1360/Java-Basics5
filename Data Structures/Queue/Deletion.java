package Queue;

import java.util.Scanner;

public class Deletion extends Insertion{
  
  Deletion(int nn){
    super(nn);
  }

  public void deletion(){
    boolean iter=false;
    int ele=0;
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("If you want to delete element from the queue then press true: ");
    iter = sc.nextBoolean();
    while(iter == true){
      if(this.re == -1){
        System.out.println("Queue Empty!!");
        this.display();
        this.front_rear();
        System.out.println("Must enter element/s into the queue.");
        this.insertion();
        if(this.ar[0] == 0){
          break;
        }
      }else if(this.fe == this.n){
        System.out.println("Queue Underflow!!");
        this.display();
        this.front_rear();
        break;
      }else{
        ele = this.ar[this.fe];
        System.out.println("Element deleted is: "+ele);
        this.ar[this.fe] = -1;
        this.display();
        this.front_rear();
      }
      System.out.println("If you want to insert then press true/false: ");
      iter = sc.nextBoolean();
      if(iter == true){
        this.insertion1();
      }
      System.out.println("If you want to delete then press true/false: ");
      iter = sc.nextBoolean();
      if(iter == true){
        this.fe = this.fe+1;
      }
    }
  }

  public static void main(String[] args){
    int n=0;
    System.out.println("\nFor Object 1: ");
    Scanner sc = new Scanner(System.in);  
    System.out.println("Enter size for the queue: ");
    n = sc.nextInt();
    Deletion ob1 = new Deletion(n);
    ob1.deletion();
    sc.close();
  }
}

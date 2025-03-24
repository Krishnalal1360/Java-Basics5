package D_Queue;

import java.util.Scanner;

public class Rear_Deletion extends Front_Deletion{
  
  Rear_Deletion(int nn){
    super(nn);
  }

  public void rear_deletion(){
    int ele, flag1=0, flag2=0;
    boolean iter=false;
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("\nNote: Must enter atleast 1 element before deletion.");
    System.out.println("You can either choose to insert via front end or rear end.");
    System.out.println("Otherwise you are not allowed to delete at rear end!");
    System.out.println("If you want to insert at front end then press true else false: ");
    iter = sc.nextBoolean();
    if(iter == true){
      flag1 = 1;
      this.front_insertion();
    }
    System.out.println("If you want to insert at rear end then press true else false: ");
    iter = sc.nextBoolean();
    if(iter == true){
      flag2 = 1;
      this.rear_insertion();
    }
    if(flag1 == 0 && flag2 == 0){
      System.out.println("Dqueue is Empty!!");
      this.display();
      this.front_rear();
      System.exit(0);
    }
    while(iter == true){
      if(this.re == this.n){
        this.re = this.re-1;
        ele = this.ar[this.re];
        if(ele != 0){
          System.out.println("Element deleted is: "+ele);
          this.ar[this.re] = -1;
          this.display();
          this.front_rear();
        }else{
          System.out.println("There is no element to delete at rear end!");
          System.out.println("Must enter element/s at front end!");
          break;
        }
      }else if(this.re == -1){
        if(this.ar[this.n-1] == -1){
          System.out.println("Dqueue Underflow!!");
          this.display();
          this.front_rear();
          this.re = this.re+1;
          break;
        }else{
          System.out.println("Rear End Pointer is out of Dqueue Index!!");
          this.display();
          this.front_rear();
          this.re = this.re+1;
          break;
        }
      }else{
        ele = this.ar[this.re];
        if(ele != 0){
          System.out.println("Element deleted is: "+ele);
          this.ar[this.re] = -1;
          this.display();
          this.front_rear();
        }else{
          if(this.ar[0] == 0){
            System.out.println("Dqueue Underflow!!");
            this.display();
            this.front_rear();
            this.re = this.re+1;
            break;
          }else{
            System.out.println("Rear End Pointer is out of Dqueue Index!!");
            this.display();
            this.front_rear();
            this.re = this.re+1;
            break;
          }
        } 
      }
      System.out.println("If you want to insert at front end then press true else false: ");
      iter = sc.nextBoolean();
      if(iter == true){
        this.fe = this.fe-1;
        this.front_insertion();
      }
      System.out.println("If you want to insert at rear end then press true else false: ");
      iter = sc.nextBoolean();
      if(iter == true){
        this.re = this.re+1;
        this.rear_insertion();
      }
      System.out.println("If you want to delete at front end then press true else false: ");
      iter = sc.nextBoolean();
      if(iter == true){
        this.fe = this.fe+1;
        this.front_deletion();
      }
      System.out.println("If you want to delete at rear end then press true else false: ");
      iter = sc.nextBoolean();
      if(iter == true){
        this.re = this.re-1;
      }
    }
  }

  public static void main(String[] args){
    int n=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("\nFor Object 1: ");
    System.out.println("Enter size for the dqueue: ");
    n = sc.nextInt();
    Rear_Deletion ob1 = new Rear_Deletion(n);
    ob1.rear_deletion();
    sc.close();
  }
}

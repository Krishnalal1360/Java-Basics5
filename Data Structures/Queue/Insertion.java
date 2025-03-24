package Queue;

import java.util.Scanner;

public class Insertion{
  
  public int n, ar[], fe, re;

  Insertion(int nn){
    this.n = nn;
    this.ar = new int[this.n];
    this.fe = this.re = -1;
  }

  public void front_rear(){
    System.out.println("Front: "+this.fe);
    System.out.println("Rear: "+this.re);
  }

  public void insertion1(){
    boolean iter=true;
    System.out.println("Remainder: The element must be greater than 0.");
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    this.re = this.re+1;
    while(iter == true){
      if(this.re >= this.n){
        System.out.println("Queue Overflow!!");
        this.display();
        this.front_rear();
        break;
      }else{
        System.out.println("Enter element: ");
        this.ar[this.re] = sc.nextInt();
        if(this.ar[this.re] <= 0){
          System.out.println("Element will not be inserted!");
          continue;
        }
        this.display();
        this.front_rear();
      }
      System.out.println("If you want to insert then press true/false: ");
      iter = sc.nextBoolean();
      if(iter == true){
        this.re = this.re+1;
      }
    }
  }

  public void insertion(){
    boolean iter=false;
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);  
    System.out.println("Remainder: The element must be greater than 0.");
    System.out.println("If you want to enter elements into the queue then press true: ");
    iter = sc.nextBoolean();
    if(iter == true){
      this.re = 0;
    }
    while(iter == true){
      if(this.re == this.n){
        System.out.println("Queue Overflow!!");
        this.front_rear();
        break;
      }else{
        System.out.println("Enter element to insert into the queue: ");
        this.ar[this.re] = sc.nextInt();
        if(this.ar[this.re] <= 0){
          System.out.println("Element will not be inserted.");
          continue;
        }
        this.display();
        this.front_rear();
      }
      System.out.println("If you want to insert then press true/false: ");
      iter = sc.nextBoolean();  
      if(iter == true){
        this.re = this.re+1;
      }
    }
  }

  public void display(){
    System.out.println("The elements in the queue are: ");
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
    System.out.println("Enter size for the queue: ");
    n = sc.nextInt();
    Insertion ob1 = new Insertion(n);
    ob1.insertion();
    ob1.display();
    sc.close();
  }
}

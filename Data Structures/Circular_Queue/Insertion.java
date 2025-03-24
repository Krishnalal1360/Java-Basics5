package Circular_Queue;

import java.util.Scanner;

public class Insertion{
  
  public int n, ar[], fe, re;

  Insertion(int nn){
    this.n = nn;
    this.ar = new int[this.n];
    this.fe = this.re = -1;
  }

  public void front_rear(){
    System.out.println("Front End Pointer location: "+this.fe);
    System.out.println("Rear End Pointer location: "+this.re);
  }

  public void display(){
    System.out.println("The elements of the circular queue are: ");
    for(int i=0;i<this.n;i++){
      if(this.ar[i] == 0){
        System.out.print("Empty"+" ");
      }else{
        System.out.print(this.ar[i]+" ");
      }
    }
    System.out.println();
  }

  public void insertion(){
    boolean iter=false;
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("If you want to insert element into the circular queue then press true.");
    System.out.println("Remainder: The element must be greater than 0.");
    iter = sc.nextBoolean();
    while(iter == true){
      if(this.fe == -1 && this.re == -1){
        System.out.println("Circular Queue Empty!!");
        this.display();
        this.front_rear();
      }else if(this.re >= this.n && this.fe == -1){
        System.out.println("Circular Queue Overflow!!");
        this.display();
        this.front_rear();
        this.re = this.n-1;
        break;
      }else if(this.re >= this.n && this.fe != -1){
        this.re = 0;
        System.out.println("Enter element: ");
        this.ar[this.re] = sc.nextInt();
        if(this.ar[this.re] <= 0){
          System.out.println("Element will not be inserted!");
          continue;
        }
        this.display();
        this.front_rear();
      }else if(this.re == this.fe+1 && this.fe!= -1){
        System.out.println("Circular Queue Overflow!!");
        this.display();
        this.front_rear();
        this.re = this.re-1;
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
      System.out.println("If you want to insert then press true else false: ");
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
    System.out.println("Enter size for the circular queue: ");
    n = sc.nextInt();
    Insertion ob1 = new Insertion(n);
    ob1.insertion();
    sc.close();
  }
}

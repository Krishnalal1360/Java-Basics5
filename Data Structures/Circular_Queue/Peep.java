package Circular_Queue;

import java.util.Scanner;

public class Peep extends Deletion{
  
  Peep(int nn){
    super(nn);
  }

  public int search(int ele){
    int ind=-1;
    for(int i=0;i<this.n;i++){
      if(ele == this.ar[i]){
        ind = i;
        break;
      }
    }
    return ind;
  }

  public void peep(){
    boolean iter=false;
    int ele=0, ind=0;
    this.deletion();
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("Remainder: The element must be greater than 0.");
    System.out.println("If you want to know the index of an element then press true: ");
    iter = sc.nextBoolean();
    while(iter == true){
      System.out.println("Enter element: ");
      ele = sc.nextInt();
      if(ele <= 0){
        System.out.println("Element "+ele+" cannot be peeped!");
        continue;
      }
      ind = this.search(ele);
      if(ind != -1){
        System.out.println("The element "+ele+" is present at index "+ind);
      }else{
        System.out.println("The element "+ele+" is not present!");
      }
      System.out.println("If you want to continue then press true/false: ");
      iter = sc.nextBoolean();
    }
  }

  public static void main(String[] args){
    int n=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("\nFor Object 1: ");
    System.out.println("Enter the size for the circular queue: ");
    n = sc.nextInt();
    Peep ob1 = new Peep(n);
    ob1.peep();
    sc.close();
  }
}
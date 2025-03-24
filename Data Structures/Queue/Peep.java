package Queue;

import java.util.Scanner;

public class Peep extends Deletion{
  
  Peep(int nn){
    super(nn);
  }

  public int search(int ele){
    int ind=-1;
    for(int i=0;i<this.n;i++){
      if(this.ar[i] == ele){
        ind = i;
        break;
      }
    }
    return ind;
  }

  public void peep(){
    boolean iter=false;
    int ele=0, ind=0;
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("If you want to peep element from the queue then press true: ");
    iter = sc.nextBoolean();
    if(iter == true){
      this.deletion();
    }
    while(iter == true){
      System.out.println("Enter element: ");
      ele = sc.nextInt();
      ind = search(ele);
      if(ind != -1){
        System.out.println("Element "+ele+" is found at index "+ind);
      }else{
        System.out.println("Element "+ele+" is not found!");
      }
      System.out.println("If you want to peep then press true/false: ");
      iter = sc.nextBoolean();
    }
  }

  public static void main(String[] args){
    int n=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("\nFor Object 1: ");
    System.out.println("Enter size for the queue: ");
    n = sc.nextInt();
    Peep ob1 = new Peep(n);
    ob1.peep();
    sc.close();
  }
}

package Stack;

import java.util.Scanner;

public class Peep extends Pop{
  
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
    System.out.println("Remainder: The element must be greater than 0.");
    System.out.println("If you want to know the index of an element from the stack then press true: ");
    iter = sc.nextBoolean();
    if(iter == true){
      this.pop();
    }
    while(iter == true){
      System.out.println("Enter element: ");
      ele = sc.nextInt();
      if(ele <= 0){
        System.out.println("Element cannot be peeped!");
        continue;
      }
      ind = search(ele);
      if(ind != -1){
        System.out.println("Element "+ele+" is found at index "+ind);
      }else{
        System.out.println("Element "+ele+" is not present in the stack!");
      }
      this.display();
      this.stack_pointer();
      System.out.println("If you want to continue then press true/false: ");
      iter = sc.nextBoolean();
    }
  }

  public static void main(String[] args){
    int n=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("\nFor Object 1:");
    System.out.println("Enter size for the stack: ");
    n = sc.nextInt();
    Peep ob1 = new Peep(n);
    ob1.peep();
    sc.close();
  }
}
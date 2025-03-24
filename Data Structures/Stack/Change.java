package Stack;

import java.util.Scanner;

public class Change extends Peep{
  
  Change(int nn){
    super(nn);
  }

  public void interchange(int ele1, int ele2){
    int ind1=0, ind2=0, temp=0;
    ind1 = this.search(ele1);
    ind2 = this.search(ele2);
    if((ind1 == -1) && (ind2 == -1)){
      System.out.println("Both element "+ele1+" and "+ele2+" are not present in the stack!");
    }else if(ind1 == -1){
      System.out.println("First element "+ele1+" is not present in the stack!");
    }else if(ind2 == -1){
      System.out.println("Second element "+ele2+" is not present in the stack!");
    }else{
      temp = this.ar[ind1];
      this.ar[ind1] = this.ar[ind2];
      this.ar[ind2] = temp;
    }
  }

  public void change(){
    boolean iter=false;
    int ele1=0, ele2=0;
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("If you want to interchange elements at two locations then press true: ");
    iter = sc.nextBoolean();
    if(iter == true){
      this.peep();
    }
    while(iter == true){
      System.out.println("Enter first element: ");
      ele1 = sc.nextInt();
      System.out.println("Enter second element: ");
      ele2 = sc.nextInt();
      interchange(ele1, ele2);
      this.display();
      this.stack_pointer();
      System.out.println("If you want to continue then press true/false: ");
      iter = sc.nextBoolean();
    }
  }

  public static void main(String[] args){
    int n=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("\nFor Object 1: ");
    System.out.println("Enter size for the stack: ");
    n = sc.nextInt();
    Change ob1 = new Change(n);
    ob1.change();
    sc.close();
  }
}

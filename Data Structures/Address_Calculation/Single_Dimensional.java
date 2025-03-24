package Address_Calculation;

import java.util.Scanner;

public class Single_Dimensional{

  public int n, ba, l, pa;

  Single_Dimensional(int nn){
    this.n = nn;
    this.l = 0;
  }

  public void display1(byte ar1[]){
    System.out.println("The elements in the array are: ");
    for(int i=0;i<this.n;i++){
      System.out.println("ar1["+i+"]="+ar1[i]);
    }
  }

  public void addCal1(byte ar1[]){
    int w=1, i=0;
    boolean iter=true;
    @SuppressWarnings("resource") 
    Scanner sc = new Scanner(System.in);
    System.out.println("Remainder: The position of element must be in the range of array.");
    System.out.println("Note: The lower index of array is 0.");
    while(iter == true){
      System.out.println("Enter the base address: ");
      this.ba = sc.nextInt();
      System.out.println("Enter the position of element: ");
      i = sc.nextInt();
      if((i < 1) || (i > this.n)){
        System.out.println("Invalid Position!!");
        continue;
      }
      this.pa = this.ba+w*((i-1)-this.l);
      System.out.println("Base address: "+this.ba);
      System.out.println("Element: "+ar1[i-1]);
      System.out.println("Position of element: "+i);
      System.out.println("Width of element: "+w);
      System.out.println("Lower index of array: "+this.l);
      System.out.println("Physical address of element: "+this.pa);
      System.out.println("If you want to continue then press true else false: ");
      iter = sc.nextBoolean();
    }
  }

  public void display2(short ar2[]){
    System.out.println("The elements in the array are: ");
    for(int i=0;i<this.n;i++){
      System.out.println("ar2["+i+"]="+ar2[i]);
    }
  }

  public void addCal2(short ar2[]){
    int w=2, i=0;
    boolean iter=true;
    @SuppressWarnings("resource") 
    Scanner sc = new Scanner(System.in);
    System.out.println("Remainder: The position of element must be in the range of array.");
    System.out.println("Note: The lower index of array is 0.");
    while(iter == true){
      System.out.println("Enter the base address: ");
      this.ba = sc.nextInt();
      System.out.println("Enter the position of element: ");
      i = sc.nextInt();
      if((i < 1) || (i > this.n)){
        System.out.println("Invalid Position!!");
        continue;
      }
      this.pa = this.ba+w*((i-1)-this.l);
      System.out.println("Base address: "+this.ba);
      System.out.println("Element: "+ar2[i-1]);
      System.out.println("Position of element: "+i);
      System.out.println("Width of element: "+w);
      System.out.println("Lower index of array: "+this.l);
      System.out.println("Physical address of element: "+this.pa);
      System.out.println("If you want to continue then press true else false: ");
      iter = sc.nextBoolean();
    }
  }

  public void display3(char ar3[]){
    System.out.println("The elements in the array are: ");
    for(int i=0;i<this.n;i++){
      System.out.println("ar3["+i+"]="+ar3[i]);
    }
  }

  public void addCal3(char ar3[]){
    int w=2, i=0;
    boolean iter=true;
    @SuppressWarnings("resource") 
    Scanner sc = new Scanner(System.in);
    System.out.println("Remainder: The position of element must be in the range of array.");
    System.out.println("Note: The lower index of array is 0.");
    while(iter == true){
      System.out.println("Enter the base address: ");
      this.ba = sc.nextInt();
      System.out.println("Enter the position of element: ");
      i = sc.nextInt();
      if((i < 1) || (i > this.n)){
        System.out.println("Invalid Position!!");
        continue;
      }
      this.pa = this.ba+w*((i-1)-this.l);
      System.out.println("Base address: "+this.ba);
      System.out.println("Element: "+ar3[i-1]);
      System.out.println("Position of element: "+i);
      System.out.println("Width of element: "+w);
      System.out.println("Lower index of array: "+this.l);
      System.out.println("Physical address of element: "+this.pa);
      System.out.println("If you want to continue then press true else false: ");
      iter = sc.nextBoolean();
    }
  }

  public void display4(int ar4[]){
    System.out.println("The elements in the array are: ");
    for(int i=0;i<this.n;i++){
      System.out.println("ar4["+i+"]="+ar4[i]);
    }
  }

  public void addCal4(int ar4[]){
    int w=4, i=0;
    boolean iter=true;
    @SuppressWarnings("resource") 
    Scanner sc = new Scanner(System.in);
    System.out.println("Remainder: The position of element must be in the range of array.");
    System.out.println("Note: The lower index of array is 0.");
    while(iter == true){
      System.out.println("Enter the base address: ");
      this.ba = sc.nextInt();
      System.out.println("Enter the position of element: ");
      i = sc.nextInt();
      if((i < 1) || (i > this.n)){
        System.out.println("Invalid Position!!");
        continue;
      }
      this.pa = this.ba+w*((i-1)-this.l);
      System.out.println("Base address: "+this.ba);
      System.out.println("Element: "+ar4[i-1]);
      System.out.println("Position of element: "+i);
      System.out.println("Width of element: "+w);
      System.out.println("Lower index of array: "+this.l);
      System.out.println("Physical address of element: "+this.pa);
      System.out.println("If you want to continue then press true else false: ");
      iter = sc.nextBoolean();
    }
  }

  public void display5(long ar5[]){
    System.out.println("The elements in the array are: ");
    for(int i=0;i<this.n;i++){
      System.out.println("ar5["+i+"]="+ar5[i]);
    }
  }

  public void addCal5(long ar5[]){
    int w=8, i=0;
    boolean iter=true;
    @SuppressWarnings("resource") 
    Scanner sc = new Scanner(System.in);
    System.out.println("Remainder: The position of element must be in the range of array.");
    System.out.println("Note: The lower index of array is 0.");
    while(iter == true){
      System.out.println("Enter the base address: ");
      this.ba = sc.nextInt();
      System.out.println("Enter the position of element: ");
      i = sc.nextInt();
      if((i < 1) || (i > this.n)){
        System.out.println("Invalid Position!!");
        continue;
      }
      this.pa = this.ba+w*((i-1)-this.l);
      System.out.println("Base address: "+this.ba);
      System.out.println("Element: "+ar5[i-1]);
      System.out.println("Position of element: "+i);
      System.out.println("Width of element: "+w);
      System.out.println("Lower index of array: "+this.l);
      System.out.println("Physical address of element: "+this.pa);
      System.out.println("If you want to continue then press true else false: ");
      iter = sc.nextBoolean();
    }
  }

  public void display6(float ar6[]){
    System.out.println("The elements in the array are: ");
    for(int i=0;i<this.n;i++){
      System.out.println("ar6["+i+"]="+ar6[i]);
    }
  }

  public void addCal6(float ar6[]){
    int w=4, i=0;
    boolean iter=true;
    @SuppressWarnings("resource") 
    Scanner sc = new Scanner(System.in);
    System.out.println("Remainder: The position of element must be in the range of array.");
    System.out.println("Note: The lower index of array is 0.");
    while(iter == true){
      System.out.println("Enter the base address: ");
      this.ba = sc.nextInt();
      System.out.println("Enter the position of element: ");
      i = sc.nextInt();
      if((i < 1) || (i > this.n)){
        System.out.println("Invalid Position!!");
        continue;
      }
      this.pa = this.ba+w*((i-1)-this.l);
      System.out.println("Base address: "+this.ba);
      System.out.println("Element: "+ar6[i-1]);
      System.out.println("Position of element: "+i);
      System.out.println("Width of element: "+w);
      System.out.println("Lower index of array: "+this.l);
      System.out.println("Physical address of element: "+this.pa);
      System.out.println("If you want to continue then press true else false: ");
      iter = sc.nextBoolean();
    }
  }

  public void display7(double ar7[]){
    System.out.println("The elements in the array are: ");
    for(int i=0;i<this.n;i++){
      System.out.println("ar7["+i+"]="+ar7[i]);
    }
  }

  public void addCal7(double ar7[]){
    int w=8, i=0;
    boolean iter=true;
    @SuppressWarnings("resource") 
    Scanner sc = new Scanner(System.in);
    System.out.println("Remainder: The position of element must be in the range of array.");
    System.out.println("Note: The lower index of array is 0.");
    while(iter == true){
      System.out.println("Enter the base address: ");
      this.ba = sc.nextInt();
      System.out.println("Enter the position of element: ");
      i = sc.nextInt();
      if((i < 1) || (i > this.n)){
        System.out.println("Invalid Position!!");
        continue;
      }
      this.pa = this.ba+w*((i-1)-this.l);
      System.out.println("Base address: "+this.ba);
      System.out.println("Element: "+ar7[i-1]);
      System.out.println("Position of element: "+i);
      System.out.println("Width of element: "+w);
      System.out.println("Lower index of array: "+this.l);
      System.out.println("Physical address of element: "+this.pa);
      System.out.println("If you want to continue then press true else false: ");
      iter = sc.nextBoolean();
    }
  }

  public void inputChoice(){
    int ch=0;
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 1 to choose array of byte type.");
    System.out.println("Enter 2 to choose array of short type.");
    System.out.println("Enter 3 to choose array of char type.");
    System.out.println("Enter 4 to choose array of int type.");
    System.out.println("Enter 5 to choose array of long type.");
    System.out.println("Enter 6 to choose array of float type.");
    System.out.println("Enter 7 to choose array of double type.");
    System.out.println("Enter your choice: ");
    ch = sc.nextInt();
    switch(ch){
      case 1: 
      byte ar1[] = new byte[this.n];
      System.out.println("Enter elements for the array.");
      for(int i=0;i<this.n;i++){
        System.out.println("Enter element for index "+i+": ");
        ar1[i] = sc.nextByte();
      }
      display1(ar1);
      addCal1(ar1);
      break;
      case 2:
      short ar2[] = new short[this.n];
      System.out.println("Enter elements for the array.");
      for(int i=0;i<this.n;i++){
        System.out.println("Enter element for index "+i+": ");
        ar2[i] = sc.nextShort();
      }
      display2(ar2);
      addCal2(ar2);
      break;
      case 3:
      char ar3[] = new char[this.n];
      System.out.println("Enter elements for the array.");
      for(int i=0;i<this.n;i++){
        System.out.println("Enter element for index "+i+": ");
        ar3[i] = sc.next().charAt(0);
      }
      display3(ar3);
      addCal3(ar3);
      break;
      case 4:
      int ar4[] = new int[this.n];
      System.out.println("Enter elements for the array.");
      for(int i=0;i<this.n;i++){
        System.out.println("Enter element for index "+i+": ");
        ar4[i] = sc.nextInt();
      }
      display4(ar4);
      addCal4(ar4);
      break;
      case 5:
      long ar5[] = new long[this.n];
      System.out.println("Enter elements for the array.");
      for(int i=0;i<this.n;i++){
        System.out.println("Enter element for index "+i+": ");
        ar5[i] = sc.nextLong();
      }
      display5(ar5);
      addCal5(ar5);
      break;
      case 6:
      float ar6[] = new float[this.n];
      System.out.println("Enter elements for the array.");
      for(int i=0;i<this.n;i++){
        System.out.println("Enter element for index "+i+": ");
        ar6[i] = sc.nextFloat();
      }
      display6(ar6);
      addCal6(ar6);
      break;
      case 7:
      double ar7[] = new double[this.n];
      System.out.println("Enter elements for the array.");
      for(int i=0;i<this.n;i++){
        System.out.println("Enter element for index "+i+": ");
        ar7[i] = sc.nextDouble();
      }
      display7(ar7);
      addCal7(ar7);
      break;
      default:
      System.out.println("Invalid Input!!");
    }
  }
  
  public static void main(String[] args){
    int n=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("\nFor Object 1: ");
    System.out.println("Enter size for the array: ");
    n = sc.nextInt();
    Single_Dimensional ob1 = new Single_Dimensional(n);
    ob1.inputChoice();
    sc.close();
  }
}

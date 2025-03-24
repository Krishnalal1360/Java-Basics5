package Postfix_To_Infix;

import java.util.Scanner;
import java.lang.String;
import java.lang.StringBuffer;
import java.lang.Character;

public class Postfix{
  
  public String postfix="";
  public String ar[], arr[];
  public int n, sp;

  Postfix(String n){
    this.postfix = n;
    this.n = this.postfix.length();
    this.ar = new String[this.n];
    for(int i=0;i<this.n;i++){
      this.ar[i] = Character.toString(this.postfix.charAt(i));
    }
    this.arr = new String[this.n];
    this.sp = -1;
  }

  public void postfix_display(){
    System.out.println("Postfix Expression: "+this.postfix);
    System.out.println("Length of Expression: "+this.n);
    System.out.println("Stack for Expression: ");
    for(int i=this.n-1;i>=0;i--){
      System.out.println("ar["+i+"]="+this.ar[i]);
    }
  }

  public void stack_pointer(){
    System.out.println("Stack Pointer location: "+this.sp);
  }

  public void push(int index, int i){
    this.arr[index] = this.ar[i];
  }

  public void pop(int index1, int index2, int i){
    String op="", op1="", op2="";
    op = this.ar[i];
    op1 = this.arr[index1];
    op2 = this.arr[index2];
    this.arr[index2] = op2.concat(op.concat(op1));
    this.arr[index1] = "-1";
  }

  public void display(){
    System.out.println("Elements in the stack are: ");
    for(int i=this.n-1;i>=0;i--){
      if(this.arr[i] == null){
        System.out.println("arr["+i+"]=Empty");
      }else{
        System.out.println("arr["+i+"]="+this.arr[i]);
      }
    }
  }

  public boolean check(int i){
    if(this.ar[i].equals("*") == false){
      if(this.ar[i].equals("/") == false){
        if(this.ar[i].equals("+") == false){
          if(this.ar[i].equals("-") == false){
            return true;
          }else{
            return false;
          }
        }else{
          return false;
        }
      }else{
        return false;
      }
    }else{
      return false;
    }
  }

  public void infix(){
    int index=0, index1=0, index2=0;
    this.display();
    this.stack_pointer();
    sp = 0;
    for(int i=0;i<this.n-1;i++){
      if(check(i) == true){
        push(index, i);
        this.display();
        this.stack_pointer();
        index = index+1;
        sp = index;
      }else{
        index1 = index-1;
        index2 = index-2;
        pop(index1, index2, i);
        this.display();
        index = index1;
        sp = index;
        this.stack_pointer();
      }
    }
    this.infix_display();
  }

  public void infix_display(){
    System.out.println("Infix Expression: "+this.arr[0]);
  }

  public static void main(String[] args){
    String n="";
    StringBuffer sb = new StringBuffer();
    Scanner sc = new Scanner(System.in);
    System.out.println("\nFor Object 1: ");
    System.out.println("Enter the postfix expression: ");
    n = sc.next();
    sb = new StringBuffer(n);
    n = sb.append(")").toString();
    Postfix ob1 = new Postfix(n);
    ob1.postfix_display();
    ob1.infix();
    sc.close();
  }
}
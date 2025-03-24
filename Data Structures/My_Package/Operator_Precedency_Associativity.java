package My_Package;

public class Operator_Precedency_Associativity{

  public String ar[][];

  public void operators(){
    ar = new String[12][3];
    ar[0][0] = "Category                         ";
    ar[0][1] = "Operator                         ";
    ar[0][2] = "Associativity                    ";
    ar[1][0] = "Parenthesis                      ";
    ar[1][1] = "() [] .                          ";
    ar[1][2] = "Left to Right                    ";
    ar[2][0] = "Unary                            ";
    ar[2][1] = "a++ a-- ++a --a +a -a ! ~ (type) ";
    ar[2][2] = "Right to Left                    ";
    ar[3][0] = "Multiplicative                   ";
    ar[3][1] = "* / %                            ";
    ar[3][2] = "Left to Right                    ";
    ar[4][0] = "Additive                         ";
    ar[4][1] = "+ -                              ";
    ar[4][2] = "Left to Right                    ";
    ar[5][0] = "Shift                            ";
    ar[5][1] = "<< >> >>>                        ";
    ar[5][2] = "Left to Right                    ";
    ar[6][0] = "Relational                       ";
    ar[6][1] = "< <= > >= instanceOf             ";
    ar[6][2] = "Left to Right                    ";
    ar[7][0] = "Equality                         ";
    ar[7][1] = "== !=                            ";
    ar[7][2] = "Left to Right                    ";
    ar[8][0] = "Bitwise                          ";
    ar[8][1] = "& ^ |                            ";
    ar[8][2] = "Left to Right                    ";
    ar[9][0] = "Logical                          ";
    ar[9][1] = "&& ||                            ";
    ar[9][2] = "Left to Right                    ";
    ar[10][0] = "Ternary                         ";
    ar[10][1] = "?:                              ";
    ar[10][2] = "Right to Left                   ";
    ar[11][0] = "Assignment                      ";
    ar[11][1] = "= += -= *= /= %= >>= <<= &= ^= |=";
    ar[11][2] = "Right to Left                   ";
  }

  public void display(){
    for(int i=0;i<ar.length;i++){
      for(int j=0;j<ar[i].length;j++){
        System.out.print(ar[i][j]+"\t");
      }
      System.out.println();
    }
  }

  public static void main(String[] args){
    Operator_Precedency_Associativity ob = new Operator_Precedency_Associativity();
    ob.operators();
    ob.display();
  }
}
package My_Package;

public class Reserved_Keywords{
  
  public String ar[][];

  public void keywords(){
    ar = new String[19][3];
    ar[0][0] = "abstract     ";
    ar[0][1] = "assert       ";
    ar[0][2] = "boolean      ";
    ar[1][0] = "break        ";
    ar[1][1] = "byte         ";
    ar[1][2] = "case         ";
    ar[2][0] = "catch        ";
    ar[2][1] = "char         ";
    ar[2][2] = "class        ";
    ar[3][0] = "continue     ";
    ar[3][1] = "default      ";
    ar[3][2] = "do           ";
    ar[4][0] = "double       ";
    ar[4][1] = "else         ";
    ar[4][2] = "enum         ";
    ar[5][0] = "exports      ";
    ar[5][1] = "extends      ";
    ar[5][2] = "final        ";
    ar[6][0] = "finally      ";
    ar[6][1] = "float        ";
    ar[6][2] = "for          ";
    ar[7][0] = "if           ";
    ar[7][1] = "implements   ";
    ar[7][2] = "import       ";
    ar[8][0] = "instanceof   ";
    ar[8][1] = "int          ";
    ar[8][2] = "interface    ";
    ar[9][0] = "long         ";
    ar[9][1] = "module       ";
    ar[9][2] = "native       ";
    ar[10][0] = "new         ";
    ar[10][1] = "package     ";
    ar[10][2] = "private     ";
    ar[11][0] = "protected   ";
    ar[11][1] = "public      ";
    ar[11][2] = "requires    ";
    ar[12][0] = "return      ";
    ar[12][1] = "short       ";
    ar[12][2] = "static      ";
    ar[13][0] = "strictfp    ";
    ar[13][1] = "super       ";
    ar[13][2] = "switch      ";
    ar[14][0] = "synchronized";
    ar[14][1] = "this        ";
    ar[14][2] = "throw       ";
    ar[15][0] = "throws      ";
    ar[15][1] = "transient   ";
    ar[15][2] = "try         ";
    ar[16][0] = "var         ";
    ar[16][1] = "void        ";
    ar[16][2] = "volatile    ";
    ar[17][0] = "while       ";
    ar[17][1] = "true        ";
    ar[17][2] = "false       ";
    ar[18][0] = "null        ";
    ar[18][1] = "goto        ";
    ar[18][2] = "const       ";
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
    Reserved_Keywords ob = new Reserved_Keywords();
    ob.keywords();
    ob.display();
  }
}

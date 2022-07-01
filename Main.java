import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("Enter Number");
    Scanner sym = new Scanner(System.in);
    int s = sym.nextInt();
    String sy = String.valueOf(s);
    char[] array = sy.toCharArray();
    String out = "";
    int finale = 0;
    for(int i = sy.length() - 1; i >= 0; i--){
      out += array[i];
    }
    finale = Integer.valueOf(out);
    if(finale == s){
      System.out.println("This number is symetrical");
    }
    else{
      System.out.println("This number is not symetrical");
    }
  } 
}
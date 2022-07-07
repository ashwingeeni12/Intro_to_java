import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int out = 0;
    Scanner input_String = new Scanner(System.in);
    String input = input_String.nextLine();
    String alpha = "abcdefghijklnmopqrstuvwxyz";
    for(int i = 0; i < input.length(); i++){
      for(int a = 0; a < alpha.length(); a++){
        if(input.charAt(i) == alpha.charAt(a)){
          out += (a + 1);
        }
      }
    }
    System.out.println(out / input.length());
  } 
}
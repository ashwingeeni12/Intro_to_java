import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner input_ = new Scanner(System.in);
    String input = input_.nextLine();
    char[] array1 = input.toCharArray();
    int out = 0;
    for(int i = 0; i < input.length(); i++){
      out += Character.getNumericValue(array1[i]);
    }
    System.out.println(out/input.length());
  }
}
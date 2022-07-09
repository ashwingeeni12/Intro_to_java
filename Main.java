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
    System.out.println(mean(666));
  }
  public static int mean(int n){
    int mean = 0; 
    int digit = 0;
    int total = 0;
    int count = 0;
    while(n > 0){
      digit = n % 10;
      total += digit;
      n = n / 10;
      count += 1;
    }
    mean = total/count;
    return mean;
  }
}
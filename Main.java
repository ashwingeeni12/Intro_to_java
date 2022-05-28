import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int int_input = scanner.nextInt();
    int sum = 0; 
    while(int_input > 0){
      sum += int_input%10;
      int_input = int_input/10;
    }
    System.out.println(sum);
  }
}
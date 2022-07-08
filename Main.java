import java.util.Scanner;
import java.util.Arrays;
class Main {
  public static void main(String[] args) {
    Scanner input_ = new Scanner(System.in);
    int input = input_.nextInt();
    int output = fib(input);
    if(output <= 0){
      System.out.println("Error");
    }
    else{
      System.out.println(output);
    }
  }
  public static int fib(int input){
    int max = 0;
    int first = 1;
    int second = 1;
    int third = first + second;
    int[] array1 = new int[input];
    array1[0] = first;
    if(input == 1){
      return second;
    }
    array1[1] = second;
    if(input == 2){
      return third;
    }
    array1[2] = third;
    if(input == 3){
      return third + second;
    }
    for(int i = 3; i < array1.length; i++){
      first = second;
      second = third;
      third = first + second;
      array1[i] = third;
      if(i == array1.length - 1){
        max = array1[input - 1] + array1[input - 2];
        break;
      }
    }
  return max;
  }
}
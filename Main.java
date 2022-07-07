import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("Enter 5 numbers");
    Scanner input_Num1 = new Scanner(System.in);
    int num1 = input_Num1.nextInt();
    Scanner input_Num2 = new Scanner(System.in);
    int num2 = input_Num2.nextInt();
    Scanner input_Num3 = new Scanner(System.in);
    int num3 = input_Num3.nextInt();
    Scanner input_Num4 = new Scanner(System.in);
    int num4 = input_Num4.nextInt();
    Scanner input_Num5 = new Scanner(System.in);
    int num5 = input_Num5.nextInt();
    int[] array1 = new int[5];
    array1[0] = num1;
    array1[1] = num2;
    array1[2] = num3;
    array1[3] = num4;
    array1[4] = num5;
    if(array1[1] % array1[0] == 0 && array1[2] % array1[1] == 0 && array1[3] % array1[2] == 0 && array1[4] % array1[3] == 0){
      System.out.println("This is a factor chain");
    }
    else{
      System.out.println("This is not a factor chain");
    }
  }
}
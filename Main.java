import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int outPut = 0;
    Scanner inputOp = new Scanner(System.in);  
    System.out.println("Enter Arithmetic Operation add, mult, div, sub");
    String operation = inputOp.nextLine();
    System.out.println("Enter 1 number");
    int NumOne = inputOp.nextInt();
    System.out.println("Enter Another Number");
    int NumTwo = inputOp.nextInt();
    if (operation.equals("mult")){
      outPut = multiply(NumOne, NumTwo);
    } else if (operation.equals("div")){
      outPut = division(NumOne, NumTwo);
    } else if (operation.equals("add")){
      outPut = addition(NumOne, NumTwo);
    } else if (operation.equals("sub")){
      outPut = subtaction(NumOne, NumTwo);
    }
    System.out.println(outPut);
  }
  public static int multiply(int num_, int num__){
    return num_ * num__;
  }
  public static int addition(int num_, int num__){
    return num_ + num__;
  }
  public static int division(int num_, int num__){
    return num_ / num__;
  }
  public static int subtaction(int num_, int num__){
    return num_ - num__;
  }
}
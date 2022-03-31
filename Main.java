import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner inputOp = new Scanner(System.in);  
    System.out.println("Enter Arithmetic Operation add, mult, div, sub");
    String operation = inputOp.nextLine();
    System.out.println("Enter 1 number");
    int NumOne = inputOp.nextInt();
    System.out.println("Enter Another Number");
    int NumTwo = inputOp.nextInt();
    System.out.println(operation);
    if (operation.equals("mult")){
     System.out.println(NumOne*NumTwo); 
    } else if (operation.equals("div")){
     System.out.println(NumOne/NumTwo); 
    } else if (operation.equals("add")){
     System.out.println(NumOne+NumTwo); 
    } else if (operation.equals("sub")){
     System.out.println(NumOne-NumTwo); 
    }
  } 
}
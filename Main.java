import java.util.Scanner; //Extra 
class Main {
  public static void main(String[] args) {
  Scanner factNum = new Scanner(System.in); //Extra 
  System.out.println("What number do you want to factorialize?"); //Extra 
  int var1 = factNum.nextInt();
  var1 = factorial(var1);
  System.out.println(var1);
  factNum.close(); //Extra 
    }
  static int factorial(int one){
    if (one == 1) 
      return 1;
    else 
      return(one * factorial(one-1)); 
  }

}
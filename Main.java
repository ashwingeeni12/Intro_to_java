import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner input_Int = new Scanner(System.in);
    int input = input_Int.nextInt();
    boolean prime = false;
    int i = 1;
    int[] array1 = new int[input];
    int output = 2;
    for(int a = 2; a >= 2; a++){
      prime = primeC(a);
      if(prime == true){
        if(i < array1.length){
          array1[i] = a;
          output = output * array1[i];
          i++;
        } else{
          System.out.println(output);
          System.exit(0);
        }
      }
    }
  }
  public static boolean primeC(int a){
    int count = 0;
    for(int b = 2; b < a; b++){
      if(a % b != 0){
        count++;
      }
      if(count == a - 2){
        return true; 
      }
    }
    return false;
  }
}
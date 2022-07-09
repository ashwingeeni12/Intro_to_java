import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    // double output = 0;
    // double[] array1 = new double[4];
    // Scanner input_1 = new Scanner(System.in);
    // double input = input_1.nextDouble();
    // array1[0] = input;
    // Scanner input_2 = new Scanner(System.in);
    // double input1 = input_2.nextDouble();
    // array1[1] = input1;
    // Scanner input_3 = new Scanner(System.in);
    // double input2 = input_3.nextDouble();
    // array1[2] = input2;
    // Scanner input_4 = new Scanner(System.in);
    // double input3 = input_4.nextDouble();
    // array1[3] = input3;
    // for(int i = 0; i < array1.length; i++){
    //   output += array1[i];
    // }
    // output = output/array1.length;
    // int out = (int)output;
    // System.out.println(check(out, output));
    int[] num = {1, 2, 3, 4};
    System.out.println(isAvg(num));
  }
  // public static boolean check(int out, double output){
  //   if(out < output && output < out + 1){
  //     return false;
  //   }
  //   return true;
  // }
  public static boolean isAvg(int[] nums){
    double total = 0.0;
    double avg = 0.0;
    double x = 0.0;

    for(int i = 0; i < nums.length; i++){
      total += nums[i];
    }
    avg = toal/nums.length;
    x = (avg * 10) % 10;
    if(x == 0){
      return true;
    }
    return false;
  }
}
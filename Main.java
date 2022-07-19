import java.util.ArrayList;
import java.util.Collections;
class Main {
  public static void main(String[] args){
    ArrayList <Integer> list = new ArrayList <Integer>();
    Collections.addAll(list, -1, -10, 1, -2, 20);
    System.out.println(canPartition(list));
  }
  public static boolean canPartition(ArrayList<Integer> pre){
    Collections.sort(pre, Collections.reverseOrder());
    int largest = pre.get(0);
    int largest2 = pre.get(pre.size() - 1);
    int final_1 = 1;
    int final_2 = 1;
    boolean output = false;
    for(int a = 1; a < pre.size(); a++){
      final_1 = final_1 * pre.get(a);
    }
    if(final_1 == largest){
      output = true;
    }
    for(int a = 0; a < pre.size() - 1; a++){
      final_2 = final_2 * pre.get(a);
    }
    if(final_2 == largest2){
      output = true;
    }
    return output;
  }
}
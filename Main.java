import java.util.ArrayList;
import java.util.Collections;
class Main {
  public static void main(String[] args){
    ArrayList <Integer> nums = new ArrayList<Integer>();
    Collections.addAll(nums, 9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5);
    System.out.println(LargestGap(nums));
  }
  public static int LargestGap(ArrayList<Integer> nums){
    int fcount = 1;
    int gap = 0;
    int gapT = 0;
    Collections.sort(nums);
    for(int i = 0; i < nums.size() - 1; i++){
      gapT = nums.get(fcount) - nums.get(i);
      if(gap < gapT){
        gap = gapT;
      }
      if(fcount < nums.size()){
        fcount++;
      }
      else{
        break;
      }
    }
    return gap;
  }
}
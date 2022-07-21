//Digits Battle

// import java.util.ArrayList;
// class Main {
//   public static void main(String[] args){
//     System.out.println(battle(78925));
//   }
//   public static int battle(int input){
//     int i = 0;
//     int a = 0;
//     String intp = String.valueOf(input);
//     int output1 = 0;
//     String out_ = "";
//     int outputF = 0;
//     ArrayList<Integer> out = new ArrayList<Integer>();
//     ArrayList<Integer> finale = new ArrayList<Integer>();
//     for(int b = 0; b < intp.length(); b++){
//       output1 = Character.getNumericValue(intp.charAt(b));
//       out.add(output1);
//     }
//     while(i < intp.length()){
//       a = i + 1;
//       if(a >= intp.length()){
//         finale.add(out.get(i));
//         for(int b = 0; b < finale.size(); b++){
//           out_ = out_ + finale.get(b);
//         }
//         outputF = Integer.valueOf(out_);
//         return outputF;
//       }
//       if(out.get(i) > out.get(a)){
//          finale.add(out.get(i));
//       } else if(out.get(i) < out.get(a)){
//         finale.add(out.get(a));
//       } else if(out.get(i) == out.get(a)){
//         System.out.println("Skipped");
//      }
//      i = i + 2;
//    }
  
//   for(int b = 0; b < finale.size(); b++){
//     out_ = out_ + finale.get(b);
//   }
//   outputF = Integer.valueOf(out_);
//   return outputF;
//  }
// }

//Reorder Digits

// import java.util.ArrayList;
// import java.util.Collections;
// class Main {
//   public static void main(String[] args){
//     ArrayList<Integer> unsorted = new ArrayList<Integer>();
//     Collections.addAll(unsorted, 1, 2, 3, 4);
//     System.out.println(reorder(unsorted, "asc"));
//   }
//   public static ArrayList<Integer> reorder(ArrayList<Integer> unsorted, String type){
//     ArrayList<Integer> sorted = new ArrayList<Integer>();
//     ArrayList<Integer> sort = new ArrayList<Integer>();
//     String final_ = "";
//     if(type == "asc"){
//       for(int i = 0; i < unsorted.size(); i++){
//         String convert = unsorted.get(i).toString();
//         for(int a = 0; a < convert.length(); a++){
//           sort.add(Character.getNumericValue(convert.charAt(a)));
//         }
//         Collections.sort(sort);
//         for(int a = 0; a < sort.size(); a++){
//           final_ = final_ + sort.get(a);
//         }
//         System.out.println(final_);
//         int output = Integer.parseInt(final_);
//         sorted.add(output);
//         sort.clear();
//         final_ = "";
//       }
//     }
//     if(type == "desc"){
//       for(int i = 0; i < unsorted.size(); i++){
//         String convert = unsorted.get(i).toString();
//         for(int a = 0; a < convert.length(); a++){
//           sort.add(Character.getNumericValue(convert.charAt(a)));
//         }
//         Collections.sort(sort, Collections.reverseOrder());
//         for(int a = 0; a < sort.size(); a++){
//           final_ = final_ + sort.get(a);
//         }
//         System.out.println(final_);
//         int output = Integer.parseInt(final_);
//         sorted.add(output);
//         sort.clear();
//         final_ = "";
//       }
//     }
//     return sorted;
//   } 
// } 

//Product Of Remaining Elements

// import java.util.ArrayList;
// import java.util.Collections;
// class Main {
//   public static void main(String[] args){
//     ArrayList <Integer> list = new ArrayList <Integer>();
//     Collections.addAll(list, 2, 8, 4, 1);
//     System.out.println(canPartition(list));
//   }
//   public static boolean canPartition(ArrayList<Integer> pre){
//     Collections.sort(pre, Collections.reverseOrder());
//     int largest = pre.get(0);
//     int largest2 = pre.get(pre.size() - 1);
//     int final_1 = 1;
//     int final_2 = 1;
//     boolean output = false;
//     for(int a = 1; a < pre.size(); a++){
//       final_1 = final_1 * pre.get(a);
//     }
//     if(final_1 == largest){
//       output = true;
//     }
//     for(int a = 0; a < pre.size() - 1; a++){
//       final_2 = final_2 * pre.get(a);
//     }
//     if(final_2 == largest2){
//       output = true;
//     }
//     return output;
//   }
// } 

//Numbered Cards

// import java.util.ArrayList;
// import java.util.Collections;
// class Main {
//   public static void main(String[] args){
//     ArrayList <Integer> my_cards = new ArrayList<Integer>();
//     Collections.addAll(my_cards, 1, 2, 3, 4, 5);
//     ArrayList <Integer> your_cards = new ArrayList<Integer>();
//     Collections.addAll(your_cards, 9, 8, 7, 6, 5);
//     System.out.println(prodOfRemEle(my_cards, your_cards));
//   }
//   public static boolean prodOfRemEle(ArrayList<Integer> cards1, ArrayList<Integer> cards2){
//     boolean output = false;
//     int largest1_1 = 0;
//     int largest1_2 = 0;
//     int largest2_1 = 0;
//     int largest2_2 = 0;
//     Collections.sort(cards1, Collections.reverseOrder());
//     Collections.sort(cards2, Collections.reverseOrder());
//     largest1_1 = cards1.get(0);
//     largest1_2 = cards1.get(1);
//     largest2_1 = cards2.get(0);
//     largest2_2 = cards2.get(1);
//     String card1_outputPre = String.valueOf(largest1_1) + String.valueOf(largest1_2);
//     String card2_outputPre = String.valueOf(largest2_1) + String.valueOf(largest2_2);
//     int card1_outputF = Integer.valueOf(card1_outputPre);
//     int card2_outputF = Integer.valueOf(card2_outputPre);
//     if(card1_outputF > card2_outputF){
//       output = true;
//     }
//     return output;
//   }
// }

//Largest Gap

// import java.util.ArrayList;
// import java.util.Collections;
// class Main {
//   public static void main(String[] args){
//     ArrayList <Integer> nums = new ArrayList<Integer>();
//     Collections.addAll(nums, 14, 13, 7, 1, 4, 12, 3, 7, 7, 12, 11, 5, 7);
//     System.out.println(LargestGap(nums));
//   }
//   public static int LargestGap(ArrayList<Integer> nums){
//     int fcount = 1;
//     int gap = 0;
//     int gapT = 0;
//     Collections.sort(nums);
//     for(int i = 0; i < nums.size() - 1; i++){
//       gapT = nums.get(fcount) - nums.get(i);
//       if(gap < gapT){
//         gap = gapT;
//       }
//       if(fcount < nums.size()){
//         fcount++;
//       }
//       else{
//         break;
//       }
//     }
//     return gap;
//   }
// } 

// Array Of Multiples

// import java.util.ArrayList;
// import java.util.Collections;
// class Main {
//   public static void main(String[] args){
//     System.out.println(multiple(7, 5));
//   }
//   public static ArrayList<Integer> multiple(int num, int length){
//     ArrayList <Integer> multiples = new ArrayList<Integer>();
//     for(int i = 1; i <= length; i++){
//       multiples.add(num * i);
//     }
//     return multiples;
//   }
// } 
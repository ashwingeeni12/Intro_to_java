// import java.util.ArrayList;
// import java.util.Collections;
// class IceCream{
//   ArrayList<Integer> icecreams = new ArrayList<Integer>();
//   public int level(String flavor, int sprinkles){
//     int count = 0;
//     if(flavor == "Plain"){
//       count = 0 + sprinkles;
//     }
//     if(flavor == "Vanilla"){
//       count = 5 + sprinkles;
//     }
//     if(flavor == "ChocolateChip"){
//       count = 5 + sprinkles;
//     }
//     if(flavor == "Strawberry"){
//       count = 10 + sprinkles;
//     }
//     if(flavor == "Chocolate"){
//       count = 10 + sprinkles;
//     }
//     return count;
//   }
//   public int sweetest(int a, int b, int c, int d, int e){
//     Collections.addAll(icecreams, a, b, c, d, e);
//     Collections.sort(icecreams, Collections.reverseOrder());
//     return icecreams.get(0);
//   }
// }
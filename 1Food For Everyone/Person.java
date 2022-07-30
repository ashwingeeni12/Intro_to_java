// import java.util.ArrayList;
// import java.util.Collections;
// class Person {
//   String name = "Ashwin ";
//   ArrayList <String> Food_Like = new ArrayList<String>();
//   ArrayList <String> Food_DisLike = new ArrayList<String>();
  
//   public String taste(String Food_Name){
//     Collections.addAll(Food_Like, "Pizza", "Cake", "Ice Cream");
//     Collections.addAll(Food_DisLike, "Chips Ahoy", "Okra", "Almonds");
//     String output = "";
//     String likes = " and loves it!";
//     String dislikes = " and hates it!";
//     String e_lse = "!";
//     boolean containsL = false;
//     boolean containsD = false;
//     for(int i = 0; i < Food_Like.size(); i++){
//       if(Food_Name == Food_Like.get(i)){
//         containsL = true;
//       }
//     }
//     for(int b = 0; b < Food_DisLike.size(); b++){
//       if(Food_Name == Food_DisLike.get(b)){
//         containsD = true;
//       }
//     }
//     if(containsD || containsL){
//       if(containsD){
//         output = name + "eats " + Food_Name + dislikes;
//       }
//       else{
//         output = name + "eats " + Food_Name + likes;
//       }
//     }
//     else{
//       output = name + "eats " + Food_Name + e_lse;
//     }
//     return output;
//   }
// }
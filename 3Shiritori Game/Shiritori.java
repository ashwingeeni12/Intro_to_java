// import java.util.ArrayList;
// import java.util.Collections;
// class Shiritori{
//   ArrayList<String> said_words = new ArrayList<String>();
//   boolean game_over = false;
//   boolean previous_wordbool = true;
//   String previous_word = "";
//   public ArrayList<String> play(String current_word){
//     game_over = false;
//     while(game_over == false){
//       if(previous_wordbool){
//         previous_word = current_word;
//         said_words.add(current_word);
//         previous_wordbool = false;
//         break;
//       }
//       for(int i = 0; i < said_words.size(); i++){
//         String word = said_words.get(i);
//         if(word == current_word){
//           game_over = true;
//         }
//       }
//       if(previous_word.charAt(previous_word.length() - 1) == current_word.charAt(0)){
//         said_words.add(current_word);
//         break;
//       }
//       else{
//         game_over = true;
//       }
//     }
//     if(game_over){
//       System.out.println("game over");
//       System.exit(0);
//     }
//     return said_words;
//   }
//   public String restart(){
//     game_over = false;
//     said_words.clear();
//     previous_wordbool = true;
//     return "Game Restarted";
//   }
//   public ArrayList<String> getWords(){
//     return said_words;
//   }
// }
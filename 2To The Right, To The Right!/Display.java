// import java.util.ArrayList;
// import java.util.Collections;
// class Display{
//   public String display(ArrayList<Integer> menu){
//     String output = "[[";
//     for(int a = 0; a < menu.size(); a++){
//       if(a == 0){
//         output = output + menu.get(a) + "]";
//       }
//       else{
//         output = output + ", ";
//         output = output + menu.get(a);
//       }
//     }
//     output = output + "]";
//     return output;
//   }

//   public String to_the_right(String menu_size){
//     int a = 0;
//     int bracketPlace = 0;
//     String brackCheck = "";
//     boolean check = true;
//     for(a = 1; a > 0; a++){
//       brackCheck = "[" + a + "]";
//       bracketPlace = menu_size.indexOf(brackCheck);
//       if(bracketPlace != -1){
//         break;
//       }
//     }
//     StringBuilder output = new StringBuilder(menu_size); 
//     if(a == 1 || a == 2){
//       output.deleteCharAt(bracketPlace);
//       output.deleteCharAt(bracketPlace + 1);
//       output.insert(bracketPlace + 3, '[');
//       output.insert(bracketPlace + 5, ']');
//     }
//     if(a == 3){
//       output.deleteCharAt(bracketPlace);
//       output.deleteCharAt(bracketPlace + 1);
//       output.insert(1, '[');
//       output.insert(3, ']');
//     }
//     return output.toString();
//   }
// }
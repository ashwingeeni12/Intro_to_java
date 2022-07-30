// class Book{
//   String PP = "Pride and Prejudice -Jane Austen"; 
//   String H = "Hamlet -William Shakespeare"; 
//   String WP = "War and Peace -Leo Tolstoy"; 
//   String HP = "Harry Potter -J.K. Rowling";
//   String title = "";
//   String author = "";
//   public Book(String bookname){
//     if(bookname == "PP"){
//       String[] tAndA = PP.split("-");
//       title = tAndA[0];
//       author = tAndA[1];
//     }
//     if(bookname == "H"){
//       String[] tAndA = H.split("-");
//       title = tAndA[0];
//       author = tAndA[1];
//     }
//     if(bookname == "WP"){
//       String[] tAndA = WP.split("-");
//       title = tAndA[0];
//       author = tAndA[1];
//     }
//     if(bookname == "HP"){
//       String[] tAndA = WP.split("-");
//       title = tAndA[0];
//       author = tAndA[1];
//     }
//   }
//   public String get_title(){
//     String def = "Title: ";
//     String out = this.title;
//     return def + out;
//   }
//   public String get_author(){
//     String def = "Author: ";
//     String out = this.author;
//     return def + out;
//   }
// }
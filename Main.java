// //Food For Everyone

// class Main {
//   public static void main(String[] args){
//     String Food = "Okra";
//     Person obj1 = new Person();
//     System.out.println(obj1.taste(Food));
//   }
// }

// // To The Right, To The Right!

// import java.util.ArrayList;
// import java.util.Collections;
// class Main {
//   public static void main(String[] args){
//     ArrayList<Integer> menu = new ArrayList<Integer>();
//     Collections.addAll(menu, 1, 2, 3);
//     Display obj1 = new Display();
//     String display_menu = obj1.display(menu);
//     System.out.println(display_menu);
//     String again = obj1.to_the_right(display_menu);
//     System.out.println(again);
//     String again2 = obj1.to_the_right(again);
//     System.out.println(again2);
//     String again3 = obj1.to_the_right(again2);
//     System.out.println(again3);
//   }
// }

// Shiritori Game

// class Main {
//   public static void main(String[] args){
//     Shiritori obj1 = new Shiritori();
//     System.out.println(obj1.play("movies"));
//     System.out.println(obj1.play("socks"));
//     System.out.println(obj1.play("saxophone"));
//     System.out.println(obj1.restart());
//     System.out.println(obj1.play("hive"));
//     System.out.println(obj1.play("eh"));
//     System.out.println(obj1.getWords());
//     System.out.println(obj1.play("hive"));
//   }
// }

// Big Countries

// class Main{
//   public static void main(String[] args){
//     Country austrailia = new Country("Austrailia", 23545500, 7692024);
//     Country andorra = new Country("Andorra", 76098, 468);
//     System.out.println(austrailia.compare_pd(andorra));
//   }
// }

// The Sweetest Icecream

// class Main{
//   public static void main(String[] args){
//     IceCream obj1 = new IceCream();
//     int ice1 = obj1.level("Chocolate", 13);
//     int ice2 = obj1.level("Vanilla", 0);
//     int ice3 = obj1.level("Strawberry", 7);
//     int ice4 = obj1.level("Plain", 18);
//     int ice5 = obj1.level("ChocolateChip", 3);
//     System.out.println(obj1.sweetest(ice1, ice2, ice3, ice4, ice5));
//   }
// }

// Sports Player Info

// class Main{
//   public static void main(String[] args){
//     PlayerInfo obj1 = new PlayerInfo();
//     obj1.player("David Jones", 25, 175, 75);
//     System.out.println(obj1.get_age());
//     System.out.println(obj1.get_height());
//     System.out.println(obj1.get_weight());
//   }
// }

// Sudoku

class Main{
  public static void main(String[] args){
    Sudoku obj = new Sudoku("417950030000000700060007000050009106800600000000003400900005000000430000200701580");
    obj.print_board();
    System.out.println("");
    System.out.println(obj.get_row(0));
    System.out.println("");
    System.out.println(obj.get_col(0));
    System.out.println("");
    System.out.println(obj.get_square(8));
    System.out.println("");
    System.out.println(obj.get_square(8, 8));
  }
}

// Book Shelf

// class Main{
//   public static void main(String[] args){
//     Book PP = new Book("PP");
//     System.out.println(PP.title);
//     Book H = new Book("H");
//     System.out.println(H.author);
//     Book WP = new Book("WP");
//     System.out.println(H.get_title());
//     Book HP = new Book("HP");    
//     System.out.println(HP.get_author());
//   }
// }
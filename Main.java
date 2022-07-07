import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("Programmer 1 Wage");
    Scanner first = new Scanner(System.in);
    int p1 = first.nextInt();
    System.out.println("Programmer 2 Wage");
    Scanner second = new Scanner(System.in);
    int p2 = first.nextInt();
    System.out.println("Programmer 3 Wage");
    Scanner third = new Scanner(System.in);
    int p3 = third.nextInt();

    int large = 0;
    int small = 0;
    
    if (p1 >= p2 && p1 >= p3) {
      large = p1;
      if (p2>=p3){
        small = p3;
      }else{
        small = p2;
      }
    }
    if (p2 >= p1 && p2 >= p3) {
      large = p2;
      if (p1>=p3){
        small = p3;
      }else{
        small = p1;
      }
    }
    if (p3 >= p2 && p3 >= p1) {
      large = p3;
      if (p2 >= p1){
        small = p1;
      }else{
        small = p2;
      }
    }
  System.out.println(large - small);
  } 
}
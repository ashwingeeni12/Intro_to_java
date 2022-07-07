import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("Enter Price ex. 99.01");
    Scanner price = new Scanner(System.in);
    double p = price.nextDouble();
    System.out.println("Enter Discount ex 50.00");
    Scanner discount = new Scanner(System.in);
    double d = discount.nextDouble();
    System.out.println(output(p, d));
  } 
  public static double output(double p, double d){
    d = d * .01;
    p = p - (p * d);
    double price = Math.round(p * 100.0) / 100.0;
    return price;
  }
}
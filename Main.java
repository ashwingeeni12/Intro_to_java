import java.util.ArrayList;
import java.util.Collections;
class Main{
  public static void main(String[] args){
    ArrayList<String> menu = new ArrayList<String>();
    Collections.addAll(menu, "Coffee - Drink - 3", "Crossaint - Food - 5", "Milkshake - Drink - 3", "Sandwich - Food - 7", "Pina Colada - Drink - 5", "Pesto Pasta - Food - 10");
    CoffeeShop obj = new CoffeeShop("Barsita De Ashwin", menu);
    System.out.println(obj.addOrder("Milkshake"));
    System.out.println(obj.addOrder("Sandwich"));
    System.out.println(obj.fulfillOrder());
    System.out.println(obj.fulfillOrder());
    System.out.println(obj.listOrders());
    System.out.println(obj.dueAmount());
    System.out.println(obj.cheapestItem());
    System.out.println(obj.drinksOnly());
    System.out.println(obj.foodsOnly());
  }
}
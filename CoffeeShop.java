import java.util.ArrayList;
import java.util.Collections;
class CoffeeShop{
  ArrayList<String> itemPrices = new ArrayList<String>();
  String name;
  ArrayList<String> menu = new ArrayList<String>();
  ArrayList<String> orders = new ArrayList<String>();
  ArrayList<String> past_orders = new ArrayList<String>();
  CoffeeShop(String n, ArrayList<String> m){
    name = n;
    menu = m;
  }
  public String addOrder(String item){
    boolean check = false;
    int i = 0;
    for(i = 0; i < menu.size(); i++){
      if(menu.get(i).contains(item)){
        check = true;
        break;
      }
    }
    if(check){
      orders.add(menu.get(i));
      past_orders.add(menu.get(i));
      return "Order Successful!";
    }
    return "Sorry. That item isn't on the menu today.";
  }
  public String fulfillOrder(){
    String output = "All orders have been fulfilled";
    if(orders.size() > 0){
      String temp = orders.get(0);
      String[] array1 = temp.split("- ", 3);
      itemPrices.add(array1[2]);
      output = "The " + array1[0] + "is ready!"; 
      orders.remove(0);
    }
    return output;
  }
  public ArrayList<String> listOrders(){
    return past_orders;
  }
  public String dueAmount(){
    int amount = 0;
    for(int i = 0; i < itemPrices.size(); i++){
      amount = amount + Integer.valueOf(itemPrices.get(i));
    }
    return "$" + "" + amount;
  }
  public String cheapestItem(){
    ArrayList<Integer> arrayC = new ArrayList<Integer>();
    ArrayList<String> items = new ArrayList<String>();
    String def = "The cheapest item(s) are ";
    String output = "";
    for(int i = 0; i < menu.size(); i++){
      String temp = menu.get(i);
      String[] array1 = temp.split("- ", 3);
      arrayC.add(Integer.valueOf(array1[2]));
    }
    Collections.sort(arrayC);
    for(int i = 0; i < menu.size(); i++){
      String temp2 = menu.get(i);
      String temp3 = String.valueOf(arrayC.get(0));
      if(temp2.contains(temp3)){
        String temp = menu.get(i);
        String[] array1 = temp.split(" - ", 3);
        items.add(array1[0]);
      }
    }
    for(int i = 0; i < items.size(); i++){
      if(i == items.size() - 1){
        output = output + items.get(i) + ".";
        break;
      }
      output = output + items.get(i) + ", ";
    }
    return def + output;
  }
  public String drinksOnly(){
    String def = "The drink items are ";
    String output = "";
    ArrayList<String> itemsDrink = new ArrayList<String>();
    for(int i = 0; i < menu.size(); i++){
      String temp2 = menu.get(i);
      String temp3 = "Drink";
      if(temp2.contains(temp3)){
        String temp = menu.get(i);
        String[] array1 = temp.split(" - ", 3);
        itemsDrink.add(array1[0]);
      }
    }
    for(int i = 0; i < itemsDrink.size(); i++){
      if(i == itemsDrink.size() - 1){
        output = output + itemsDrink.get(i) + ".";
        break;
      }
      output = output + itemsDrink.get(i) + ", ";
    }
    return def + output;
  }
  public String foodsOnly(){
    String def = "The food items are ";
    String output = "";
    ArrayList<String> itemsFood = new ArrayList<String>();
    for(int i = 0; i < menu.size(); i++){
      String temp2 = menu.get(i);
      String temp3 = "Food";
      if(temp2.contains(temp3)){
        String temp = menu.get(i);
        String[] array1 = temp.split(" - ", 3);
        itemsFood.add(array1[0]);
      }
    }
    for(int i = 0; i < itemsFood.size(); i++){
      if(i == itemsFood.size() - 1){
        output = output + itemsFood.get(i) + ".";
        break;
      }
      output = output + itemsFood.get(i) + ", ";
    }
    return def + output;
  }
}
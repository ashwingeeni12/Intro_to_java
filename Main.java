class Main {
  public static void main(String[] args) {
    Box Box_1 = new Box();
    Box Box_2 = new Box(3);
    Box Box_3 = new Box(3, 6, 9);
    System.out.println("The volume of Box 1 is " + Box_1.volume());
    System.out.println("The volume of Box 2 is " + Box_2.volume());
    System.out.println("The volume of Box 3 is " + Box_3.volume());
    Plastic Plastic_1 = new Plastic(1);
    Plastic Plastic_2 = new Plastic(6, 4);
    Plastic Plastic_3 = new Plastic(12, 4, 7, 10);
    System.out.println("The volume per lbs of Plastic Box 1 is " + Plastic_1.PlasticVolume());
    System.out.println("The volume per lbs of Plastic Box 2 is " + Plastic_2.PlasticVolume());
    System.out.println("The volume per lbs of Plastic Box 3 is " + Plastic_3.PlasticVolume());
    FoodBox FoodBox_1 = new FoodBox(3, 1);
    FoodBox FoodBox_2 = new FoodBox(3, 4, 4);
    FoodBox FoodBox_3 = new FoodBox(4, 4, 5, 8, 11);
    System.out.println("The volume per lbs times diameter of FoodBox Box 1 is " + FoodBox_1.FoodBoxVolume());
    System.out.println("The volume per lbs times diameter of FoodBox Box 2 is " + FoodBox_2.FoodBoxVolume());
    System.out.println("The volume per lbs times diameter of FoodBox Box 3 is " + FoodBox_3.FoodBoxVolume());
  }
} 
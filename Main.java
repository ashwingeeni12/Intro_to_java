class Main {
  public static void main(String[] args) {
    Box Box_1 = new Box();
    Box Box_2 = new Box(3);
    Box Box_3 = new Box(3, 6, 9);
    System.out.println("The volume of Box 1 is " + Box_1.volume());
    System.out.println("The volume of Box 2 is " + Box_2.volume());
    System.out.println("The volume of Box 3 is " + Box_3.volume());
  }
}
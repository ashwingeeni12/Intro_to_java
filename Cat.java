class Cat extends Mammal implements Animal, interfaceOne{
  public void moves(){
    System.out.println("It can run, walk, jump, and climb!");
  }
  public void eats(){
    System.out.println("It eats/drinks milk, cat food, and mice!");
  }
}
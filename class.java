class Person {
  private int m_numberOfLegs = 2;
  private int m_caloriesBurned = 10; 
  Person(int numberOfLegs,int caloriesBurned){
    m_numberOfLegs = numberOfLegs;
    m_caloriesBurned = caloriesBurned;
  }
  void walkForward(){
    System.out.println("walking forward");
  }
   void walkingBackward(){
    System.out.println("walking Backward");
  }
  int caloriesBurned(){
    return m_caloriesBurned;
  }
}
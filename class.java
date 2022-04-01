class Person {
  private int m_milesWalked = 5;
  private int m_caloriesBurned = 475; 
  Person(int milesWalked,int caloriesBurned){
    m_milesWalked = milesWalked;
    m_caloriesBurned = caloriesBurned;
  }

  Person(){
    
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
  int milesWalked(){
    return m_milesWalked;
  }
}
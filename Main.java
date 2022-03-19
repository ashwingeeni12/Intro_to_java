class Main {
  public static void main(String[] args) {
    int evenSum = 0, oddSum = 0;
    for(int i=0; i<=10; i++){
      if(i%2 == 0){
        evenSum += i;        
      }else{
        oddSum += i;
      }
    }
    System.out.println("even sum = " + evenSum);
    System.out.println("odd sum = " + oddSum);
  } 
}
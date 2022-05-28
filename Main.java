class Main {
  public static void main(String[] args) {
    int[] array1 = {5, 2, 10, 6, 8, 9, 22, 1000, -2, -10000};
    int smallest = array1[0];
    for(int i = 0; i < array1.length; i++){
      if (array1[i] < smallest){
        smallest = array1[i];
      }
    }
    System.out.println(smallest);
  }
}
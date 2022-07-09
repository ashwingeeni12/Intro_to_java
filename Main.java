class Main {
  public static void main(String[] args) {
    System.out.println(Fibonacci(3));
  }
  public static int Fibonacci(int n){
    int[] series = new int[n + 1];
    series[0] = 1;
    series[1] = 1;
    for(int i = 2; i < n + 1; i++){
      series[i] = series[i-1] + series[i-2];
    }
    return series[n];
  }
}
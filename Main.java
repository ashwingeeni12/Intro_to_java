class Main {
  public static void main(String[] args) {
    int var1 = 3;
    int var2 = 2;
    int var3 = 1;
    if (var1 > var2 && var1 > var3) {
      System.out.println("var 1 is the largest");
      if (var2>var3){
        System.out.println("var 2 is the middle");
        System.out.println("var 3 is the smallest");
      }else{
        System.out.println("var 3 is the middle");
        System.out.println("var 2 is the smallest");
      }
    }
    if (var2 > var1 && var2 > var3) {
      System.out.println("var 2 is the largest");
      if (var1>var3){
        System.out.println("var 1 is the middle");
        System.out.println("var 3 is the smallest");
      }else{
        System.out.println("var 3 is the middle");
        System.out.println("var 1 is the smallest");
      }
    }
    if (var3 > var2 && var3>var1) {
      System.out.println("var 3 is the largest");
      if (var2>var1){
        System.out.println("var 2 is the middle");
        System.out.println("var 1 is the smallest");
      }else{
        System.out.println("var 1 is the middle");
        System.out.println("var 2 is the smallest");
      }
    }
  } 
}
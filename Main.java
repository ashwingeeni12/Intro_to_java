import java.util.ArrayList;
class Main {
  public static void main(String[] args){
    System.out.println(battle(78925));
  }
  public static ArrayList<Integer> battle(int input){
    int i = 0;
    int a = 0;
    String intp = String.valueOf(input);
    int output1 = 0;
    ArrayList<Integer> out = new ArrayList<Integer>();
    ArrayList<Integer> finale = new ArrayList<Integer>();
    for(int b = 0; b < intp.length(); b++){
      output1 = Character.getNumericValue(intp.charAt(b));
      out.add(output1);
    }
    while(i < intp.length()){
      System.out.println(out.get(i));
      a = i + 1;
      if(a >= intp.length()){
        finale.add(out.get(i));
        return finale;
      }
      if(out.get(i) > out.get(a)){
         finale.add(out.get(i));
         System.out.println("called1");
      } else if(out.get(i) < out.get(a)){
        finale.add(out.get(a));
        System.out.println("called2");
      } else if(out.get(i) == out.get(a)){
        System.out.println("Skipped");
     }
     i = i + 2;
   }
  return finale;
 }
}
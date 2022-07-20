import java.util.ArrayList;
import java.util.Collections;
class Main {
  public static void main(String[] args){
    System.out.println(multiple(7, 5));
  }
  public static ArrayList<Integer> multiple(int num, int length){
    ArrayList <Integer> multiples = new ArrayList<Integer>();
    for(int i = 1; i <= length; i++){
      multiples.add(num * i);
    }
    return multiples;
  }
}
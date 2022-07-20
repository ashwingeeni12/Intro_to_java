import java.util.ArrayList;
import java.util.Collections;
class Main {
  public static void main(String[] args){
    ArrayList <Integer> my_cards = new ArrayList<Integer>();
    Collections.addAll(my_cards, 2, 5, 2, 6, 9);
    ArrayList <Integer> your_cards = new ArrayList<Integer>();
    Collections.addAll(your_cards, 3, 7, 3, 1, 2);
    System.out.println(prodOfRemEle(my_cards, your_cards));
  }
  public static boolean prodOfRemEle(ArrayList<Integer> cards1, ArrayList<Integer> cards2){
    boolean output = false;
    int largest1_1 = 0;
    int largest1_2 = 0;
    int largest2_1 = 0;
    int largest2_2 = 0;
    Collections.sort(cards1, Collections.reverseOrder());
    Collections.sort(cards2, Collections.reverseOrder());
    largest1_1 = cards1.get(0);
    largest1_2 = cards1.get(1);
    largest2_1 = cards2.get(0);
    largest2_2 = cards2.get(1);
    String card1_outputPre = String.valueOf(largest1_1) + String.valueOf(largest1_2);
    String card2_outputPre = String.valueOf(largest2_1) + String.valueOf(largest2_2);
    int card1_outputF = Integer.valueOf(card1_outputPre);
    int card2_outputF = Integer.valueOf(card2_outputPre);
    if(card1_outputF > card2_outputF){
      output = true;
    }
    return output;
  }
}
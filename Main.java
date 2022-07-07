import java.util.Scanner;
class Main{
  public static void main(String[] args) {
    System.out.println("Player One chose Rock, Paper, or Scissors.");
    Scanner inputOne = new Scanner(System.in);
    String input1 = inputOne.nextLine();
    System.out.println("Player Two chose Rock, Paper, or Scissors.");
    Scanner inputTwo = new Scanner(System.in);
    String input2 = inputTwo.nextLine();

    System.out.println(winner(input1, input2));
  }
  public static String winner(String input1, String input2){
    String output = "test";
    if(input1.equals(input2)){
      output = "TIE";
    } 
    else if(input1.equals("Rock") && input2.equals("Scissors") || input1.equals("Scissors") && input2.equals("Paper") || input1.equals("Paper") && input2.equals("Scissors")){
      output = "Player One Wins";
    } 
    else if(input2.equals("Rock") && input1.equals("Scissors") || input2.equals("Scissors") && input1.equals("Paper") || input2.equals("Paper") && input1.equals("Scissors")){
      output = "Player 2 Wins";
    }
  return output;
  }
}
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int count = 0;
    Scanner inputString = new Scanner(System.in);  
    String UserInput = inputString.nextLine();
    for(int i = 0; i < UserInput.length(); i++){
      if(UserInput.charAt(i) == ' '){
        count++;
      }      
    }
    System.out.println(UserInput.length() - count);
  }
}
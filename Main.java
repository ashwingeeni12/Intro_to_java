import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int count = 0;
    Scanner inputString = new Scanner(System.in);  
    String UserInput = inputString.nextLine();
    for(int i = 0; i < UserInput.length(); i++){
      if(UserInput.charAt(i) == 'a'|| UserInput.charAt(i) == 'e' || UserInput.charAt(i) == 'i' || UserInput.charAt(i) == 'o' || UserInput.charAt(i) == 'u' || UserInput.charAt(i) == 'A' || UserInput.charAt(i) == 'E' || UserInput.charAt(i) == 'I' || UserInput.charAt(i) == 'O' || UserInput.charAt(i) == 'U'){
        count++;
      }      
    }
    System.out.println(count);
  }
}
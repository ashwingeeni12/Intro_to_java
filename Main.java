import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("Enter page from 1 - 37");
    Scanner input_Page = new Scanner(System.in);
    int input = input_Page.nextInt();
    int Chapter1 = 1;
    int Chapter2 = 15;
    int Chapter3 = 37;
    System.out.println(Chapt(Chapter1, Chapter2, Chapter3, input));
  }
  public static String Chapt(int Chapter1, int Chapter2, int Chapter3, int input){
    int out = 0;
    int[] array1 = new int[2];
    int[] array2 = new int[2];
    if(Chapter1 <= input && input < Chapter2){
      out = input - Chapter1;
      array1[0] = out;
      out = Chapter2 - input;
      array1[1] = out;
      if(array1[0] >= array1[1]){
        out = array1[0];
        return "Chapter 2";
      }
      if(array1[0] < array1[1]){
        out = array1[1];
        return "Chapter 1";
      }
    }
    if(Chapter2 <= input && input < Chapter3){
      out = input - Chapter2;
      array2[0] = out;
      out = Chapter3 - input;
      array2[1] = out;
      if(array2[0] >= array2[1]){
        out = array2[0];
        return "Chapter 3";
      }
      if(array2[0] < array2[1]){
        out = array2[1];
        return "Chapter 2";
      }
    }
    if(Chapter3 == input){
      return "Chapter 3";
    }
    return "Out of Bounds"; 
  }
}
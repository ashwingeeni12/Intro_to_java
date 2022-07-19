import java.util.ArrayList;
import java.util.Collections;
class Main {
  public static void main(String[] args){
    ArrayList<Integer> unsorted = new ArrayList<Integer>();
    Collections.addAll(unsorted, 1, 2, 3, 4);
    System.out.println(reorder(unsorted, "asc"));
  }
  public static ArrayList<Integer> reorder(ArrayList<Integer> unsorted, String type){
    ArrayList<Integer> sorted = new ArrayList<Integer>();
    ArrayList<Integer> sort = new ArrayList<Integer>();
    String final_ = "";
    if(type == "asc"){
      for(int i = 0; i < unsorted.size(); i++){
        String convert = unsorted.get(i).toString();
        for(int a = 0; a < convert.length(); a++){
          sort.add(Character.getNumericValue(convert.charAt(a)));
        }
        Collections.sort(sort);
        for(int a = 0; a < sort.size(); a++){
          final_ = final_ + sort.get(a);
        }
        System.out.println(final_);
        int output = Integer.parseInt(final_);
        sorted.add(output);
        sort.clear();
        final_ = "";
      }
    }
    if(type == "desc"){
      for(int i = 0; i < unsorted.size(); i++){
        String convert = unsorted.get(i).toString();
        for(int a = 0; a < convert.length(); a++){
          sort.add(Character.getNumericValue(convert.charAt(a)));
        }
        Collections.sort(sort, Collections.reverseOrder());
        for(int a = 0; a < sort.size(); a++){
          final_ = final_ + sort.get(a);
        }
        System.out.println(final_);
        int output = Integer.parseInt(final_);
        sorted.add(output);
        sort.clear();
        final_ = "";
      }
    }
    return sorted;
  } 
}
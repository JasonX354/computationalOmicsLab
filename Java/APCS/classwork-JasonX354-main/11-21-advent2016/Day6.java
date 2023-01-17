import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Day6 {
  public static void main(String[] args) {
    try {
    File file = new File("Day6.txt");
    for(int i = 0; i < 8; i++) {
      Scanner input = new Scanner(file);
      ArrayList<Character> letters = new ArrayList<Character>();
      while(input.hasNextLine()) {
        String line = input.nextLine();
        letters.add(line.charAt(i));
      }
      int ret = 0;
      int highest = 0;
      for(int ascii = 97; ascii < 123; ascii++) {
        if(counter(letters, ascii) > highest) {
          highest = counter(letters, ascii);
          ret = ascii;
        }
      }
      System.out.print((char)ret);
    }
    System.out.println();
  } catch (FileNotFoundException ex) {
    //
  }
  }
  public static int counter(ArrayList<Character> letters, int target) {
    int count = 0;
    for (int i = 0; i < letters.size(); i++) {
      if(letters.get(i) == target) {
        count++;
      }
    }
    return count;
  }
}

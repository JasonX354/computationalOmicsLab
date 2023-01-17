import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day3 {
  public static boolean makeTriangle(int one, int two, int three) {
    return one + two > three && one + three > two && two + three > one;
  }
  public static void main(String[]args){
    try {
      File file = new File("Day3.txt");
      Scanner input = new Scanner(file);
      int counter = 0;
      int[] triangle = new int[3];
      while (input.hasNextLine()) {
        int one = (input.nextInt());
        int two =(input.nextInt());
        int three = (input.nextInt());
        if(makeTriangle(one, two, three))
        {
          counter++;
        }
        input.nextLine();
      }
      System.out.println(counter);
    }
    catch (FileNotFoundException ex) {
      //File not found
    }
  }
}

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Triangles{

  public static boolean makeTriangle(int one, int two, int three) {
    return one + two > three && one + three > two && two + three > one;
  }

  public static void main(String[]args){
    try {
      File file = new File("inputTri.txt");
      Scanner input = new Scanner(file);
      int counter = 0;
      while (input.hasNextLine()) {
        String line = input.nextLine();
        String[]nums = line.split("x");
        if(makeTriangle(Integer.parseInt(nums[0]), Integer.parseInt(nums[1]), Integer.parseInt(nums[2])))
        {
          counter++;
        }
      }
      //System.out.println(counter);
      input.close();//releases the file from your program
      System.out.println("Amount of valid triangles: " + counter);
    } catch (FileNotFoundException ex) {
      //File not found
    }
  }
}

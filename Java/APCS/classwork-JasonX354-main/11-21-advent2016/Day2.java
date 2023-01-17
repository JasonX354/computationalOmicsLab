import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day2 {
  public static void main(String[]args){
    try {
      File file = new File("Day2.txt");
      Scanner input = new Scanner(file);

      int num = 5;
      while (input.hasNextLine()) {
        String[] directions = input.nextLine().split("");
        for (int i = 0; i < directions.length; i++) {
          if (directions[i].equals("U") && num > 3) {
            num -= 3;
          }
          if (directions[i].equals("D") && num < 7) {
            num += 3;
          }
          if (directions[i].equals("L") && (num - 1) % 3 != 0) {
            num --;
          }
          if (directions[i].equals("R") && num % 3 != 0) {
            num ++;
          }
        }
        System.out.println(num);
      }
    }
    catch (FileNotFoundException ex) {
      //File not found
    }
  }
}

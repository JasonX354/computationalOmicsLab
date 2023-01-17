import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day1 {
  public static void main(String[]args){
    try {
      File file = new File("Day1.txt");
      Scanner input = new Scanner(file);

      int direction = 1;
      int sumx = 0;
      int sumy = 0;
      String line = input.nextLine();
      String[] inputs = line.split(", ");
      for(int i = 0; i < inputs.length; i++) {
        if(inputs[i].substring(0,1).equals("L")) {
          direction+= 3;
        }
        if(inputs[i].substring(0,1).equals("R")) {
          direction++;
        }
        if(direction%4 == 0) {
          sumy += Integer.parseInt(inputs[i].substring(1));
        } else
        if(direction%4 == 1) {
          sumx += Integer.parseInt(inputs[i].substring(1));
        }
        if(direction%4 == 2) {
          sumy -= Integer.parseInt(inputs[i].substring(1));
        }
        if(direction%4 == 3) {
          sumx -= Integer.parseInt(inputs[i].substring(1));
        }
        }
      System.out.println(Math.abs(sumx) + Math.abs(sumy));
      }
      catch (FileNotFoundException ex) {
      //File not found
    }
  }
}

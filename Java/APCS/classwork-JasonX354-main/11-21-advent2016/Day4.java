import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day4 {

  public static String MostCommon(String word, String noContain0, String noContain1, String noContain2, String noContain3) {
    int highest = 0;
    String letter = "a";
    for (int i = 0; i < word.length() - 10; i++) {
      int occur = 0;
      for (int j = 0; j < word.length() - 10; j++) {
        if (word.substring(i, i + 1).equals(word.substring(j, j + 1))) {
          if ((!(word.substring(i, i + 1).equals(noContain0)) && !(word.substring(i, i + 1).equals(noContain1)) && !(word.substring(i, i + 1).equals(noContain2)) && !(word.substring(i, i + 1).equals(noContain3))) && !(word.substring(i, i + 1).equals("-"))) {
            occur++;
          }
        }
      }
      if (occur == highest) {
        if (word.charAt(i) < letter.charAt(0)) {
          highest = occur;
          letter = word.substring(i, i + 1);
        }
      }
      if (occur > highest) {
        highest = occur;
        letter = word.substring(i, i + 1);
      }
    }
    return letter;
  }

  public static void main(String[]args){
    try {
      File file = new File("Day4.txt");
      Scanner input = new Scanner(file);

      int sum = 0;

      while (input.hasNextLine()) {
        String line = input.next();
        String one = MostCommon(line, "", "", "", "");
        String two = MostCommon(line, one, "", "", "");
        String three = MostCommon(line, one, two, "", "");
        String four = MostCommon(line, one, two, three, "");
        String five = MostCommon(line, one, two, three, four);
        if (line.substring(line.length() - 6, line.length() - 5).equals(one) && line.substring(line.length() - 5, line.length() - 4).equals(two) && line.substring(line.length() - 4, line.length() - 3).equals(three) && line.substring(line.length() - 3, line.length() - 2).equals(four) && line.substring(line.length() - 2, line.length() - 1).equals(five)) {
          sum += Integer.parseInt(line.substring(line.length() - 10, line.length() - 7));
        }
        input.nextLine();
      }
      System.out.println(sum);
    }
    catch (FileNotFoundException ex) {
      //File not found
    }
  }
}

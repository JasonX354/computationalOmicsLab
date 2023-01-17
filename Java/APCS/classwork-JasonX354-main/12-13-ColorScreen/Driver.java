public class Driver {
  public static void main(String[] args) {
    int[] randomThree = new int[3];
    for (int x = 0; x < randomThree.length; x++) {
      randomThree[x] = (int)(Math.random() * 100);
    }
    for (int row = 0; row < 80; row ++) {
      if (row == 0 || row == 79) {
        for (int column = 0; column < 30; column ++) {
          System.out.print(Text.colorize(" ", Text.CYAN + Text.BACKGROUND));
        }
      }
      else if (row == 1) {
        int count = 0;
        for (int column = 0; column < 30; column ++) {
          if (column == 0 || column == 29) {
            System.out.print(Text.colorize(" ", Text.CYAN + Text.BACKGROUND));
          }
          else if (column == 7 || column == 14 || column == 21) {
            if (randomThree[count] >= 10) {
              column ++;
            }
            if (randomThree[count] < 25) {
              System.out.print(Text.colorize("" + randomThree[count], Text.RED + Text.BRIGHT));
            }
            else if (randomThree[count] > 75) {
              System.out.print(Text.colorize("" + randomThree[count], Text.GREEN + Text.BRIGHT));
            }
            else {
              System.out.print(Text.colorize("" + randomThree[count], Text.WHITE + Text.BRIGHT));
            }
            count ++;
          }
          else {
            System.out.print(" ");
          }
        }
      }
      else {
        for (int column = 0; column < 30; column++) {
          if (column == 0 || column == 29) {
            System.out.print(Text.colorize(" ", Text.CYAN + Text.BACKGROUND));
          }
          else {
            System.out.print(" ");
          }
        }
      }
      System.out.println("");
    }
    Text.go(31, 0);
  }
}

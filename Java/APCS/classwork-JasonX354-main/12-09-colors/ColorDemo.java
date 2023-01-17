public class ColorDemo {
  public static String RED =  "\u001b[41m";
  public static String BROWN =  "\u001b[48;2;100;50;0m";
  public static String YELLOW =  "\u001b[43m";
  public static String BLUE =  "\u001b[44m";
  public static String BLACK =  "\u001b[40m";
  public static String WHITE =  "\u001b[47m";
  public static String CLEAR =  "\u001b[49m\u001b[39m";

  public static void main(String[] args) {
    //HAT
    System.out.print("      ");
    System.out.print(RED + "          " + CLEAR);
    //HEAD
    System.out.println("");
    System.out.print("   ");
    System.out.print(RED + "                       " + CLEAR);
    System.out.println("");
    System.out.print("   ");
    System.out.print(BROWN + "    " + CLEAR);
    System.out.print(YELLOW + "         " + CLEAR);
    System.out.println("");
    System.out.print("   ");
    System.out.print(BROWN + "    " + CLEAR);
    System.out.print(YELLOW + "     " + CLEAR);
    System.out.print(BLACK + "   " + CLEAR);
    System.out.print(YELLOW + " " + CLEAR);
    System.out.println("");
    System.out.print("   ");
    System.out.print(BROWN + "    " + CLEAR);
    System.out.print(YELLOW + "      " + "\u001b[38;2;100;50;0m______   " +  CLEAR);
    System.out.println("");
    System.out.print("   ");
    System.out.print(BROWN + "    " + CLEAR);
    System.out.print(YELLOW + "         " +  "" + CLEAR);
    System.out.print("      ");
    System.out.print("YAHOO! YIPPEE! ITS A ME, MARIO!");
    //BODY
    System.out.println("");
    System.out.print("  ");
    System.out.print(RED + "  " + CLEAR);
    System.out.print(BLUE + "   " + CLEAR);
    System.out.print(RED + "    " + CLEAR);
    System.out.print(BLUE + "   " + CLEAR);
    System.out.print(RED + " " + CLEAR);
    System.out.println("");
    System.out.print(RED + "   " + CLEAR);
    System.out.print(YELLOW + "    " + CLEAR);
    System.out.print(BLUE + "    " + CLEAR);
    System.out.print(YELLOW + "    " + CLEAR);
    System.out.print(RED + "   " + CLEAR);
    System.out.println("");
    System.out.print(RED + "   " + CLEAR);
    System.out.print(BLUE + "             " + CLEAR);
    System.out.print(RED + "   " + CLEAR);
    System.out.println("");
    System.out.print(RED + "   " + CLEAR);
    System.out.print(BLUE + "             " + CLEAR);
    System.out.print(RED + "   " + CLEAR);
    System.out.println("");
    System.out.print(RED + "   " + CLEAR);
    System.out.print(BLUE + "             " + CLEAR);
    System.out.print(RED + "   " + CLEAR);
    System.out.println("");
    System.out.print(WHITE + "   " + CLEAR);
    System.out.print(BLUE + "             " + CLEAR);
    System.out.print(WHITE + "   " + CLEAR);
    //LEGS
    System.out.println("");
    System.out.print("   ");
    System.out.print(BLUE + "     " +CLEAR);
    System.out.print("   ");
    System.out.print(BLUE + "     " +CLEAR);
    System.out.println("");
    System.out.print("   ");
    System.out.print(BLUE + "     " +CLEAR);
    System.out.print("   ");
    System.out.print(BLUE + "     " +CLEAR);
    System.out.println("");
    System.out.print("   ");
    System.out.print(BLUE + "     " +CLEAR);
    System.out.print("   ");
    System.out.print(BLUE + "     " +CLEAR);
    System.out.println("");
    System.out.print("   ");
    System.out.print(BLUE + "     " +CLEAR);
    System.out.print("   ");
    System.out.print(BLUE + "     " +CLEAR);
    //SHOES
    System.out.println("");
    System.out.print("   ");
    System.out.print(BROWN + "       " +CLEAR);
    System.out.print(" ");
    System.out.print(BROWN + "       " +CLEAR);
  }
}

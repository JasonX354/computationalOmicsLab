import java.util.Scanner;
class Game {
  public static void main(String[] args) {
    //do this once
    Scanner userInput = new Scanner(System.in);

    //You can do the rest many times:

    System.out.println("Enter username");
    //Read one line of user input
    String userName = userInput.nextLine();
    //Do something with the input
    System.out.println("Username is: " + userName);

    Adventurer Player = new Soda(userName, 70, 100);
    Adventurer Enemy = new AngryWarrior();

    System.out.println("");

    while (Player.getHP() > 0 && Enemy.getHP() > 0) {
      System.out.println(Player.getName() + ": " + Player.getHP() + "/" + Player.getmaxHP() + " HP, " + Player.getSpecial() + "/" + Player.getSpecialMax() + " " + Player.getSpecialName());
      System.out.println(Enemy.getName() + ": " + Enemy.getHP() + "/" + Enemy.getmaxHP() + " HP, " + Enemy.getSpecial() + "/" + Enemy.getSpecialMax() + " " + Enemy.getSpecialName());
      System.out.println("Type: (a)ttack / (sp)ecial");
      String action = userInput.nextLine();
      if (action.equals("a")) {
        System.out.println(Player.attack(Enemy));
        System.out.println(Player.getName() + " HP: " + Player.getHP() + "/" + Player.getmaxHP() + " || Your Special: " + Player.getSpecial() + "/" + Player.getSpecialMax());
        System.out.println(Enemy.getName() + " HP: " + Enemy.getHP() + "/" + Enemy.getmaxHP() + " || Enemy Special: " + Enemy.getSpecial() + "/" + Enemy.getSpecialMax());
        System.out.println("");
      }
      else if (action.equals("sp")) {
        System.out.println(Player.specialAttack(Enemy));
        System.out.println(Player.getName() + " HP: " + Player.getHP() + "/" + Player.getmaxHP() + " || Your Special: " + Player.getSpecial() + "/" + Player.getSpecialMax());
        System.out.println(Enemy.getName() + " HP: " + Enemy.getHP() + "/" + Enemy.getmaxHP() + " || Enemy Special: " + Enemy.getSpecial() + "/" + Enemy.getSpecialMax());
        System.out.println("");
      }
      else {
        System.out.println("\nEnter valid input\n");
      }

      if (Enemy.getHP() <= 0) {}
      else if (action.equals("a") || action.equals("sp")) {
        if ((int)(Math.random() * 100) < 60) {
          System.out.println(Enemy.attack(Player));
        }
        else {
          System.out.println(Enemy.specialAttack(Player));
        }
      }
    }

    System.out.println("FIGHT COMPLETE");
    if (Enemy.getHP() <= 0 && Player.getHP() <= 0) {
      System.out.println("TIE!");
    }
    else if (Enemy.getHP() > 0) {
      System.out.println("WINNER: " + Enemy.getName());
      System.out.println("HP: " + Enemy.getHP());
      System.out.println("SPECIAL: " + Enemy.getSpecial());
    }
    else {
      System.out.println("WINNER: " + Player.getName());
      System.out.println("HP: " + Player.getHP());
      System.out.println("SPECIAL: " + Player.getSpecial());
    }
  }
}

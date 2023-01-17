import java.util.Random;
import java.util.Scanner;
public class Cashier extends Adventurer{

  /*
  all adventurers must have a custom special
  consumable resource (mana/Cash/money/witts etc)
  */
  Scanner userInput = new Scanner(System.in);

  private int Cash;

  public Cashier() {
    super();
  }

  public Cashier(String name) {
    super(name);
  }

  public Cashier(String name, int hp){
    super(name, hp);
    Cash = 0;
  }

  //give it a short name (fewer than 13 characters)
  public String getSpecialName(){
    return "Cash";
  }
  //accessor methods
  public int getSpecial() {
    return Cash;
  };
  public int getSpecialMax(){
    return 100;
  }
  //refill special resource by amount, but only up to at most getSpecialMax()
  public int restoreSpecial(int amount){
    if(getSpecial() <= getSpecialMax()+amount) {
      Cash+=amount;
      return getSpecial();
    } else {
      return 100;
    }
  }

  /*
  all adventurers must have a way to attack enemies and
  support their allys
  */
  //hurt or hinder the target adventurer
  public String attack(Adventurer other) {
    StuyabloGame.drawText("Choose an item from the Menu to throw (Item number) ", 29);
    StuyabloGame.drawText("MENU: ", 2);
    StuyabloGame.drawText("1. Ketchup $0.00", 3);
    StuyabloGame.drawText("2. Iced Americano $2.25", 4);
    StuyabloGame.drawText("3. Happy Meal $3.29", 5);
    StuyabloGame.drawText("4. Double Filet-O-Fish $4.79", 6);
    StuyabloGame.drawText("5. 40-piece McNuggets $11.29", 7);
    Text.go(30, 1);
    System.out.print(">");
    boolean choiceMade = false;
    String ret = "";
    while(choiceMade == false) {
      String userAttack = userInput.next();
      if(userAttack.equals("1")) {
        other.setHP(other.getHP() - 1);
        ret += this + " squirts slippery ketchup on " + other + " for 1 damage!";
        choiceMade = true;
      } else
      if(userAttack.equals("2")) {
        if(getSpecial() > 2.25) {
          other.setHP(other.getHP() - 3);
          this.restoreSpecial(-2);
          ret += this + " splashed a cup of steaming hot McCafe Americano on " + other + " for 3 damage!";
          choiceMade = true;
        } else {
          StuyabloGame.drawText("Not enough money! Please choose again ", 28);
          Text.go(29, 2);
          System.out.print(" ");
          Text.go(29, 2);
        }
      } else
      if(userAttack.equals("3")) {
        if(getSpecial() > 3.29) {
          other.setHP(other.getHP() - 5);
          this.restoreSpecial(-3);
          ret += this + " pounds " + other + " with a happy meal toy for 5 damage!";
          choiceMade = true;
        } else {
          StuyabloGame.drawText("Not enough money! Please choose again ", 28);
          Text.go(29, 2);
          System.out.print(" ");
          Text.go(29, 2);
        }
      } else
      if(userAttack.equals("4")) {
        if(getSpecial() > 4.79) {
          other.setHP(other.getHP() - 8);
          this.restoreSpecial(-5);
          ret += this + " chucked a soggy filet-o-fish at " + other + " for 7 damage!";
          choiceMade = true;
        } else {
          StuyabloGame.drawText("Not enough money! Please choose again ", 28);
          Text.go(29, 2);
          System.out.print(" ");
          Text.go(29, 2);
        }
      } else
      if(userAttack.equals("5")) {
        if(getSpecial() > 11.29) {
          other.setHP(other.getHP() - 20);
          this.restoreSpecial(-11);
          ret += this + " rapid fired 40 nuggets at " + other + " for 20 damage!";
          choiceMade = true;
        } else {
          StuyabloGame.drawText("Not enough money! Please choose again ", 28);
          Text.go(29, 2);
          System.out.print(" ");
          Text.go(29, 2);
        }
      }
      else {
        StuyabloGame.drawText("Invalid choice! Please choose again ", 28);
        Text.go(29, 2);
        System.out.print(" ");
        Text.go(29, 2);
      }
      if (choiceMade == true) {
        Text.go(0,0);
        Text.clear();
        StuyabloGame.drawScreen();
      }
      Text.go(29, 2);
    }
    return ret;

    // make a random factor where the enemy either notices it and licks it to gain health back or they don't notice and slip
    //  } else {
    //    other.setHP(other.getHP() - 15);
    // maybe make the expenditure of the currency based on the menu prices?

  }



  //heall or buff the target adventurer
  public String support(Adventurer other) {
    StuyabloGame.drawText("Choose an item from the Menu to support with: ", 29);
    StuyabloGame.drawText("MENU: ", 2);
    StuyabloGame.drawText("1. Ketchup $0.00", 3);
    StuyabloGame.drawText("2. Vanilla Soft Serve Cone $1.00", 4);
    StuyabloGame.drawText("3. McFlurry $2.39", 5);
    Text.go(30, 1);
    System.out.print(">");
    boolean choiceMade = false;
    String ret = "";
    while(choiceMade == false) {
      String userAttack = userInput.nextLine();
      if(userAttack.equals("1")) {
        if(other.getHP() + 1 <= other.getmaxHP()) {
          other.setHP(other.getHP() + 1);
          ret += this + " squeezes some tarty ketchup into " + other + "'s mouth, restoring 1 HP!";
        } else {
          other.setHP(other.getmaxHP());
          ret += this + " squeezes some tarty ketchup into " + other + "'s mouth, restoring max HP!";
        }
        choiceMade = true;
      } else
      if(userAttack.equals("2")) {
        if(getSpecial() > 1) {
          this.restoreSpecial(-1);
          if(other.getHP() + 2 <= other.getmaxHP()) {
            other.setHP(other.getHP() + 3);
            ret += this + " gives " + other + " some ice cream to enjoy, restoring 3 HP!";
          } else {
            other.setHP(other.getmaxHP());
            ret += this + " gives " + other + " some ice cream to enjoy, restoring max HP!";
          }
          choiceMade = true;
        } else {
          StuyabloGame.drawText("Not enough money! Please choose again:               ", 28);
          Text.go(29, 2);
          System.out.print(" ");
          Text.go(29, 2);
        }
      } else
      if(userAttack.equals("3")) {
        if(getSpecial() > 2.39) {
          this.restoreSpecial(-2);
          if(other.getHP() + 5 <= other.getmaxHP()) {
            other.setHP(other.getHP() + 5);
            ret += this + " treats " + other + " to a McFlurry, restoring 5 HP!";
          } else {
            other.setHP(other.getmaxHP());
            ret += this + " gives " + other + " some ice cream to enjoy, restoring max HP!";
          }
          choiceMade = true;
        } else {
          StuyabloGame.drawText("Not enough money! Please choose again:                 ", 28);
          Text.go(29, 2);
          System.out.print(" ");
          Text.go(29, 2);
        }
      } else {
        StuyabloGame.drawText("Choice invalid; please choose again: ", 28);
        Text.go(29, 2);
        System.out.print(" ");
        Text.go(29, 2);
      }
      if (choiceMade == true) {
        Text.go(0,0);
        Text.clear();
        StuyabloGame.drawScreen();
      }
      Text.go(29, 2);
    }
    return ret;
  }

  //hurt or hinder the target adventurer, consume some special resource
  public String specialAttack(Adventurer other) {
    restoreSpecial(15);
    return this + " skips the round, does their job civilly, and makes minimum wage.";
  }

}

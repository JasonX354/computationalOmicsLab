import java.util.*;
public class StuyabloGame{
  private static final int WIDTH = 80;
  private static final int HEIGHT = 30;
  private static final int BORDER_COLOR = Text.BLACK;
  private static final int BORDER_BACKGROUND = Text.WHITE + Text.BACKGROUND;

  public static void main(String[] args) {
    run();
  }

  public static String colorHpByPercent(int hp, int maxHP){
    String output = String.format("%2s", hp+"")+"/"+String.format("%2s", maxHP+"");
    //COLORIZE THE OUTPUT IF HIGH/LOW:
    // under 25% : red
    if (hp < .25 * maxHP) {
      return Text.colorize(output, Text.RED);
    }
    // over 75% : green
    else if (hp > .75 * maxHP) {
      return Text.colorize(output, Text.GREEN);
    }

    else {
      return Text.colorize(output, Text.YELLOW);
    }
    //return output;
  }


  //return a random adventurer (choose between all available subclasses)
  //feel free to overload this method to allow specific names/stats.
  public static Adventurer createRandomAdventurer(){
    ArrayList<Adventurer> random = new ArrayList<Adventurer>();
    String[] whiteSurname = new String[] {"Johnson", "Smith", "Williams", "Harris", "Miller", "Jones", "White", "Brown", "Green"};
    //random.add(Karen.add("Karen " + whiteSurname[(int)(Math.random() * Surname.length)]));
    //Planned Adventueres: BTS, Travis Scott, Robnald McDonalkd, bathroom rats, low wage employees, health inspector
    return random.get((int)(Math.random() * random.size()));
  }

  //Display a List of 1-3 adventurers on the rows row through row+3 (4 rows max)
  //Should include Name HP and Special on 3 separate lines.
  public static void drawParty(ArrayList<Adventurer> party,int startRow){
    /*>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
    //YOUR CODE HERE
    int nameGap = 2;
    for(int i = 0; i < party.size(); i++) {
      Text.go(startRow, nameGap);
      System.out.println(party.get(i));
      nameGap+=25;
    }
    int HPGap = 2;
    for(int i = 0; i < party.size(); i++) {
      Text.go(startRow+1, HPGap);
      System.out.println("HP: " + colorHpByPercent(party.get(i).getHP(), party.get(i).getmaxHP()));
      HPGap+=25;
    }
    int specialGap = 2;
    for(int i = 0; i < party.size(); i++) {
      Text.go(startRow+2, specialGap);
      System.out.println(party.get(i).getSpecialName() + ": " + party.get(i).getSpecial() + "/" + party.get(i).getSpecialMax());
      specialGap+=25;
    }
    }
    /*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<*/


  //Display a line of text starting at column 2  of the specified row.
  //(columns start at 1)
  public static void drawText(String s,int startRow){
    /*>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
    //YOUR CODE HERE
    Text.go(startRow, 2);
    System.out.print(s);
    /*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<*/
  }

  //Display the party and enemies
  public static void drawScreen(){
    /*>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
    //YOUR CODE HERE
    for (int row = 1; row < HEIGHT - 1; row ++) {
      if (row == 1 || row == HEIGHT - 2) {
        for (int column = 0; column < WIDTH; column ++) {
          System.out.print("_");
        }
      }
      else {
        for (int column = 1; column < WIDTH + 1; column++) {
          if (column == 1 || column == WIDTH) {
            System.out.print("|");
          }
          else {
            System.out.print(" ");
          }
        }
      }
      System.out.println("");
    }
    /*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<*/
  }


  public static void run(){
    //Clear and initialize
    Text.hideCursor();
    Text.clear();
    Text.go(1,1);
    Text.reset();


    //Things to attack:
    //Make an ArrayList of Adventurers and add 1 enemy to it.
    ArrayList<Adventurer>enemies = new ArrayList<Adventurer>();
    /*>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
    //YOUR CODE HERE
    Adventurer placeholderMiniboss = new Manager("Mr. Manager", 150, 0);
    enemies.add(placeholderMiniboss);
    /*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<*/

    //Adventurers you control:
    //Make an ArrayList of Adventurers and add 3 Adventurers to it.
    /*>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
    ArrayList<Adventurer> party = new ArrayList<>();
    Adventurer Cashier = new Cashier("Cashier Jacobs", 20);
    party.add(Cashier);
    String[] whiteSurname = new String[] {"Johnson", "Smith", "Williams", "Harris", "Miller", "Jones", "White", "Brown", "Green"};
    for (int i = 0; i < 2; i++) {
      Adventurer Karen = new Karen("Karen " + whiteSurname[(int)(Math.random() * whiteSurname.length)], 10);
      party.add(Karen);
    }

    //YOUR CODE HERE
    /*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<*/

    //Main loop
    boolean partyTurn = false;
    int whichPlayer = 0;
    int turn = 0;
    String input = "";
    Scanner in = new Scanner(System.in);
    while(! (input.equalsIgnoreCase("q") || input.equalsIgnoreCase("quit") || party.size() <= 0 || enemies.size() <= 0)){

      //Draw the window border
      Text.clear();
      Text.go(1, 1);
      Text.hideCursor();
      drawScreen();

      //display event based on last turn's input
      if(partyTurn){
        //Process user input for the last Adventurer:
        if(input.equals("attack") || input.equals("a")){
          /*>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
          //YOUR CODE HERE
          drawText(party.get(whichPlayer).attack(enemies.get(0)), party.size() + 5);
          /*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<*/
        }
        else if(input.equals("special") || input.equals("sp")){
          /*>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
          //YOUR CODE HERE
          drawText(party.get(whichPlayer).specialAttack(enemies.get(0)), party.size() + 5);
          /*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<*/
        }
        else if(input.startsWith("su")){
          //"support 0" or "su 0" as well as 1 or 2
          /*>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
          //YOUR CODE HERE
          Adventurer supportWho = party.get(Integer.parseInt(input.substring(input.length() - 1)));
          drawText(party.get(whichPlayer).support(supportWho), party.size() + 5);
          /*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<*/
        }

        if (enemies.get(0).getHP() <= 0) {
          drawText(enemies.remove(0) + " has died!", HEIGHT - 3);
        }else {
          drawText(enemies.get(0) + " waits patiently!", HEIGHT - 3);
        }

        whichPlayer++;


        if (enemies.size() > 0) {
          if(whichPlayer < party.size()){
            drawText("Enter command for "+party.get(whichPlayer)+": attack/special/support 0-2/quit",HEIGHT - 1);
          }else{
            if (enemies.size() > 0) {
              drawText("press enter to see monster's turn",HEIGHT - 3);
            }
            partyTurn = false;
          }
        }
        else if (enemies.size() == 0) {
          drawText("All enemies have died, you win! Winner winner chicken dinner!",HEIGHT - 1);
        }
      }else if (party.size() > 0){
        //not the party turn!
        //no user input

        //display enemy attack except on turn 0.
        if(turn > 0){
          //enemy attacks a randomly chosen person with a randomly chosen attack.z`
          //Enemy action choices go here!
          /*>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
          //YOUR CODE HERE
          int choice = (int)(Math.random() * 100);
          Adventurer target = party.get((int)(Math.random() * party.size()));
          if (choice < 10 + enemies.get(0).getSpecial()) {
            drawText(enemies.get(0).specialAttack(target), HEIGHT - 3);
          }
          else {
            drawText(enemies.get(0).attack(target), HEIGHT - 3);
          }
          /*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<*/
        }

        whichPlayer = 0;

        for (int checkDead = 0; checkDead < party.size(); checkDead++) {
          if (party.get(checkDead).getHP() <= 0) {
            drawText(party.remove(checkDead) + " has died!", party.size() + 5);
          }
        }

        //display which player's turn is next and prompt for action.
        if (party.size() > 0){
          drawText("Enter command for "+party.get(whichPlayer)+": attack/special/support 0-2/quit", HEIGHT - 1);
        }
        else {
          drawText("All your party members have died, you are a loser.", HEIGHT - 1);
        }

        //end the turn.
        turn++;
        partyTurn=true;
      }

      //display current state of all Adventurers
      drawParty(party,2);
      drawParty(enemies,HEIGHT-7);

      //Draw the prompt
      Text.reset();
      Text.go(HEIGHT,1);
      Text.showCursor();
      System.out.print(">");
      //Read user input
      input = in.nextLine();
    }

    //After quit reset things:
    Text.reset();
    Text.showCursor();
    Text.go(32,1);
  }
}

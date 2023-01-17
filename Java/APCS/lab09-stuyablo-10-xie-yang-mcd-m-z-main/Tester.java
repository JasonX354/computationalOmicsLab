import java.util.ArrayList;
public class Tester {
  public static void main(String[] args) {
    ArrayList<Adventurer> list = new ArrayList<Adventurer>();
    Adventurer A = new Karen("Karen Johnson", 35);
    Adventurer B = new Cashier("Jay", 35);
    list.add(A);
    list.add(B);
  //  StuyabloGame.drawParty(list, 7);
  //  StuyabloGame.drawText("peepee", 3);
  A.setHP(6);
  System.out.println(B.support(A));
  }
}

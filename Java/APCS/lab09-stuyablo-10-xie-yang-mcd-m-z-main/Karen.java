import java.util.Random;
public class Karen extends Adventurer{

      /*
        all adventurers must have a custom special
        consumable resource (mana/rage/money/witts etc)
      */
      private int Rage;

      public Karen() {
        super();
      }

public Karen(String name) {
  super(name);
}

    public Karen(String name, int hp){
       super(name, 10 + (int)(Math.random() * 10));
       Rage = 15;
    }

      //give it a short name (fewer than 13 characters)
      public String getSpecialName(){
        return "Rage";
      }
      //accessor methods
      public int getSpecial() {
        return Rage;
      };
      public int getSpecialMax(){
        return 100;
      }
      //refill special resource by amount, but only up to at most getSpecialMax()
      public int restoreSpecial(int amount){
        if(getSpecial() <= getSpecialMax()+amount) {
          Rage+=amount;
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
        if(Math.random() > 0.5) {
          other.setHP(other.getHP() - 10);
          restoreSpecial(3);
          return this + " flung purse at " + other + " for 10 damage!";
        } else {
          other.setHP(other.getHP() - 15);
          restoreSpecial(5);
          return this + " flung purse at " + other + " for 15 damage! (Headshot!)";
        }

      }

      //heall or buff the target adventurer
      public String support(Adventurer other) {
        if(other.getHP() + 5 <= other.getmaxHP()) {
          other.setHP(other.getHP() + 5);
          return this + " live laugh loves and " + other + " is healed by 5 HP!";
        } else {
          other.setHP(other.getmaxHP());
          return this + " live laugh loves and " + other + " is healed to max!";
        }

      }

      //hurt or hinder the target adventurer, consume some special resource
      public String specialAttack(Adventurer other) {
        if(Rage >= 20){
          Rage-=20;
          other.setHP(other.getHP() - 20);
          return other + " lost 20 HP from " + this + "'s patronizing lecture!!";
        } else {
          setHP(getHP() -5);
          return "Karen doesn't have enough rage. She overshoots and ends up gaslighting herself and losing 5 HP!";
        }
      }

}

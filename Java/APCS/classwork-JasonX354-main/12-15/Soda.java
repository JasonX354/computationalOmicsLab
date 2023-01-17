public class Soda extends Adventurer {
  private int juice;
  //Abstract methods are meant to be implemented in child classes.

  /*
    all adventurers must have a custom special
    consumable resource (mana/rage/money/witts etc)
  */

  public Soda() {
    super.setName("Soda");
    super.setHP(70);
    super.setmaxHP(70);
    juice = getSpecialMax();
  }
  public Soda(String name) {
    super.setName(name);
    super.setHP(70);
    super.setmaxHP(70);
    juice = getSpecialMax();
  }
  public Soda(String name, int hp) {
    super.setName(name);
    super.setHP(hp);
    super.setmaxHP(70);
    juice = getSpecialMax();
  }
  public Soda(String name, int hp, int special) {
    super.setName(name);
    super.setHP(hp);
    super.setmaxHP(70);
    juice = special;
  }

  //give it a short name (fewer than 13 characters)
  public String getSpecialName() {
    return "juice";
  }
  //accessor methods
  public int getSpecial() {
    return juice;
  }
  public int getSpecialMax() {
    return 100;
  }
  //refill special resource by amount, but only up to at most getSpecialMax()
  public int restoreSpecial(int amount) {
    juice += amount;
    if (juice > getSpecialMax()) {
      juice = getSpecialMax();
    }
    return juice;
  }

  /*
    all adventurers must have a way to attack enemies and
    support their allys
  */
  //hurt or hinder the target adventurer
  public String attack(Adventurer other) {
    int attack = (int)(Math.random() * 6) + 7;
    other.applyDamage(attack);
    restoreSpecial(5);
    return getName() + " spurts out attack juice at " + other.getName() + " for " + attack + " damage!";
  }

  //heall or buff the target adventurer
  public String support(Adventurer other) {
    if (getSpecial() >= 10) {
      juice -= 10;
      if (other.getHP() > other.getmaxHP() - 20) {
        other.setHP(other.getmaxHP());
        return getName() + " spurts out healing juice at " + other.getName() + ", healing for " + (other.getmaxHP() - other.getHP()) + " HP! ";
      }
      else {
        other.setHP(other.getHP() + 20);
        return getName() + " spurts out healing juice at " + other.getName() + ", healing for 20 HP! ";
      }
    }
    else {
      restoreSpecial(20);
      return getName() + " uses this turn to refill! " + getName() + " now has " + getSpecial() + "/" + getSpecialMax() + " juice!";
    }
  }

  //hurt or hinder the target adventurer, consume some special resource
  public String specialAttack(Adventurer other) {
    int attack = (int)(Math.random() * 10) + 15;
    if (getSpecial() >= 20) {
      other.applyDamage(attack);
      juice -= 20;
      return getName() + " spurts out special attack juice at " + other.getName() + " for " + attack + " damage! ";
    }
    else {
      restoreSpecial(20);
      return getName() + " uses this turn to refill 40 juice! ";
    }
  }

}

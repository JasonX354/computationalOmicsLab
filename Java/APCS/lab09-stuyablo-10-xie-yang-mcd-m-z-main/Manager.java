public class Manager extends Adventurer {
  private int Authority;
  //Abstract methods are meant to be implemented in child classes.

  /*
    all adventurers must have a custom special
    consumable resource (mana/rage/money/witts etc)
  */

  public Manager() {
    super.setName("Manager");
    super.setHP(100);
    super.setmaxHP(150);
    Authority = getSpecialMax();
  }
  public Manager(String name) {
    super.setName(name);
    super.setHP(100);
    super.setmaxHP(150);
    Authority = getSpecialMax();
  }
  public Manager(String name, int hp) {
    super.setName(name);
    super.setHP(hp);
    super.setmaxHP(150);
    Authority = getSpecialMax();
  }
  public Manager(String name, int hp, int special) {
    super.setName(name);
    super.setHP(hp);
    super.setmaxHP(150);
    Authority = special;
  }

  //give it a short name (fewer than 13 characters)
  public String getSpecialName() {
    return "Authority";
  }
  //accessor methods
  public int getSpecial() {
    return Authority;
  }
  public int getSpecialMax() {
    return 100;
  }
  //refill special resource by amount, but only up to at most getSpecialMax()
  public int restoreSpecial(int amount) {
    Authority += amount;
    if (Authority > getSpecialMax()) {
      Authority = getSpecialMax();
    }
    return Authority;
  }

  /*
    all adventurers must have a way to attack enemies and
    support their allys
  */
  //hurt or hinder the target adventurer
  public String attack(Adventurer other) {
    int damage = (int)(Math.random() * 6 + 6);
    other.applyDamage(damage);
    restoreSpecial(20);
    return getName() + " asks " + other.getName() + " to work overtime, dealing " + damage + " damage!";
  }

  //heall or buff the target adventurer
  public String support(Adventurer other) {
    if (getSpecial() >= 10) {
      Authority -= 10;
      if (other.getHP() > other.getmaxHP() - 20) {
        other.setHP(other.getmaxHP());
        return getName() + " doubles " + other.getName() + "'s wage, healing for " + (other.getmaxHP() - other.getHP()) + " HP!";
      }
      else {
        other.setHP(other.getHP() + 20);
        return getName() + " doubles " + other.getName() + "'s wage, healing for 20 HP!";
      }
    }
    else {
      return getName() + " tries to doubles " + other.getName() + "'s wage, but fails!";
    }
  }

  //hurt or hinder the target adventurer, consume some special resource
  public String specialAttack(Adventurer other) {
    int damage = ((int)(10 + .2 * getSpecial()));
    other.applyDamage(damage);
    Authority = 0;
    return getName() + " unleashes his primal, corporate fury at " + other.getName() + " for " + damage + " damage! ";
  }

}

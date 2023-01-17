/*
The adress of the object turns from random letters and numbers into legible text.
This suggests that when printing an object which returns a string, a string will
replace its object.
*/
public class Kitty {
  private String name;
  private int age;
  public Kitty() {
    name = "Mittens";
    age = 2;
  }
  public Kitty(String newName, int ageIncrease) {
    name = newName;
    age += ageIncrease;
  }
  public int getAge() {
    return age;
  }
  public String getName() {
    return name;
  }
  public void changeName(String newName) {
    name = newName;
  }
  public void makeOlder() {
    age += 1;
  }
  public String toString() {
    return "The Amazing " + name;
  }
}

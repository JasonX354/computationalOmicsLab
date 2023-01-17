public class Bird extends Animal {
  private double height;
  private String color;


  public Bird(String noise, int age, String name, double height, String color){
    super(noise, age, name);
    this.height = height;
    this.color = color;
    //In order to construct the Bird you must first call the superclass constructor
    //This is done by saying: super(parameters)
    //e.g. super("Doug",10,"Squaaaak!");
  }

  //Override the speak() method.
  /*WITHOUT REPEATING CODE:
  print the following message replacing the ? with name/age/noise/color/height:
    My name is ?.
    I am ? years old.
    I say ?.
    My feathers are colored ?.
    I am ? inches tall.
  */
  //You can call the old method using super.speak();
  public void speak(){
    super.speak();
    System.out.println("My feathers are colored " + color +".");
    System.out.println("I am " + height + " inches tall.");
  }

  //Override the getName() method so that a bid's name is "The Mighty NAME" instead of "NAME"
  //e.g. "The Mighty Polly" instead of just "Polly"
  //You can call the old method using super.getName()
  public String getName(){
    return "The Mighty " + super.getName();
  }

}

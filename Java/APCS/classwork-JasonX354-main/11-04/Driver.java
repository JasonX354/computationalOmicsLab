//When I overode the getName() method in Bird.java,
//my main added a "the super" to my bird's original name.
//
//a1, b1, and a2 all worked while b2 did not.
//This is because b2 was trying to turn an Animal into a Bird,
//but the Animal does not have enough features to fill all the parameters that a bird requires.
public class Driver {
  public static void main(String args[]) {
    Animal cow = new Animal("moo", 10, "cow");
    cow.speak();

    Animal bird = new Bird("cacaw", 1, "timothy", 2.5, "red");
    bird.speak();
    System.out.println(bird.getName());

    //only an ancient being can possess so much knowledge
    Animal a1= new Animal("You're late to class", 999, "Mr. K");
    Bird b1= new Bird("CAWWWWW", 15, "American Eagle", 24, "white");
    //Bird b2= new Animal("oink", 20, "Pig");
    Animal a2= new Bird("bluejay noises", 5, "bluejay", 5, "blue");
  }
}

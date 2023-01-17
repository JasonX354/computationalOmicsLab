public class Driver{
  public static void main(String[]args){
    superArray test1 = new superArray();
    superArray test2 = new superArray(5);
    System.out.println("PHASE 1 TESTING:");
    System.out.println(test1);
    System.out.println(test1.size());
    System.out.println(test1.add("1"));
    System.out.println(test1.add("2"));
    System.out.println(test1.add("3"));
    System.out.println(test1.add("4"));
    System.out.println(test1.add("5"));
    System.out.println(test1.add("6"));
    System.out.println(test1.add("7"));
    System.out.println(test1.add("8"));
    System.out.println(test1.add("9"));
    System.out.println(test1.add("10"));
    System.out.println(test1);
    System.out.println("Next one should be false");
    System.out.println(test1.add("you should see this if resize() works"));
    System.out.println(test1);
    System.out.println("Should be \"6\": " + test1.get(5));
    System.out.println("Should be \"null\": " + test1.get(-5));
    System.out.println("Should be \"null\": " + test1.get(12));
    System.out.println("Should be \"1\": " + test1.set(0, "new value 1"));
    System.out.println("Should be \"[new value 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]\": " + test1);
    System.out.println("Should be \"null\": " + test1.set(-5, "you should not see this"));
    System.out.println("Should be \"null\": " + test1.set(59, "this test case shall not be seen by mere mortals"));
    System.out.println("PHASE 2 TESTING:");

    for (int index = 0; index < test1.size(); index ++) {
      System.out.println(test1.get(index));
    }
    System.out.println("superArray with different values:");
    for (int index = 0; index < test1.size(); index ++) {
      test1.set(index, "new value " + index);
    }
    for (int index = 0; index < test1.size(); index ++) {
      System.out.println(test1.get(index));
    }
    System.out.println("superArray with value of the next data cell:");
    for (int index = 0; index < test1.size(); index ++) {
      if (index < test1.size() - 1) {
        test1.set(index, test1.get(index + 1));
      }
      else {
        test1.set(index, "NOPE!");
      }
    }
    for (int index = 0; index < test1.size(); index ++) {
      System.out.println(test1.get(index));
    }
    System.out.println("PHASE 3 TESTING:");
    System.out.println("Expected: true, true, true, true, true, true");
    System.out.println(test2.add("1"));
    System.out.println(test2.add("2"));
    System.out.println(test2.add("3"));
    System.out.println(test2.add("4"));
    System.out.println(test2.add("5"));
    System.out.println(test2.add("6"));
    System.out.println("PHASE 4 TESTING:");
    System.out.println("Expected: -1, 0, 2, 4, 11, 0");
    System.out.println(test1.indexOf("new value 11"));
    System.out.println(test1.indexOf("new value 1"));
    System.out.println(test1.indexOf("new value 3"));
    System.out.println(test1.indexOf("new value 5"));
    test1.add("new value 11");
    test1.add("new value 1");
    System.out.println(test1.indexOf("new value 11"));
    System.out.println(test1.indexOf("new value 1"));

    superArray test3 = new superArray(7);
    test3.add("zero");
    test3.add("one");
    test3.add("zero");
    test3.add("one");
    test3.add("zero");
    test3.add("two");
    test3.add("five");

    System.out.println("Expected: 4, 3, 5, 6, 7");
    System.out.println(test3.lastIndexOf("zero"));
    System.out.println(test3.lastIndexOf("one"));
    System.out.println(test3.lastIndexOf("two"));
    System.out.println(test3.lastIndexOf("five"));
    test3.add("zero");
    System.out.println(test3.lastIndexOf("zero"));

    System.out.println("Expected: ");
    System.out.println("ERROR\n[zero, one, zero, one, zero, two, five, zero]");
    System.out.println("[one, zero, one, zero, one, zero, two, five, zero]");
    System.out.println("ERROR\n[one, zero, one, zero, one, zero, two, five, zero]");
    System.out.println("[one, zero, one, seven, zero, one, zero, two, five, zero]");
    System.out.println("[one, zero, one, seven, zero, one, zero, two, six, five, zero]");
    System.out.println("[one, zero, one, seven, zero, one, zero, two, six, five, zero, ten]");
    System.out.println("[one, zero, one, seven, zero, one, zero, eight, two, six, five, zero, ten]");
    System.out.println("Output:");
    test3.add(-1, "zero");
    System.out.println(test3);
    test3.add(0, "one");
    System.out.println(test3);
    test3.add(12, "two");
    System.out.println(test3);
    test3.add(3, "seven");
    System.out.println(test3);
    test3.add(8, "six");
    System.out.println(test3);
    test3.add(11, "ten");
    System.out.println(test3);
    test3.add(7, "eight");
    System.out.println(test3);

    System.out.println("Remove the following: nothing, 1, 6, 5, 4, 3, 2, nothing, nothing");
    System.out.println("Before any removals: " + test2);
    System.out.println(test2.remove(-1));
    System.out.println(test2);
    System.out.println("Removed: " + test2.remove(0));
    System.out.println(test2);
    System.out.println("Removed: " + test2.remove(4));
    System.out.println(test2);
    System.out.println("Removed: " + test2.remove(3));
    System.out.println(test2);
    System.out.println("Removed: " + test2.remove(2));
    System.out.println(test2);
    System.out.println("Removed: " + test2.remove(1));
    System.out.println(test2);
    System.out.println("Removed: " + test2.remove(0));
    System.out.println(test2);
    System.out.println(test2.remove(1));
    System.out.println(test2);

    System.out.println("Remove the following: one, seven, ten, nothing");
    System.out.println("Before any removals: " + test3);
    System.out.println(test3.remove("one"));
    System.out.println(test3);
    System.out.println(test3.remove("seven"));
    System.out.println(test3);
    System.out.println(test3.remove("ten"));
    System.out.println(test3);
    System.out.println(test3.remove("lkafkawkj"));
    System.out.println(test3);
  }
}

public class Driver {
  public static void main(String[] args) {
    MyLinkedList test = new MyLinkedList();
    System.out.println(test);

    test.add(0, "and");
    System.out.println(test);
    test.add(0, "bernie");
    System.out.println(test);
    test.add(2, "ernie");
    System.out.println(test);
    test.add(1, "sternie");
    System.out.println(test);
    System.out.println(test.get(0));
    System.out.println(test.get(1));
    System.out.println(test.get(3));
    System.out.println(test.set(0, "first"));
    System.out.println(test.set(1, "second"));
    System.out.println(test.set(3, "last"));
    System.out.println(test);
    System.out.println(test.contains("first"));
    System.out.println(test.contains("second"));
    System.out.println(test.contains("last"));
    System.out.println(test.contains("Not in list"));
    System.out.println(test);
  }
}

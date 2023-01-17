public class Driver {
  public static void main(String[] args) {
    /*
    NoNullArrayList<Integer> test0 = new NoNullArrayList<Integer>(5);
    for(int i = 0; i < 5; i++) {
      test0.add((int)(Math.random()*100));
    }
    System.out.println("test arraylist: " + test0);

    try {
      System.out.println("adding null:");
      test0.add(null);
      System.out.println("adding null to index 0:");
      test0.add(0, null);
      System.out.println("setting null to index 0:");
      test0.set(0, null);
    }
    catch (IllegalArgumentException ex) {
      System.out.println("Exception tried and caught");
    }
    test0.add(0, 100);
    System.out.println("test arraylist with '100' added to index '0': " + test0);
    test0.set(0, 5);
    System.out.println("test arraylist with index '0' set to '5': " + test0);
    */

    OrderedArrayList<Integer> test1 = new OrderedArrayList<Integer>(5);
    for(int i = 0; i < 5; i++) {
      test1.add((int)(Math.random()*100));
    }

    System.out.println("test arraylist: " + test1);
/*
    try {

      System.out.println("adding null:");
      test1.add(null);
      System.out.println("adding null to index 0:");
      test1.add(0, null);

      System.out.println("setting null to index 0:");
      test1.set(0, null);
    }
    catch (IllegalArgumentException ex) {
      System.out.println("Exception tried and caught");
    }
*/
    System.out.println("Adding '50': ");
    test1.add(50);
    System.out.println("test arraylist: " + test1);
    System.out.println("Attempting to add '25' to index '5': ");
    test1.add(5, 25);
    System.out.println("test arraylist: " + test1);
    System.out.println("Attempting to set index '0' to '100': ");
    test1.set(0, 100);
    System.out.println("test arraylist: " + test1);

  }
}

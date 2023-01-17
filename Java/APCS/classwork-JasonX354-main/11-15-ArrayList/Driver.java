import java.util.ArrayList;
public class Driver {
  public static void main(String[] args) {
    ArrayList<String> arr1 = new ArrayList<String>(100);
    for(int i = 0; i < 100; i++) {
      if((int) (Math.random()*100) < 30) {
        arr1.add(i, "");
      } else {
        arr1.add(i, ""+i);
      }
    }
    System.out.println("arr1: " + arr1 );
    System.out.println("arr1.replaceEmpty(): " + ArrayListPractice.replaceEmpty(arr1) );
    /*
    ArrayList<String> arr2 = new ArrayList<String>(200000);
    for(int i = 0; i < 200000; i++) {
      if((int) (Math.random()*100) < 30) {
        arr2.add(i, "");
      } else {
        arr2.add(i, ""+i);
      }
    }
    System.out.println("arr2: " + arr2 );
    System.out.println("arr2.replaceEmpty(): " + ArrayListPractice.replaceEmpty(arr2) );
    */
    ArrayList<String> arr3 = new ArrayList<String>(100);
    for(int i = 0; i < 100; i++) {
      if((int) (Math.random()*100) < 30) {
        arr3.add(i, "");
      } else {
        arr3.add(i, ""+i);
      }
    }
    System.out.println("arr3: " + arr3 );
    System.out.println("arr3.makeReversedList(): " + ArrayListPractice.makeReversedList(arr3) );
    /*
    ArrayList<String> arr4 = new ArrayList<String>(200000);
    for(int i = 0; i < 200000; i++) {
      if((int) (Math.random()*100) < 30) {
        arr4.add(i, "");
      } else {
        arr4.add(i, ""+i);
      }
    }
    System.out.println("arr4: " + arr4 );
    System.out.println("arr4.replaceEmpty(): " + ArrayListPractice.replaceEmpty(arr4) );
    */
    ArrayList<String> arr5 = new ArrayList<String>();
    ArrayList<String> arr6 = new ArrayList<String>();
    for(int i = 0; i < (int)(Math.random() * 100); i++) {
      if((int) (Math.random()*100) < 30) {
        arr5.add(i, "");
      } else {
        arr5.add(i, ""+i);
      }
    }
    for(int i = 0; i < (int)(Math.random() * 100); i++) {
      if((int) (Math.random()*100) < 30) {
        arr6.add(i, "");
      } else {
        arr6.add(i, ""+i);
      }
    }
    System.out.println("arr5: " + arr5 );
    System.out.println("arr6: " + arr6 );
    System.out.println("arr5 and arr6 mixLists(): " + ArrayListPractice.mixLists(arr5, arr6) );
    /*
    HOW I TESTED THE BOTTOM CODE:
    1. Make arr7 and arr8 ArrayLists with 100k random integers
    2. Make arr7 with 20k more random integers than arr8
    2. Make arr8 with 20k more random integers than arr7
    All of them ran without delay
    */
    /*
    ArrayList<String> arr7 = new ArrayList<String>();
    ArrayList<String> arr8 = new ArrayList<String>();
    for(int i = 0; i < (int)(100000); i++) {
      if((int) (Math.random()*100) < 30) {
        arr7.add(i, "");
      } else {
        arr7.add(i, ""+i);
      }
    }
    for(int i = 0; i < (int)(120000); i++) {
      if((int) (Math.random()*100) < 30) {
        arr8.add(i, "");
      } else {
        arr8.add(i, ""+i);
      }
    }
    System.out.println("arr7: " + arr7 );
    System.out.println("arr8: " + arr8 );
    System.out.println("arr7 and arr8 mixLists(): " + ArrayListPractice.mixLists(arr7, arr8) );
    */
  }
}

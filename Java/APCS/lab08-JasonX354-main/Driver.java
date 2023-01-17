import java.util.Arrays;
public class Driver {
  public static boolean equals(int[] one, int[] two) {
    //assume both int[] are same length; my int[] copying skills should not be THAT bad
    boolean equalness = true;
    for(int i = 0; i < one.length; i++) {
    	if (one[i] != two[i]) {
        equalness = false;
      }
  	}
    return equalness;
  }

  public static void main(String[] args) {
    boolean correct = false;
    for (int j = 0; j < 1; j++) {
    	int[] test0 = new int[40000];

    	for(int i = 0; i < 10000; i++) {
      	test0[i] = ((int)(Math.random()*10000));
    	}
      int[] copy0 = new int[test0.length];
      for(int i = 0; i < test0.length; i++) {
      	copy0[i] = test0[i];
    	}

      int[] test1 = new int[10000];
    	for(int i = 0; i < 10000; i++) {
      	test1[i] = ((int)(Math.random()*10000)) * -1;
    	}
      int[] copy1 = new int[test1.length];
      for(int i = 0; i < test1.length; i++) {
      	copy1[i] = test1[i];
    	}

      int[] test2 = new int[0];
    	int[] copy2 = new int[0];

      int[] test3 = new int[10000];
    	for(int i = 0; i < 10000; i++) {
        if (((int)(Math.random()*100)) < 50) {
          test3[i] = ((int)(Math.random()*10000));
        }
        else {
          test3[i] = ((int)(Math.random()*10000)) * -1;
        }
    	}
      int[] copy3 = new int[test3.length];
      for(int i = 0; i < test3.length; i++) {
      	copy3[i] = test3[i];
    	}

      Arrays.sort(copy0);
      //System.out.println("bubblesort equal to sort? (positive numbers): " + equals(test0, copy0));
      Arrays.sort(copy1);
      //System.out.println("bubblesort equal to sort? (negative numbers): " + equals(test1, copy1));
      Arrays.sort(copy2);
      //System.out.println("bubblesort equal to sort? (zero index): " + equals(test2, copy2));
      Arrays.sort(copy3);
      //System.out.println("bubblesort equal to sort? (mix of positive & negative): " + equals(test3, copy3));

      if (args.length == 0) {}
      else if (args[0].equals("bubblesort")) {
        Sorts.bubblesort(test0);
        Sorts.bubblesort(test1);
        Sorts.bubblesort(test2);
        Sorts.bubblesort(test3);
        if ((equals(test0, copy0))) {
          correct = true;
        }
        if ((equals(test1, copy1))) {
          correct = true;
        }
        if ((equals(test2, copy2))) {
          correct = true;
        }
        if ((equals(test3, copy3))) {
          correct = true;
        }
      }
      else if (args[0].equals("selectionsort")) {
        Sorts.selectionsort(test0);
        Sorts.selectionsort(test1);
        Sorts.selectionsort(test2);
        Sorts.selectionsort(test3);
        if ((equals(test0, copy0))) {
          correct = true;
        }
        if ((equals(test1, copy1))) {
          correct = true;
        }
        if ((equals(test2, copy2))) {
          correct = true;
        }
        if ((equals(test3, copy3))) {
          correct = true;
        }
      }
      else if (args[0].equals("insertionsort")) {
        Sorts.insertionsort(test0);
        Sorts.insertionsort(test1);
        Sorts.insertionsort(test2);
        Sorts.insertionsort(test3);
        if ((equals(test0, copy0))) {
          correct = true;
        }
        if ((equals(test1, copy1))) {
          correct = true;
        }
        if ((equals(test2, copy2))) {
          correct = true;
        }
        if ((equals(test3, copy3))) {
          correct = true;
        }
      }
    }
    if (args.length == 0) {
      System.out.println("Input a sort");
    }
    else if (correct) {
      System.out.println("Sort works");
    }
    else if (correct == false) {
      System.out.println("Sort does not work");
    }

  }
}

import java.util.ArrayList;
public class ArrayListPractice {
  public static ArrayList<String> replaceEmpty( ArrayList<String> original){
    //return an new ArrayList that has all of the values of the original
    //except that all empty strings are replaced with the word "Empty".
    ArrayList<String> copy = new ArrayList<String>(original.size());
    for (int x = 0; x < original.size(); x++) {
      if (original.get(x).equals("")) {
        copy.add(x, "empty");
      }
      else {
        copy.add(x, original.get(x));
      }
    }
    return copy;
  }

  public static ArrayList<String> makeReversedList( ArrayList<String> original){
    //return a new ArrayList that is in the reversed order of the original.
    ArrayList<String> copy = new ArrayList<String>(original.size());
    for (int x = 0; x < original.size(); x++) {
      copy.add(original.get(original.size() - 1 - x));
    }
    return copy;
  }

  public static ArrayList<String> mixLists( ArrayList<String> a,  ArrayList<String> b){
    //return a new ArrayList that has all values of a and b in alternating order that is:
    //a[0], b[0], a[1], b[1]...
    //when one list is longer than the other, just append the remaining values to the end.
    ArrayList<String> ans = new ArrayList<String>(a.size() + b.size());
    int aCount = 0;
    int bCount = 0;
    for (int x = 0; x < a.size() + b.size(); x ++) {
      if (aCount >= a.size()) {
        while (bCount < b.size()) {
          ans.add(b.get(bCount));
          bCount ++;
        }
        return ans;
      }
      if (bCount >= b.size()) {
        while (aCount < a.size()) {
          ans.add(a.get(aCount));
          aCount ++;
        }
        return ans;
      }
      if (x % 2 == 0) {
        ans.add(x, a.get(aCount));
        aCount ++;
      }
      else if (x % 2 == 1) {
        ans.add(x, b.get(bCount));
        bCount ++;
      }
    }
    return ans;
  }
}

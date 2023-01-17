public class StringMethods{

  //return the index of s that contains the first occurence of target,
  //or -1 if it is not present. Obviously do not use indexOf().
  public static int myIndexOf(String s, String target){
    if (!(s.contains(target))) {
      return -1;
    }
    else {
      int index = 0;
      while (index < s.length()) {
        if ((s.substring(index, index + target.length())).equals(target)) {
          return index;
        }
        index++;
      }
    }
    return 0;
  }

  //return 0 if the strings are equal
  //return a positive number if other is less than s
  //return a negative number if other is greater than s
  public static int myCompareTo(String s, String other){
    int x = 0;
    if (s.equals(other)) {
      return 0;
    }
    if (s.length() > other.length()) {
      while (x < other.length()) {
        if (s.charAt(x) == other.charAt(x)) {
          x++;
        }
        else {
          return s.charAt(x) - other.charAt(x);
        }
      }
      return 1;
    }
    while (x < s.length()) {
      if (s.charAt(x) == other.charAt(x)) {
        x++;
      }
      else {
        return s.charAt(x) - other.charAt(x);
      }
    }
    return -1;
  }

  // Takes string and returns integer
  // Assume string is formatted like integer
  // Should work with POSITIVE and NEGATIVE integers (tip: check negativeness as last step)
  public static int parseInt(String s) {
    int num = 0;
    int index = 0;
    if (s.charAt(0) == '-') {
      index ++;
    }
    while (index < s.length()) {
      num += ((s.charAt(index) - '0') * Math.pow(10, (s.length() - (index + 1))));
      index ++;
    }
    if (s.charAt(0) == '-') {
      num = num * -1;
    }
    if (s.equals("-2147483648")) {
      num -= 1;
    }
    //Can't parseInt positive 2147483648; only goes up to 2147483647. 
    return num;
  }
}

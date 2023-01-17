public class ArrayDemo{
  public static void main(String[]args){
    int[] test1 = {0, 0, 0, 0};
    int[] test2 = {1, 2, 3};
    int[] test3 = {-1, -2, -3, -4, -5};
    int[] test4 = {-1, 2, 5, -64, 100};
    int[] test5 = {516265, -95413, 2};
    int[][] test6 = {{0, 1, 2, 3}, {0, 1, 2}, {0, 1}, {0}};
    int[][] test7 = {{0, -1, -2, -3}, {0, -1, -2}, {0, -1}, {0}};
    int[][] test8 = {{0}, {0, 0, 0}, {0}, {0}, {100}};
    int[][] test9 = {{59024, 23014, -2941, 445}, {0, 57, -2}};
    int[][] test10 = {{0}};
    int[][] test11 = {{1, 2, 3}, {4, 5, 6}};
    int[][] test12 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}, {13, 14, 15}};
    int[][] test13 = {{5, 90, 4, 7}};
    int[][] test14 = {{1, 4}, {4, 0}, {2, 7}};
    int[][] test15 = {{-1, 5, 33}, {-7, 52, -6}};
    System.out.println("Expected: {0, 0, 0, 0}\nOutput: " + arrToString(test1));
    System.out.println("Expected: {1, 2, 3}\nOutput: " + arrToString(test2));
    System.out.println("Expected: {-1, -2, -3, -4, -5}\nOutput: " + arrToString(test3));
    System.out.println("Expected: {-1, 2, 5, -64, 100}\nOutput: " + arrToString(test4));
    System.out.println("Expected: {516265, -95413, 2}\nOutput: " + arrToString(test5));
    System.out.println("Expected: {{0, 1, 2, 3}, {0, 1,\nOutput: 2}, {0, 1}, {0}} " + arrToString(test6));
    System.out.println("Expected: {{0, -1, -2, -3}, {0, -1, -2}, {0, -1}, {0}}\nOutput: " + arrToString(test7));
    System.out.println("Expected: {{0}, {0, 0, 0}, {0}, {0}, {100}}\nOutput: " + arrToString(test8));
    System.out.println("Expected: {{59024, 23014, -2941, 445}, {0, 57, -2}}\nOutput: " + arrToString(test9));
    System.out.println("Expected: {{0}}\nOutput: " + arrToString(test10));
    System.out.println("Expected: 4\nOutput: " + countZeros2D(test6));
    System.out.println("Expected: 4\nOutput: " + countZeros2D(test7));
    System.out.println("Expected: 6\nOutput: " + countZeros2D(test8));
    System.out.println("Expected: 1\nOutput: " + countZeros2D(test9));
    System.out.println("Expected: 1\nOutput: " + countZeros2D(test10));
    System.out.println("Expected: 0\nOutput: " + arrSum(test1));
    System.out.println("Expected: 6\nOutput: " + arrSum(test2));
    System.out.println("Expected: -15\nOutput: " + arrSum(test3));
    System.out.println("Expected: 42\nOutput: " + arrSum(test4));
    System.out.println("Expected: 420854\nOutput: " + arrSum(test5));
    System.out.println("Expected: 10\nOutput: " + arrSum(test6));
    System.out.println("Expected: -10\nOutput: " + arrSum(test7));
    System.out.println("Expected: 100\nOutput: " + arrSum(test8));
    System.out.println("Expected: 79597\nOutput: " + arrSum(test9));
    System.out.println("Expected: 0\nOutput: " + arrSum(test10));
    System.out.println("Before replaceNegative: " + arrToString(test7));
    replaceNegative(test7);
    System.out.println("Original: " + arrToString(test6) + "\nCopy: " + arrToString(copy(test6)));
    int[][] test = copy(test6);
    System.out.println("Copy before modification of original: " + arrToString(test));
    System.out.println("Original before modification: " + arrToString(test6));
    test6 = new int[][] {{0}};
    System.out.println("Copy after modification of original: " + arrToString(test));
    System.out.println("Original after modification: " + arrToString(test6));
    System.out.println("Expected: {{1, 4}, {2, 5}, {3, 6}}\nOutput: " + arrToString(swapRC(test11)));
    System.out.println("Expected: {{1, 4, 7, 10, 13}, {2, 5, 8, 11, 14}, {3, 6, 9, 12, 15}}\nOutput: " + arrToString(swapRC(test12)));
    System.out.println("Expected: {{5}, {90}, {4}, {7}}\nOutput: " + arrToString(swapRC(test13)));
    System.out.println("Expected: {{1, 4, 2}, {4, 0, 7}}\nOutput: " + arrToString(swapRC(test14)));
    System.out.println("Expected: {{-1, -7}, {5, 52}, {33, -6}}\nOutput: " + arrToString(swapRC(test15)));
  }

  //0. Include function to help you print a 1D/2D array of ints.
  public static String arrToString(int[]nums) {
    String string = "{";
    for (int x = 0; x < nums.length; x++) {
      string += nums[x];
      if (x < nums.length - 1) {
        string += ", ";
      }
    }
    return string + "}";
  }

  //The name of different methods can be the same,
  //as long as the parameters are different! (type and/or quantity must be different)
  //Pro tip: use your 1D array to string in this method!
  public static String arrToString(int[][]ary){
    String string = "{";
    for (int x = 0; x < ary.length; x++) {
      string += arrToString(ary[x]);
      if (x < ary.length - 1) {
        string += ", ";
      }
    }
    return string + "}";
  }

  //1. Calculate and return how many zeros are in the 2D array.
  public static int countZeros2D(int[][] nums){
    int count = 0;
    for (int outer = 0; outer < nums.length; outer ++) {
      for (int inner = 0; inner < (nums[outer]).length; inner++) {
        if (nums[outer][inner] == 0) {
          count ++;
        }
      }
    }
    return count;
  }

  //2. Try to calculate the sum, but use a helper function with the same name!
  //sum a 1D array of int
  public static int arrSum(int[]nums){
    int sum = 0;
    for (int x = 0; x < nums.length; x++) {
      sum += nums[x];
    }
    return sum;
  }

  //sum a 2D array of int
  public static int arrSum(int[][]nums){
    int sum = 0;
    for (int x = 0; x < nums.length; x ++) {
      sum += arrSum(nums[x]);
    }
    return sum;
  }

  //3. Modify a given 2D array of integer as follows:
  //Replace all the negative values:
  //When the row number is the same as the column number replace negative with 1
  //all other negatives replace with 0
  public static void replaceNegative(int[][] vals){
    for (int outer = 0; outer < vals.length; outer ++) {
      for (int inner = 0; inner < vals[outer].length; inner ++) {
        if (vals[outer][inner] < 0) {
          if (inner == outer) {
            vals[outer][inner] = 1;
          }
          else {
            vals[outer][inner] = 0;
          }
        }
      }
    }
    System.out.println("After replaceNegative: " + arrToString(vals));
  }

  //4. Make a copy of the given 2d array.
  //When testing : make sure that changing the original does NOT change the copy.
  //DO NOT use any built in methods that "copy" an array.
  //You SHOULD write a helper method for this.
  //If you don't see a good way to do that, you should stop and look at prior methods.
  public static int[][] copy(int[][] nums){
    int[][] copy = new int[nums.length][];
    for (int outer = 0; outer < nums.length; outer ++) {
      copy[outer] = new int[(nums[outer]).length];
      for (int inner = 0; inner < nums[outer].length; inner ++) {
        copy[outer][inner] = nums[outer][inner];
      }
    }
    return copy;
  }

  //5. Rotate an array by returning a new array with the rows and columns swapped.
  //   You may assume the array is rectangular.
  //   e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  public static int[][] swapRC(int[][]nums){
    int[][] ans = new int[nums[0].length][nums.length];
    for (int outer = 0; outer < nums.length; outer ++) {
      for (int inner = 0; inner < nums[outer].length; inner ++) {
        ans[inner][outer] = nums[outer][inner];
      }
    }
    return ans;
  }
}

public class ArrayMethods {
  /*1. return a String that represets the 2D array in the format:
{{2, 3, 4}, {5, 6, 7}, {2, 4, 9}}
Note the comma+space between values, and between arrays*/
  public static String arr2DToString(int[][]nums) {
    String string = "{";
    for (int outer = 0; outer < nums.length; outer ++) {
      string += "{";
      for (int inner = 0; inner < (nums[outer]).length; inner++) {
        string += nums[outer][inner];
        if (inner < (nums[outer]).length - 1) {
          string += ", ";
        }
      }
      string += "}";
      if (outer < nums.length - 1) {
        string += ", ";
      }
    }
    string += "}";
    return string;
  }
/*2. return the sum of all of the values in the 2D array*/
  public static int arr2DSum(int[][]nums) {
    int sum = 0;
    for (int outer = 0; outer < nums.length; outer++) {
      for (int inner = 0; inner < (nums[outer]).length; inner++) {
        sum += nums[outer][inner];
      }
    }
    return sum;
  }


  public static void main(String args[]) {
    int[][] test = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    int[][] test2 = {{1, 2, 3, 4}, {5, 6, 7}, {8, 10}};
    int[][] test3 = {{}, {1, 2}, {3, 5, 7}};
    System.out.println("arr2DToString Test Cases \n");
    System.out.println("Result: " + arr2DToString(test));
    System.out.println("Expected: {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}");
    System.out.println("Result: " + arr2DToString(test2));
    System.out.println("Expected: {{1, 2, 3, 4}, {5, 6, 7}, {8, 10}}");
    System.out.println("Result: " + arr2DToString(test3));
    System.out.println("Expected: {{}, {1, 2}, {3, 5, 7}}");

    System.out.println("arr2DSum Test Cases \n");
    System.out.println("Result: " + arr2DSum(test));
    System.out.println("Expected: 45");
    System.out.println("Result: " + arr2DSum(test2));
    System.out.println("Expected: 46");
    System.out.println("Result: " + arr2DSum(test3));
    System.out.println("Expected: 18");
  }
}
/*2. return the sum of all of the values in the 2D array */
  //public static int arr2DSum(int[][]nums)

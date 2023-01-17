import java.util.Arrays;
public class Sorts{
  public static void bubblesort(int[]data){
  	for (int count = data.length; count > 0; count --) {
      boolean flag = false;
      for (int check = 0; check < count - 1; check ++) {
        if (check == 0 || flag == true) {
        	if (data[check] > data[check + 1]) {
            int bigger = data[check];
          	data[check] = data[check + 1];
          	data[check + 1] = bigger;
            flag = true;
        	}
      	}
      }
  	}
  }
  /*Selection sort
*/
  public static void selectionsort(int [] data) {
    int swap = 0;
    for (int count = 0; count < data.length; count ++) {
      int minimum = count;
      for (int other = count; other < data.length; other++) {
        if (data[other] < data[minimum]) {
          minimum = other;
        }
      }
      swap = data[minimum];
      data[minimum] = data[count];
      data[count] = swap;
    }
  }
  public static void insertionsort(int[]data){
    int hold = 0;
    int replace = 0;
    for (int count = 1; count < data.length; count ++) {
      for (int recount = 0; recount < count; recount ++) {
        if (data[recount] > data[count]) {
          replace = data[count];
          for (int move = count; move > recount; move--) {
            data[move] = data[move - 1];
          }
          data[recount] = replace;
        }
      }
    }
  }
}

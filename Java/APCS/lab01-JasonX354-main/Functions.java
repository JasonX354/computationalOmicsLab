public class Functions{
 public static int test(int x){
  return x+1;
 }

 public static boolean makeBricks(int small, int big, int goal){
  return (goal - big * 5 == small) || (small >= 5 && (goal - big * 5) <= small) || (goal <= big * 5 && goal % 5 <= small);
  //goal has more small than needed
  //goal is exactly small + big
  //goal has more big than needed
  //goal has exact amont of smalls and bigs
 }
}

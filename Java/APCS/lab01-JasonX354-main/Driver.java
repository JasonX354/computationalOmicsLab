public class Driver{
 public static void main(String[]args){
   /**
   *Examples how to call a method from a different java file:
   */
   //store it in a variable
   int x = Functions.test(1);
   //print it
   System.out.println(Functions.test(2));
   //print it with context!
   System.out.println("test(test(4)) =" + Functions.test(Functions.test(4)));


   /**
   *Example Test Cases:
   *Note that they print the intended output in addition to the actual output.
   */
   System.out.println("makeBricks(1,1,2) should be false result:"+Functions.makeBricks(1,1,2));
   System.out.println("makeBricks(1,1,6) should be true result:"+Functions.makeBricks(1,1,6));
   System.out.println("makeBricks(0,0,1) should be false result:"+Functions.makeBricks(0,0,1));
   System.out.println("makeBricks(0,999,704) should be false result:"+Functions.makeBricks(0,999,704));
   System.out.println("makeBricks(100,100,601) should be false result:"+Functions.makeBricks(100,100,601));
   System.out.println("makeBricks(3,1,9)) should be false result:"+Functions.makeBricks(3,1,9));
   System.out.println("makeBricks(92,20,193) should be false result:"+Functions.makeBricks(92,20,193));
   System.out.println("makeBricks(999,0,89) should be true result:"+Functions.makeBricks(999,0,89));
   System.out.println("makeBricks(52,999,2784) should be true result:"+Functions.makeBricks(52,999,2784));
   System.out.println("makeBricks(6,5,30) should be true result:"+Functions.makeBricks(6,5,30));
   System.out.println("makeBricks(0,5,20) should be true result:"+Functions.makeBricks(0,5,20));
   System.out.println("makeBricks(6,7,41) should be true result:"+Functions.makeBricks(6,7,41));
 }
}

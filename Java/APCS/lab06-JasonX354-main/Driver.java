public class Driver{
  public static void main(String[]args){

    RealNumber x = new RealNumber(0.5);//prints as "0.5"
    RealNumber y = new RealNumber(5);//prints as "5.0"
    RealNumber z = new RealNumber(.6);
    System.out.println("RealNumbers:");
    System.out.println(x + ", " + y + ", " + z);


    System.out.println("compareTo testing");


    System.out.println("Expected: 0");
    System.out.println("Output: " + x.compareTo(x));
    System.out.println("Expected: -1");
    System.out.println("Output: " + x.compareTo(y));
    System.out.println("Expected: 1");
    System.out.println("Output: " + z.compareTo(x));

    System.out.println("operations testing");

    System.out.println("Expected: 5.5");
    System.out.println("Output: " + x.add(y));//Returns 5.5
    System.out.println("Expected: 1.1");
    System.out.println("Output: " + x.add(z));//Returns 1.1
    System.out.println("Expected: 10");
    System.out.println("Output: " + y.add(y));//Returns 10
    System.out.println("Expected: 0");
    System.out.println("Output: " + x.subtract(x));//Returns 0
    System.out.println("Expected: .1");
    System.out.println("Output: " + z.subtract(x));//Returns .1
    System.out.println("Expected: 4.5");
    System.out.println("Output: " + y.subtract(x));//Returns 4.5
    System.out.println("Expected: .3");
    System.out.println("Output: " + x.multiply(z));//Returns .3
    System.out.println("Expected: 3");
    System.out.println("Output: " + y.multiply(z));//Returns 3
    System.out.println("Expected: 25");
    System.out.println("Output: " + y.multiply(y));//Returns 25
    System.out.println("Expected: 1.2");
    System.out.println("Output: " + z.divide(x));//Returns 1.2
    System.out.println("Expected: .1");
    System.out.println("Output: " + x.divide(y));//Returns .1
    System.out.println("Expected: 1");
    System.out.println("Output: " + y.divide(y));//Returns 1

    System.out.println("getValue testing (Rational Number)");

    RationalNumber r0 = new RationalNumber(1, 2);
    RationalNumber r1 = new RationalNumber(389, 0);
    RationalNumber r2 = new RationalNumber(250, 1000);
    RationalNumber r3 = new RationalNumber(5, 2);
    RationalNumber r4 = new RationalNumber(3, -5);
    RationalNumber r5 = new RationalNumber(-1, 9);
    RationalNumber r6 = new RationalNumber(-2, 4);
    RationalNumber r7 = new RationalNumber(7, -14);
    RationalNumber r8 = new RationalNumber(7, 7);
    RationalNumber r9 = new RationalNumber(-1, -3);
    RationalNumber r10 = new RationalNumber(-1, 1);
    RationalNumber r11 = new RationalNumber(1, -1);
    RationalNumber r12 = new RationalNumber(0, -1);

    System.out.println("RationalNumbers:");
    System.out.println(r0 + ", " + r1 + ", " + r2 + ", " + r3 + ", " + r4 + ", " + r5 + ", " + r6 + ", " + r7 + ", " + r8 + ", " + r9 + ", " + r10 + ", " + r11 + ", " + r12);

    System.out.println("getValue testing:");
    System.out.println("Expected: .5");
    System.out.println("Output: " + r0.getValue());
    System.out.println("Expected: 0");
    System.out.println("Output: " + r1.getValue());
    System.out.println("Expected: .25");
    System.out.println("Output: " + r2.getValue());
    System.out.println("Expected: 2.5");
    System.out.println("Output: " + r3.getValue());
    System.out.println("Expected: -.6");
    System.out.println("Output: " + r4.getValue());
    System.out.println("Expected: -.111111111 ...");
    System.out.println("Output: " + r5.getValue());
    System.out.println("Expected: -.5");
    System.out.println("Output: " + r6.getValue());
    System.out.println("Expected: -.5");
    System.out.println("Output: " + r7.getValue());
    System.out.println("Expected: 1");
    System.out.println("Output: " + r8.getValue());
    System.out.println("Expected: .333333333 ...");
    System.out.println("Output: " + r9.getValue());


    System.out.println("reciprocal testing:");
    System.out.println("Expected: 2");//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    System.out.println("Output: " + r0.reciprocal());
    System.out.println("Expected: 0");
    System.out.println("Output: " + r1.reciprocal());
    System.out.println("Expected: 4");
    System.out.println("Output: " + r2.reciprocal());
    System.out.println("Expected: .4");
    System.out.println("Output: " + r3.reciprocal());
    System.out.println("Expected: -1.66666 ...");
    System.out.println("Output: " + r4.reciprocal());
    System.out.println("Expected: -9");
    System.out.println("Output: " + r5.reciprocal());
    System.out.println("Expected: -2");
    System.out.println("Output: " + r6.reciprocal());
    System.out.println("Expected: -2");
    System.out.println("Output: " + r7.reciprocal());
    System.out.println("Expected: 1");
    System.out.println("Output: " + r8.reciprocal());
    System.out.println("Expected: 3");
    System.out.println("Output: " + r9.reciprocal());
    System.out.println("Expected: -1");
    System.out.println("Output: " + r10.reciprocal());
    System.out.println("Expected: -1");
    System.out.println("Output: " + r11.reciprocal());



    RationalNumber r0copy = new RationalNumber(1, 2);
    RationalNumber r1copy = new RationalNumber(389, 0);
    RationalNumber r2copy = new RationalNumber(250, 1000);
    RationalNumber r3copy = new RationalNumber(5, 2);
    RationalNumber r4copy = new RationalNumber(3, -5);
    RationalNumber r5copy = new RationalNumber(-1, 9);
    RationalNumber r6copy = new RationalNumber(-2, 4);
    RationalNumber r7copy = new RationalNumber(7, -14);
    RationalNumber r8copy = new RationalNumber(7, 7);
    RationalNumber r9copy = new RationalNumber(-1, -3);
    RationalNumber r10copy = new RationalNumber(-1, 1);
    RationalNumber r11copy = new RationalNumber(1, -1);

    System.out.println("equals testing:");
    System.out.println("Expected: true");
    System.out.println("Output: " + r0.equals(r0copy));
    System.out.println("Expected: true");
    System.out.println("Output: " + r1.equals(r1copy));
    System.out.println("Expected: true");
    System.out.println("Output: " + r2.equals(r2copy));
    System.out.println("Expected: true");
    System.out.println("Output: " + r3.equals(r3copy));
    System.out.println("Expected: true");
    System.out.println("Output: " + r4.equals(r4copy));
    System.out.println("Expected: true");
    System.out.println("Output: " + r5.equals(r5copy));
    System.out.println("Expected: true");
    System.out.println("Output: " + r6.equals(r6copy));
    System.out.println("Expected: true");
    System.out.println("Output: " + r7.equals(r7copy));
    System.out.println("Expected: true");
    System.out.println("Output: " + r8.equals(r8copy));
    System.out.println("Expected: true");
    System.out.println("Output: " + r9.equals(r9copy));
    System.out.println("Expected: true");
    System.out.println("Output: " + r10.equals(r10copy));
    System.out.println("Expected: true");
    System.out.println("Output: " + r11.equals(r11copy));
    System.out.println("Expected: false");
    System.out.println("Output: " + r0.equals(r1copy));
    System.out.println("Expected: false");
    System.out.println("Output: " + r1.equals(r5copy));
    System.out.println("Expected: false");
    System.out.println("Output: " + r2.equals(r6copy));
    System.out.println("Expected: false");
    System.out.println("Output: " + r3.equals(r11copy));
    System.out.println("Expected: false");
    System.out.println("Output: " + r4.equals(r3));
    System.out.println("Expected: false");
    System.out.println("Output: " + r5.equals(r5.reciprocal()));
    System.out.println("Expected: false");
    System.out.println("Output: " + r6.equals(r0));
    System.out.println("Expected: false");
    System.out.println("Output: " + r7.equals(r6.reciprocal()));
    System.out.println("Expected: true");
    System.out.println("Output: " + r8.equals(r8.reciprocal()));
    System.out.println("Expected: true");
    System.out.println("Output: " + r9.equals(r9.reciprocal().reciprocal()));
    System.out.println("Expected: false");
    System.out.println("Output: " + r10.equals(r11copy));
    System.out.println("Expected: true");
    System.out.println("Output: " + r11.equals(r10.reciprocal()));

    System.out.println("GCD testing:");
    System.out.println("Expected: 15");
    System.out.println("Output: " + RationalNumber.gcd(210, 45));
    System.out.println("Expected: 1");
    System.out.println("Output: " + RationalNumber.gcd(20, 97));
    System.out.println("Expected: 21");
    System.out.println("Output: " + RationalNumber.gcd(21, 21));
    System.out.println("Expected: 5");
    System.out.println("Output: " + RationalNumber.gcd(-5, 5));
    System.out.println("Expected: 1");
    System.out.println("Output: " + RationalNumber.gcd(13, 3));
    System.out.println("Expected: 26");
    System.out.println("Output: " + RationalNumber.gcd(-9385298,-3952));
    System.out.println("Expected: 2");
    System.out.println("Output: " + RationalNumber.gcd(502,9548));
    System.out.println("Expected: 18");
    System.out.println("Output: " + RationalNumber.gcd(54,5634));

    System.out.println("reduce() testing: check list of rational numbers for simplified fractions");


    System.out.println("operations testing");
    RationalNumber a = new RationalNumber(3,5);
    RationalNumber b = new RationalNumber(2,3);
    RationalNumber c = new RationalNumber(5,9);
    RationalNumber d  = new RationalNumber(50,81);
    System.out.println("Expected 2/9: "+a.multiply(b).multiply(c));
    System.out.println("Expected 81/50: "+a.divide(b).divide(c));
    System.out.println("Expected 1: "+a.divide(b).divide(c).multiply(d));
    RealNumber three  = new RealNumber(3.0);
    System.out.println("Expected 0.54 : "+a.divide(b).divide(c).divide(three));
    System.out.println("Expected: 52/45: " + a.add(c));
    System.out.println("Expected: 1/9");
    System.out.println("Output: " + b.subtract(c));

    System.out.println("Expected: 1/4");
    System.out.println("Output: " + r0.multiply(r0));
    System.out.println("Expected: 0");
    System.out.println("Output: " + r1.multiply(r8));

  }
}

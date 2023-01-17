public class Demo{
  /* more methods can go here*/
  public static double distance(Point a, Point b) {
    return Math.pow((Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2)), .5);
  }

  public static void main(String[]args){
    Point p1 = new Point(1,1);
    Point p2 = new Point(2,2);

    System.out.println(distance(p1,p2)); //call1
    System.out.println(Point.distance(p1,p2)); //call 2
    System.out.println(p1.distanceTo(p2)); //call 3
    //This one is IMPLIED strongly. You cannot tell by the calling style alone,
    //but you can make an educated guess.

    //add more test cases here, especially ones with irrational distances so you know it works correctly.
    Point test1 = new Point(0, 0);
    Point test2 = new Point(3, 0);
    Point test3 = new Point(0, 4);
    Point test4 = new Point(10, 10);
    Point test5 = new Point(3, 5);
    Point test6 = new Point(7, 2);
    Point test7 = new Point(5, 5);
    Point test8 = new Point(7.89, 5);
    Point test9 = new Point(7, 3.49);
    System.out.println("Expected value: 5\nOutput: " + distance(test2,test3));
    System.out.println("Expected value: 5\nOutput: " + Point.distance(test2,test3));
    System.out.println("Expected value: 5\nOutput: " + test2.distanceTo(test3));
    System.out.println("Expected value: 1.49\nOutput: " + distance(test9,test6));
    System.out.println("Expected value: 1.49\nOutput: " + Point.distance(test9,test6));
    System.out.println("Expected value: 1.49\nOutput: " + test9.distanceTo(test6));
    System.out.println("Expected value: 4\nOutput: " + distance(test1,test3));
    System.out.println("Expected value: 4\nOutput: " + Point.distance(test1,test3));
    System.out.println("Expected value: 4\nOutput: " + test1.distanceTo(test3));
    System.out.println("Expected value: 2.89\nOutput: " + distance(test8,test7));
    System.out.println("Expected value: 2.89\nOutput: " + Point.distance(test8,test7));
    System.out.println("Expected value: 2.89\nOutput: " + test8.distanceTo(test7));
    System.out.println("Expected value: 7.2801098892805\nOutput: " + distance(test1,test6));
    System.out.println("Expected value: 7.2801098892805\nOutput: " + Point.distance(test1,test6));
    System.out.println("Expected value: 7.2801098892805\nOutput: " + test1.distanceTo(test6));
    System.out.println("Expected value: 1.752769237521\nOutput: " + distance(test8,test9));
    System.out.println("Expected value: 1.752769237521\nOutput: " + Point.distance(test8,test9));
    System.out.println("Expected value: 1.752769237521\nOutput: " + test8.distanceTo(test9));
    System.out.println("Expected value: 14.1421356237\nOutput: " + distance(test1,test4));
    System.out.println("Expected value: 14.1421356237\nOutput: " + Point.distance(test1,test4));
    System.out.println("Expected value: 14.1421356237\nOutput: " + test1.distanceTo(test4));
    System.out.println("Expected value: 3.1622776601684\nOutput: " + distance(test5,test3));
    System.out.println("Expected value: 3.1622776601684\nOutput: " + Point.distance(test5,test3));
    System.out.println("Expected value: 3.1622776601684\nOutput: " + test5.distanceTo(test3));
    System.out.println("Expected value: 5.0990195135928\nOutput: " + distance(test7,test3));
    System.out.println("Expected value: 5.0990195135928\nOutput: " + Point.distance(test7,test3));
    System.out.println("Expected value: 5.0990195135928\nOutput: " + test7.distanceTo(test3));
    System.out.println("Expected value: 7.8217708992274\nOutput: " + distance(test9,test1));
    System.out.println("Expected value: 7.8217708992274\nOutput: " + Point.distance(test9,test1));
    System.out.println("Expected value: 7.8217708992274\nOutput: " + test9.distanceTo(test1));
    System.out.println("Expected value: 3.605551275464\nOutput: " + distance(test7,test6));
    System.out.println("Expected value: 3.605551275464\nOutput: " + Point.distance(test7,test6));
    System.out.println("Expected value: 3.605551275464\nOutput: " + test7.distanceTo(test6));
    System.out.println("Expected value: 7.9531188850664\nOutput: " + distance(test3,test8));
    System.out.println("Expected value: 7.9531188850664\nOutput: " + Point.distance(test3,test8));
    System.out.println("Expected value: 7.9531188850664\nOutput: " + test3.distanceTo(test8));
    System.out.println("Expected value: 0\nOutput: " + distance(test1,test1));
    System.out.println("Expected value: 0\nOutput: " + Point.distance(test1,test1));
    System.out.println("Expected value: 0\nOutput: " + test1.distanceTo(test1));
    System.out.println("Expected value: 5\nOutput: " + distance(test5,test6));
    System.out.println("Expected value: 5\nOutput: " + Point.distance(test5,test6));
    System.out.println("Expected value: 5\nOutput: " + test5.distanceTo(test6));
    System.out.println("Expected value: 12.206555615734\nOutput: " + distance(test4,test2));
    System.out.println("Expected value: 12.206555615734\nOutput: " + Point.distance(test4,test2));
    System.out.println("Expected value: 12.206555615734\nOutput: " + test4.distanceTo(test2));
  }
  }

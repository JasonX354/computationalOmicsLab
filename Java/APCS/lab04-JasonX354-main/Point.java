public class Point{
  private double x,y;

  /*Return a string in the format: (x, y)
  *where x and y are the values from the Point.
  *e.g.  "(0.0, 1.23)"  or  "(-1.02, 21.45)"
  */
  public String toString(){
  	return "(" + x + ", " + y + ")";
  }

  public static double distance(Point a, Point b) {
  	return Math.pow((Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2)), .5);
  }

  public double distanceTo(Point other) {
	   return Math.pow((Math.pow(other.getX() - getX(), 2) + Math.pow(other.getY() - getY(), 2)), .5);
  }

  /*
   *When at least one value is 0.0, then the other MUST be 0.0 to be true, false otherwise.
   *When neither is zero, true when a and b differ by at most 0.001%
  */
  public static boolean closeEnough(double a, double b) {
    if (a == 0.0|| b == 0.0) {
      return (a == 0.0 && b == 0.0);
    }
    return ((a - b) / a > -.00001 && (a - b) / a < .00001);
  }

  /*Return true when the respective x and y values of the two points differ by at most 0.001% each.
  *To avoid issues: If one is 0.0, the other must be exactly 0.0.
  */
  /*Return true when the respective x and y values of the two points are closeEnough() to eachhother.
 */
  public boolean equals(Point other){
  	return (closeEnough(getX(), other.getX()) && closeEnough(getY(), other.getY()));
  }

  public Point(double X, double Y){
  	x=X;
  	y=Y;
  }
  public Point(Point p){
  	x= p.x;
  	y= p.y;
  }
  public double getX(){
  	return x;
  }
  public double getY(){
  	return y;
  }
}

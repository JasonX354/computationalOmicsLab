public class Point{
  private double x,y;
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
  static double distance(Point a, Point b) {
    return Math.pow((Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2)), .5);
  }
  public double distanceTo(Point other) {
    return Math.pow((Math.pow(other.getX() - getX(), 2) + Math.pow(other.getY() - getY(), 2)), .5);
  }
}

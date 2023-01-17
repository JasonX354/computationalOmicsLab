public class Triangle{
  //Instance Variables
  private Point v0, v1, v2;
  //Constructors
  public Triangle(double x0, double y0, double x1, double y1, double x2, double y2) {
  	v0 = new Point(x0, y0);
  	v1 = new Point(x1, y1);
  	v2 = new Point(x2, y2);
  }
  public Triangle(Point v0, Point v1, Point v2) {
  	this.v0 = v0;
  	this.v1 = v1;
  	this.v2 = v2;
  }

  //Methods
  public Point getVertex(int v) {
    if (v == 0) {
      return v0;
    }
    if (v == 1) {
      return v1;
    }
    else {
      return v2;
    }
  }
  public String toString() {
    String string = "{";
    for (int index = 0; index < 3; index++) {
      string += getVertex(index);
      if (index < 2) {
        string += ", ";
      }
    }
    return string + "}";
  }
  public double getPerimeter() {
    return Point.distance(v0, v1) + Point.distance(v1, v2) + Point.distance(v2, v0);
  }
  public void setVertex(int v, Point p) {
    if (v == 0) {
      v0 = p;
    }
    if (v == 1) {
      v1 = p;
    }
    if (v == 2) {
      v2 = p;
    }
  }
  /*Return true when the Points of the triangles are all equal() to the corresponding points of the other Triangle.
 */
  public boolean equals(Triangle other) {
    return (getVertex(0).equals(other.getVertex(0)) && getVertex(1).equals(other.getVertex(1)) && getVertex(2).equals(other.getVertex(2)));
  }
  /*Return "scalene", "isosceles", or "equilateral"
  *Make sure to use closeEnough() to determine if two sides are equal because of rounding!
  */
  public String classify(){
    int count = 0;
    if (Point.closeEnough((v1.distanceTo(v2)), (v0.distanceTo(v2)))) {
      count ++;
    }
    if (Point.closeEnough((v0.distanceTo(v1)), (v0.distanceTo(v2)))) {
      count ++;
    }
    if (count == 0) {
      return "scalene";
    }
    if (count == 1) {
      return "isosceles";
    }
    return "equilateral";
  }
  /*Return the area of the triangle
  *Make sure to use the formula: Area = sqrt ( s(s-a)(s-b)(s-c) )
  *where s= perimeter/2 , and a,b,c are the side lengths.
  */
  public double area(){
    return Math.pow(getPerimeter() / 2 * (getPerimeter() / 2 - Point.distance(getVertex(0), getVertex(1))) * (getPerimeter() / 2 - Point.distance(getVertex(1), getVertex(2))) * (getPerimeter() / 2 - Point.distance(getVertex(0), getVertex(2))), .5);
  }
}

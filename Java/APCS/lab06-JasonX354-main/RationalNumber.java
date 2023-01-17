public class RationalNumber extends RealNumber
{
  private int numerator, denominator;

  /**Initialize the RationalNumber with the provided values
  *  if the denominator is 0, make the fraction 0/1 instead.
  *  All RationalNumbers must reduce() upon construction.
  *@param nume the numerator
  *@param deno the denominator
  */
  public RationalNumber(int nume, int deno){
    super(0.0);//this value is ignored!
    if (deno == 0 || nume == 0) {
      numerator = 0;
      denominator = 1;
    }
    else {
      numerator = nume;
      denominator = deno;
      reduce();
    }
  }

  /**
  *@return the numerator
  */
  public int getNumerator(){
    return numerator;
  }
  /**
  *@return the denominator
  */
  public int getDenominator(){
    return denominator;
  }


  //NOTE! For two reasons, the @Override annotation is useful.
  //1. If the annotated method does not actually override anything, the compiler issues a warning.
  //2. It can help to make the source code more readable.

  @Override
  public double getValue(){
    return (double) getNumerator() / getDenominator();
  }

  /**
  *@return a new RationalNumber that has the same numerator
  *and denominator as this RationalNumber but reversed.
  */
  public RationalNumber reciprocal(){
    RationalNumber ans = new RationalNumber(getDenominator(), getNumerator());
    return ans;
  }

  /**
  *@return true when the RationalNumbers have the same numerators and denominators, false otherwise.
  */
  public boolean equals(RationalNumber other){
    return (getNumerator() == other.getNumerator()) && (getDenominator() == getDenominator());
  }


  /**
  *@return the value expressed as "3/4" or "8/3", however 4/1 should be "4"
  */
  @Override
  public String toString(){

    if (getDenominator() == 1 || getDenominator() == -1) {
      return "" + getNumerator() * getDenominator();
    }

    return getNumerator() + "/" + getDenominator();
  }

  /**Calculate the GCD of two integers.
  *@param a the first integers
  *@param b the second integer
  *@return the value of the GCD
  */
  public static int gcd(int a, int b){
    //COMPLETE THIS METHOD
    //use euclids method or a better one/
    // http://sites.math.rutgers.edu/~greenfie/gs2004/euclid.html
    int g = b;
    if (b > a) {
      g = a;
      a = b;
      b = g;
    }
    if (b == 0) {
      return 1;
    }
    for (int r = a % b; r != 0; r = a % b) {
      a = b;
      b = r;
      g = b;
    }
    return Math.abs(g);
  }

  /**
  *Divide the numerator and denominator by the GCD
  *This must be used to maintain that all RationalNumbers are
  *reduced upon construction.
  */

  public void reduce(){
    int newNumerator = getNumerator() / gcd(getNumerator(), getDenominator());
    int newDenominator = getDenominator() / gcd(getNumerator(), getDenominator());
    numerator = newNumerator;
    denominator = newDenominator;
  }

  /******************new math operations Return a new RationalNumber!!!!****************/
  //Note: RealNumber methods are inherited, these are NOT override, they are different methods.

  /**
  *@return a new RationalNumber that is the product of this and the other
  */
  public RationalNumber multiply(RationalNumber other){
    int newNumerator = getNumerator() * other.getNumerator();
    int newDenominator = getDenominator() * other.getDenominator();
    RationalNumber multiply = new RationalNumber(newNumerator, newDenominator);
    return multiply;
  }

  /**
  *@return a new RationalNumber that is the this divided by the other
  */
  public RationalNumber divide(RationalNumber other){
    int newNumerator = getNumerator() * other.getDenominator();
    int newDenominator = getDenominator() * other.getNumerator();
    RationalNumber divide = new RationalNumber(newNumerator, newDenominator);
    return divide;
  }

  /**
  *@return a new RationalNumber that is the sum of this and the other
  */
  public RationalNumber add(RationalNumber other){
    int newNumerator = getNumerator() * other.getDenominator() + getDenominator() * other.getNumerator();
    int newDenominator = getDenominator() * other.getDenominator();
    RationalNumber add = new RationalNumber(newNumerator, newDenominator);
    return add;
  }
  /**
  *@return a new RationalNumber that this minus the other
  */
  public RationalNumber subtract(RationalNumber other){
    int newNumerator = getNumerator() * other.getDenominator() - getDenominator() * other.getNumerator();
    int newDenominator = getDenominator() * other.getDenominator();
    RationalNumber sub = new RationalNumber(newNumerator, newDenominator);
    return sub;
  }
}

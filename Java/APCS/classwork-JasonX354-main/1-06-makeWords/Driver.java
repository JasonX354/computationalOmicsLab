public class Driver {
  public static void makeWords(int remainingLetters, String result){
    if (remainingLetters != 0) {
      for(char letter = 'a' ; letter <= 'c'; letter++){
        result += letter;
        makeWords(remainingLetters - 1, result);
        result = result.substring(0, result.length() - 1);
      }
    }
    else {
      System.out.println(result);
    }
  }
  public static void main(String[] args) {
    makeWords(3, "");
  }
}

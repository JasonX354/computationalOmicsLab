public class Recursion{

   /*Print all words that are made of the letters a-e inclusive.
    *@param length : the length of the words that are to be printed
    */
    public static void printAllWords(int length){
      //do not change this method.
      printAllWords(length,"");
    }

   /*Print all words that are made of the letters a-e inclusive.
    *@param length : either how many more letters or the total length depending on implementation
    *@param word   : the partial word so far.
    */
    public static void printAllWords(int length,String word){
      //WRITE THIS METHOD
      if (length != 0) {
        for(char letter = 'a' ; letter <= 'e'; letter++){
          word += letter;
          printAllWords(length - 1, word);
          word = word.substring(0, word.length() - 1);
        }
      }
      else {
        System.out.println(word);
      }
    }

  /*Print all words that are made of the characters in the array of letters.
    *There may not be consecutive equal letters, so:
    *aax is not allowed, but axa is allowed.
    *@param length : the length of the words that are to be printed
    *@param letters: the letters you should be using
    *@precondition: letters contains at least 2 characters, and has no duplicates.
    */
    public static void printNoDoubleLetterWords(int length,char[] letters){
      //do not change this method
      printNoDoubleLetterWords(length,"",letters);
    }

    /*Print all words that are made of the characters in letters. There may not be consecutive equal letters,
    *aax is not allowed, but axa is allowed.
    *@param length : either how many more letters need to be
    *@param word   : the partial word so far.
    *@param letters: the letters you should be using
    */
    public static void printNoDoubleLetterWords(int length,String word,char[]letters){
      //WRITE THIS METHOD
      if (length > 0) {

        for (int letter = 0; letter < letters.length; letter ++) {

          if (word.length() == 0) {
            word += letters[letter];
          }
          else {
            if (word.charAt(word.length() - 1) == letters[letter]) {
              letter ++;
            }

            if (letter < letters.length) {
              word += letters[letter];
            }
            else {
              break;
            }

          }
          printNoDoubleLetterWords(length - 1, word, letters);
          word = word.substring(0, word.length() - 1);
        }
      }

      else {
        System.out.println(word);
      }
    }

    public static String toWords(int n) {
      if (n == 0) {
        return "zero";
      }
      else {
        return toWords(n, "");
      }
    }
    public static String toWords(int n, String tracker) {
      String[] ones = new String[] {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
      String[] teens = new String[] {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
      String[] tens = new String[] {"twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety"};
      if (n == 0) {
        return "";
      }
      if (n < 10) {
        if (n == 0) {
          tracker = "";
        }
        else {
          tracker = ones[n - 1];
        }
        return tracker;
      }
      else if (n < 100) {
        if (n / 10 == 1) {
          return teens[n % 10];
        }
        else {
          tracker = tens[(n / 10) - 2];
          if (n % 10 != 0) {
            tracker += "-";
          }
        }
        return tracker + toWords(n % 10, "");
      }
      else if (n < 1000) {
        tracker += ones[(n / 100) - 1] + "-hundred ";
        if (n % 100 > 0) {
          tracker += "and ";
        }
        return tracker + toWords(n % 100, "");
      }
      else if (n < 1000000) {
        return toWords(n / 1000, "") + " thousand " + toWords(n % 1000, "");
      }
      else if (n < 1000000000) {
        return toWords(n / 1000000, "") + " million " + toWords(n % 1000000, "");
      }
      else {
        return toWords(n / 1000000000, "") + " billion " + toWords(n % 1000000000, "");
      }
    }

    public static void main(String[] args) {
      char[] array = new char[]{'a', 'b', 'z'};
      //printAllWords(3);
      printNoDoubleLetterWords(4, array);
      //System.out.println(toWords(2147483647));
    }
}

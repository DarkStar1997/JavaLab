import java.util.Scanner;
  class test
  {
  public static void main(String[] args)
  {
    Scanner kb = new Scanner(System.in);
    final int LETTERS_IN_ALPHABET = 26;
    int[] letterCounter = new int[LETTERS_IN_ALPHABET];
    System.out.print("Enter string: ");
    String string = kb.nextLine();

    for(int i = 0; i < string.length(); i++){
      char letterThere = string.charAt(i);
      int placeInLetterCtr = whereInLetterCtr(letterThere);

      letterCounter[placeInLetterCtr]++;
    }

    printNumbers(letterCounter);
    printLetters();
  }

   public static int whereInLetterCtr(char letter){
    int i =0 ;
    for(char comparisonLetter = 'a'; comparisonLetter <= 'z'; comparisonLetter++){
      if(letter == comparisonLetter){
        return i;
      }
      i++;
    }
    return i;
  }


  public static void printNumbers(int[] array){
    for(int i=0; i<array.length; i++){
      System.out.printf("%4d", array[i]);
    }

    System.out.println();
  }


  public static void printLetters(){

    for(char letter ='a'; letter <='z'; letter++){
      System.out.printf("%4c", letter);
    }
    System.out.println();
  }

}
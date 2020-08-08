import java.util.Scanner;

public class ParseStrings {
   public static void main(String[] args) {
   
   // initialize variables
   Scanner scnr = new Scanner(System.in);
   String userInput = "";
   String firstWord = "";
   String secondWord = "";
   int commaLocation = 0;
   boolean endProgram = false;
   
   while (!endProgram) {
      System.out.println("Enter input string: ");
      userInput = scnr.nextLine();
      
      if(userInput.equals("q")) {
         endProgram = true;
         continue;
         }
         
      else {
         commaLocation = userInput.indexOf(",");
         } 
         
      if (commaLocation == -1) {
         System.out.println("Error: No comma in string");
         } 
         
      else {
         firstWord = userInput.substring(0, commaLocation);
         firstWord = firstWord.replaceAll("\\s", ""); // remove space
         secondWord = userInput.substring(commaLocation + 1, userInput.length());
         secondWord = secondWord.replaceAll("\\s", ""); // remove space
         
         System.out.println("First word: " + firstWord);
         System.out.println("Second word: " + secondWord);
         System.out.println();
         System.out.println();
         }   
      }
      
      return;
   }
}

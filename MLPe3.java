import java.util.Scanner;
/* Morgan Parker
CSCE 111
1/28/19
Exercise 3
dev on a Mac
*/
//this is gonna be a fun one
class MLPe3{
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    System.out.println();
    System.out.print("Please enter an adjective: ");
    String adjective = keyboard.nextLine();
    System.out.print("Please enter a noun: ");
    String noun = keyboard.nextLine();
    System.out.print("Please enter an adjective: ");
    String adjective2 = keyboard.nextLine();
    System.out.print("PLease enter an adjective: ");
    String adjective3 = keyboard.nextLine();
    System.out.print("Please enter a verb that ends in s: ");
    String verb = keyboard.nextLine();
    System.out.print("Please enter a verb that ends in s: ");
    String verb2 = keyboard.nextLine();
    System.out.print("Please enter a noun: ");
    String noun2 = keyboard.nextLine();
    System.out.print("Please enter a company name: ");
    String company = keyboard.nextLine();
    System.out.print("Please enter a country: ");
    String country = keyboard.nextLine();
    //i was using the same string variable for multiple blanks and realized i had to use a different string name for each new blanks
    //i used print instead of println because of readability preferences

    System.out.println();
    System.out.println("Greed is Mad Libs");
    System.out.printf("\nI am not a %s of companies.\n", adjective);
    System.out.printf("I am a %s of them!\n", noun);
    System.out.printf("The point is, ladies and gentleman, that greed,\n");
    System.out.printf("for lack of a better word, is %s.\n", adjective2);
    System.out.printf("Greed is %s, greed %s.\n", adjective3, verb);
    System.out.printf("Greed %s, cuts through, and captures the essence of the %s.\n", verb2, noun2);
    System.out.printf("And greed, you mark my words, will not only save %s,\n", company);
    System.out.printf("but that other malfunctioning corporation called %s.\n", country);
    // I love this speech because the effect it had on its audience was the exact opposite of what Oliver Stone intended
    //the \n indicates that there should be a new line becuase were not using println anymore
  }//end main
}//end class

import java.util.Scanner;
import java.lang.Math;

public class HighLow {
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //5.) GAME DEVELOPMENT 101

//    The specs for the game are:
//
//    Game picks a random number between 1 and 100.
//    Prompts user to guess the number.
//    All user inputs are validated.
//    If user's guess is less than the number, it outputs "HIGHER".
//    If user's guess is more than the number, it outputs "LOWER".
//    If a user guesses the number, the game should declare "GOOD GUESS!"

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int range = 100 - 1 + 1;
        int numberToGuess = (int) ((Math.random() * range) + 1);
        System.out.println("I'm thinking of a number 1 to 100. Can you guess correctly?\n ");
        GuessNumber(numberToGuess, scan);
    }

    static int count = 10;

    public static void GuessNumber(int numberToGuess, Scanner scan){


        while(true){

            System.out.println("Enter Your Number: ");
            short userInput = Short.parseShort(scan.nextLine());
            if( userInput > numberToGuess){
                System.out.println("LOWER");
                System.out.println("Guesses Left:" + --count );
                if (count == 0) {
                    System.out.println("GAME OVER LOSER");
                    break;
                }

            } else if (userInput < numberToGuess){
                System.out.println("HIGHER");
                System.out.println("Guesses Left:" + --count );
                if (count == 0) {
                    System.out.println("GAME OVER YOUR TRASH");
                    break;
                }
            } else {
                System.out.println("GOOD GUESS!");
                break;
            }
        }
    }
}

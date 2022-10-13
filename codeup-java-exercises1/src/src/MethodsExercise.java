import java.util.Scanner;
import java.lang.Math;

import java.util.Scanner;

public class MethodsExercise {


////////////////////////////////////////////Q1 TEST ///////////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        System.out.println(Addition(10, 5));

        System.out.println(Subtraction(10, 5));

        System.out.println(Multiplication(10, 5));

        System.out.println(Division(10, 5));

////////////////////////////////////////////Q2 TEST ///////////////////////////////////////////////////////////////////


        System.out.println("getInteger(4, 8) = " + getInteger(4, 8));



////////////////////////////////////////////Q3 TEST ///////////////////////////////////////////////////////////////////
        Scanner sc = new Scanner(System.in);


        System.out.println("Please enter a number 1-10:");
        long num = sc.nextInt();

        long factorial = Factorial(num);

        System.out.printf("The factorial for your number is: " + factorial);



//////////////////////////////////////////////Q4 TEST ///////////////////////////////////////////////////////////////////
//        System.out.println("\nEnter a number to choose your dice sides:");
//         int diceSides = sc.nextInt();
//         int diceOne =
//         int diceTwo =;
Scanner scan = new Scanner(System.in);
//         int diceroll = DiceRoll(diceSides);
//
//        System.out.printf("On a " + diceSides + " sided dice, you rolled a " + diceroll);
//        System.out.printf("Your first die was a " + diceOne);
//        System.out.printf("Your second die was a " + );
rollDice(scan);

    }


//    1.)BASIC ARITHMETIC:
        //  a.) Create four separate methods. Each will perform an arithmetic operation:

        //    Addition
        //            Subtraction
        //    Multiplication
        //            Division

        // b.)   Each function needs to take two parameters/arguments so that the operation can be performed.
        //
        //c.) Test your methods and verify the output.
        //
        // d.)  Add a modulus method that finds the modulus of two numbers.
        //****************************************************************************************
        //** Food for thought: What happens if we try to divide by zero? What should happen?**
        //****************************************************************************************

    public static int Addition (int x, int y) {
        return x + y;
    };
    public static int Subtraction (int x, int y) {
        return x - y;
    };
    public static int Multiplication (int x, int y) {
        return x * y;
    };
    public static int Division (int x, int y) {
        return x / y;
    };


//    Bonus
    //    Create your multiplication method without the * operator (Hint: a loop might be helpful).
    //    Do the above with recursion.

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //    2.) VALIDATE USER INPUT:
        //    Create a method that validates that user input is in a certain range and returns that input as an integer if it is within the given range.
    //    If not, prompt the user to input their number again until the input is within range.
        //
        //    The method signature should look like this:
        //
        //
        //    public static int getInteger(int min, int max);
        //    and is used like this:
        //
        //
        //            System.out.print("Enter a number between 1 and 10: ");
        //    int userInput = getInteger(1, 10);
        //    If the input is invalid, prompt the user again.
        //
        //    Hint: recursion might be helpful here!

    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between " + min + " and " + max + ": ");
        int userInput = Integer.parseInt(scanner.nextLine());
        if(userInput<min) {
            System.out.println("Error, please enter a number in range.");
            getInteger(min, max);
        } else if (userInput>max) {
            System.out.println("Error, please enter a number in range.");
            getInteger(min, max);
        } else {
            System.out.println("Lucky guess!");
        }

    return userInput;

    };




    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//    3.)CALCULATE FACTORIAL:
        //    Calculate the factorial of a number.
        //
        //    Prompt the user to enter an integer from 1 to 10.
        //    Display the factorial of the number entered by the user.
        //    Ask if the user wants to continue.
        //    Use a for loop to calculate the factorial.
        //    Assume that the user will enter an integer, but verify it’s between 1 and 10.
        //    Use the long type to store the factorial.
        //    Continue only if the user agrees to.
        //    A factorial is a number multiplied by each of the numbers before it.
        //    Factorials are denoted by the exclamation point (n!). Ex:
        //
        //
        //            1! = 1               = 1
        //            2! = 1 x 2           = 2
        //            3! = 1 x 2 x 3       = 6
        //            4! = 1 x 2 x 3 x 4   = 24
        //    Bonus
        //
        //    Test the application and find the integer for the highest factorial that can be accurately calculated by this application, then modify the prompt so that it prompts the user for a number "from 1 to {the highest integer that returns accurate factorial calculation}". Don’t forget to change your verification too!
        //    Use recursion to implement the factorial.


    public static long Factorial (long num) {

            if (num==1) {
                return 1;
            };
           long output = Factorial(num-1) * num;
            return output;

    }


    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //4.) DICE GAME:
            //    Create an application that simulates dice rolling.
            //
            //    Ask the user to enter the number of sides for a pair of dice.
            //    Prompt the user to roll the dice.
            //"Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
            //            Use static methods to implement the method(s) that generate the random numbers.
            //    Use the .random method of the java.lang.Math class to generate random numbers.

//public static int DiceRoll (int diceSides) {
//    int diceOne  = (int)(Math.random()*diceSides +1);
//    int diceTwo = (int)(Math.random()*diceSides +1);
//    int sum = diceOne + diceTwo;
//    return sum;
//
//
//};


    public static void randomize(short sides){
        System.out.println( (int) Math.floor(Math.random() * sides + 1) );
        System.out.println( (int) Math.floor(Math.random() * sides + 1) );
    }

    public static void rollDice(Scanner scan){
        int counter = 0;

        while(true){
            counter++;
            System.out.println("\nChoose the number of sides for your dice: ");
            short sides = Short.parseShort(scan.nextLine());
            randomize(sides);
            System.out.println("Do you want to continue? y/n");
            if (scan.nextLine().equalsIgnoreCase("n")) {
                System.out.println("OK, Bye");
                break;
            }
        }
    }





}

import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//  1.) LOOP BASICS ****************************************************************************

//        a.)While
//        Create an integer variable i with a value of 5.
//        Create a while loop that runs so long as i is less than or equal to 15
//        Each loop iteration, output the current value of i, then increment i by one.
//        Your output should look like this:
//
//        5 6 7 8 9 10 11 12 13 14 15
//        int i = 5;
//        while (i <= 15) {
//            System.out.println("Currently i is : " + i);
//            i++;
//        }

//        b.)Do While
//        Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//        Alter your loop to count backwards by 5's from 100 to -10.
//        Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
//
//        2
//        4
//        16
//        256
//        65536
//        For
//    int a = 0;
//        do {
//            System.out.println(a);
//            a+=2;
//        } while (a<100);
//
//   int b = 100;
//        do {
//            System.out.println(b);
//            b-=5;
//        } while(b>=-5);
//
//    long x = 2;
//        do {
//            System.out.println(x);
//            x *= x;
//        } while (x <1000000);

////        c.)Refactor the previous two exercises to use a for loop instead.
//        for(int counter = 100; counter >= -10; counter -= 5) {
//          System.out.println(counter);
//         }
//
//        long multiplier = 2;
//
//        for(int multiplier = 2; multiplier <= 10000000; multiplier *= multiplier) {
//            System.out.println(multiplier);
//        }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// 2.) FIZZBUZZ

//        One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.
//
//                Write a program that prints the numbers from 1 to 100.
//        For multiples of three: print “Fizz” instead of the number.
//        For the multiples of five: print “Buzz”.
//        For numbers which are multiples of both three and five: print “FizzBuzz”.
//        for(int i = 1; i<=100; i++) {
//            if(i % 15 == 0) {
//                System.out.println("FIZZBUZZ");
//            } else if(i % 3 == 0) {
//                System.out.println("FIZZ");
//            } else if (i % 5 == 0) {
//                System.out.println("BUZZ");
//            } else {
//                System.out.println(i);
//            }
//        }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// 3.) POWER OF TABLES
//
    //Prompt the user to enter an integer.
    //Display a table of squares and cubes from 1 to the value entered.
    //Ask if the user wants to continue.
    //Assume that the user will enter valid data.
    //Only continue if the user agrees to.
//        boolean Continue = true;
//    Scanner sc = new Scanner(System.in);
//
//        do {
//            System.out.println("What number would you like to go up to?: ");
//            int userInt = sc.nextInt();
//            System.out.println("Here are the squares and cubes for your number: ");
//            System.out.println("");
//            System.out.println("Number | Squared | Cubed");
//            System.out.println("------------ | ------------- | -----------");
//            for(int i = 1; i <= userInt; i++) {
//                System.out.printf("%-14d", i);
//                System.out.print(" | ");
//                System.out.printf("%-14d", i * i);
//                System.out.print(" | ");
//                System.out.print(i * i * i);
//                System.out.println();
//            }
//            System.out.println("Would you like to enter another number (y/n)?");
//            String userResponse = sc.next();
//            if(!userResponse.equalsIgnoreCase("y")) {
//                Continue = false;
//            }
//        } while (Continue);
//

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        LETTER GRADES
//
//                Prompt the user for a numerical grade from 0 to 100.
//        Display the corresponding letter grade.
//                Prompt the user to continue.
//        Assume that the user will enter valid integers for the grades.
//        The application should only continue if the user agrees to.
//        Grade Ranges:
//
//        A : 100 - 88
//        B : 87 - 80
//        C : 79 - 67
//        D : 66 - 60
//        F : 59 - 0
//        boolean Continue2 = true;
//        do {
//                    System.out.println("Please enter a grade number from 0 to 100: ");
//                        int grade = sc.nextInt();
//
//            if(grade >= 97) {
//                System.out.println("Here is your grade: A+");
//            } else if (grade >=  94) {
//                System.out.println("Here is your grade: A");
//            }else if (grade >=90) {
//                System.out.println("Here is your grade: A-");
//        } else if (grade >= 87) {
//                System.out.println("Here is your grade: B+");
//            } else if (grade >= 84){
//                System.out.println("Here is your grade: B");
//            } else if (grade >= 80){
//                System.out.println("Here is your grade: B-");
//            } else if (grade >= 77) {
//                System.out.println("Here is your grade: C+");
//            } else if (grade >= 74) {
//                System.out.println("Here is your grade: C");
//            } else if (grade >= 70) {
//                System.out.println("Here is your grade: C-");
//            } else if (grade >= 67) {
//                System.out.println("Here is your grade: D+");
//            } else-if
//
//            System.out.println("Would you like to enter another grade: (y/n)?");
//            String UserResponse2 = sc.next();
//            if (!UserResponse2.equalsIgnoreCase("y")) {
//                Continue2 = false;
//            }
//
//        } while (Continue2);


    }
}

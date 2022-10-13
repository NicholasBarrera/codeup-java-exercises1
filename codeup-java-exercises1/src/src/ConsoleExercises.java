import java.util.Scanner;
import static java.lang.Integer.parseInt;


public class ConsoleExercises {

    public static void main(String[] args) {

        double pi = 3.14159;

        System.out.printf("The value of pi is approximately %.2f\n", pi);

        Scanner sc = new Scanner(System.in);

//        System.out.println("Please enter your number: ");
//             int number = sc.nextInt();
//        System.out.printf("The number entered was %s.\n", number);
//
//        System.out.println("Please enter three 3 random words:");
//            String word1 = sc.next();
//            String word2 = sc.next();
//            String word3 = sc.next();
//        System.out.printf("Your three words are \n%s\n%s\n%s.\n", word1, word2, word3);
//
//
//        sc.nextLine();
//        System.out.println("Please enter a sentence: ");
//            String sentence = sc.nextLine();
//
//        System.out.println(sentence);
//
//
//        System.out.println("Please enter the length of the classroom: \n");
//               int length = parseInt(sc.nextLine());
//        System.out.println("Please enter the width of the classroom: \n");
//               int width = parseInt(sc.nextLine());
//
//               int area = length * width;
//
//               int perim = (2 * length) + (2 * width);
//
//        System.out.printf("The area is: %d \n", area);
//        System.out.printf("The perimeter is: %d, ", perim);
        System.out.println("Pleaser enter the correct number: ");
        int userNum = sc.nextInt();
        if (userNum == 5) {
            System.out.println("Hey, 5 is a cool number.");
        } else {
            System.out.println("Wrong answer !!!!!!!!");
        }




    }

}



import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {

// 2.) BOB EXERCISE:
//        Bob is a lackadaisical teenager. In conversation, his responses are very limited.
//
//        Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
//        He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
//        He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
//        He answers 'Whatever.' to anything else.
//        Write the Java code necessary so that a user of your command line application can have a conversation with Bob.

                Scanner sc = new Scanner(System.in);
                boolean userInput = true;


                do {

                    System.out.println("Say something to bob: ");
                    String input = sc.nextLine().trim();

                    if (input.endsWith("?")) {
                        System.out.println("Sure.");
                    } else if (input.endsWith("!")) {
                        System.out.println("Whoa, chill out!");
                    } else if (input.equals("")) {
                        System.out.println("Fine. Be that way!");
                    } else {
                        System.out.println("Whatever");
                    }


                } while (userInput);


                

    }
}

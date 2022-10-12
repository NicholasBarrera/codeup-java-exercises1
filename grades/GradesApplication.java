package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Student nick = new Student("Nick");
        nick.addGrade(95);
        nick.addGrade(100);
        nick.addGrade(91);

        Student john = new Student("John");
        john.addGrade(87);
        john.addGrade(79);
        john.addGrade(90);

        Student mike = new Student("Mike");
        mike.addGrade(74);
        mike.addGrade(66);
        mike.addGrade(80);

        Student jim = new Student("Jim");
        jim.addGrade(83);
        jim.addGrade(89);
        jim.addGrade(96);

        students.put("user1",nick);
        students.put("user2",john);
        students.put("user3",mike);
        students.put("user4",jim);

        boolean Continue = true;
        do {
//        System.out.println(students);
            System.out.println("Welcome!");
            System.out.println("Here are the GitHub usernames of our students: ");
            for (String ghUsername : students.keySet()) {
                System.out.print("|" + ghUsername + "|  ");
            }
            System.out.println("\nWhat student would you like to see more information on?");
            Scanner sc = new Scanner(System.in);
            String userInput = sc.nextLine();
            if (students.containsKey(userInput)) {
                System.out.println("Name: " + students.get(userInput).getName() + " - GitHub Username: " + userInput);
                System.out.println("Current Average: " + students.get(userInput).getGradeAverage());
                ;
                System.out.println("");
                System.out.println("Would you like to select another student?[y/n]");
                String userResponse = sc.nextLine();
               if(userResponse.equalsIgnoreCase("n")) {
                   Continue = false;
                }
            }
        } while (Continue);
    }

//    public static void repeat(){
//        HashMap<String, Student> students = new HashMap<>();
//
//        Student nick = new Student("Nick");
//        nick.addGrade(95);
//        nick.addGrade(100);
//        nick.addGrade(91);
//
//        Student john = new Student("John");
//        john.addGrade(87);
//        john.addGrade(79);
//        john.addGrade(90);
//
//        Student mike = new Student("Mike");
//        mike.addGrade(74);
//        mike.addGrade(66);
//        mike.addGrade(80);
//
//        Student jim = new Student("Jim");
//        jim.addGrade(83);
//        jim.addGrade(89);
//        jim.addGrade(96);
//
//        students.put("user1",nick);
//        students.put("user2",john);
//        students.put("user3",mike);
//        students.put("user4",jim);
//
////        System.out.println(students);
//        System.out.println("Welcome!");
//        System.out.println("Here are the GitHub usernames of our students: ");
//        for (String ghUsername : students.keySet()) {
//            System.out.print("|" + ghUsername + "|  ");
//        }
//        System.out.println("\nWhat student would you like to see more information on?");
//        Scanner sc = new Scanner(System.in);
//        String userInput = sc.nextLine();
//        if (students.containsKey(userInput)){
//            System.out.println("Name: " + students.get(userInput).getName() + " - GitHub Username: " + userInput );
//            System.out.println("Current Average: " + students.get(userInput).getGradeAverage());;
//            System.out.println("");
//            System.out.println("Would you like to select another student?[y/n]");
//            String userInput2 = sc.nextLine();
//            if (userInput2.equals("y")){
//                repeat();
//            }else{
//                System.out.println("Goodbye!");
//            }
//
//        }else{
//            System.out.println("Sorry, that doesn't match anyone in our database");
//            System.out.println("Would you like to continue?(y for yes/n for no)");
//            String userInput2 = sc.nextLine();
//            if (userInput2.equals("y")){
//                repeat();
//            }else{
//                System.out.println("Goodbye!");
//            }
//        }

    }


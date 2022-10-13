package grades;

public class StudentTest {
    public static void main(String[] args) {

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


        System.out.printf("Jim's average is " + jim.getGradeAverage());

    }
}

package shapes;

import util.Input;


public class CircleApp {
    public static void main(String[] args) {
        System.out.println("Enter a radius: ");
        Input input = new Input();
        double userRadius = input.getDouble();
        Circle circle = new Circle(userRadius);
        double area = circle.getArea();
        double circumference = circle.getCircumference();
        System.out.printf("Your circle has a area of  " + area);
        System.out.printf("\nYour circle has a circumference of  " + circumference);




    }
}

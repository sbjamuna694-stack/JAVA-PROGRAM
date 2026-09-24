import java.util.Scanner;

public class AreaPerimeter {

    // Square
    static double squareArea(double side) {
        return side * side;
    }

    static double squarePerimeter(double side) {
        return 4 * side;
    }

    // Rectangle
    static double rectangleArea(double length, double breadth) {
        return length * breadth;
    }

    static double rectanglePerimeter(double length, double breadth) {
        return 2 * (length + breadth);
    }

    // Triangle
    static double triangleArea(double base, double height) {
        return 0.5 * base * height;
    }

    static double trianglePerimeter(double a, double b, double c) {
        return a + b + c;
    }

    // Circle
    static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    static double circlePerimeter(double radius) {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Square
        System.out.print("Enter side of square: ");
        double side = sc.nextDouble();

        System.out.println("Area of Square = " + squareArea(side));
        System.out.println("Perimeter of Square = " + squarePerimeter(side));

        // Rectangle
        System.out.print("\nEnter length of rectangle: ");
        double length = sc.nextDouble();

        System.out.print("Enter breadth of rectangle: ");
        double breadth = sc.nextDouble();

        System.out.println("Area of Rectangle = " + rectangleArea(length, breadth));
        System.out.println("Perimeter of Rectangle = " + rectanglePerimeter(length, breadth));

        // Triangle
        System.out.print("\nEnter base of triangle: ");
        double base = sc.nextDouble();

        System.out.print("Enter height of triangle: ");
        double height = sc.nextDouble();

        System.out.print("Enter first side of triangle: ");
        double a = sc.nextDouble();

        System.out.print("Enter second side of triangle: ");
        double b = sc.nextDouble();

        System.out.print("Enter third side of triangle: ");
        double c = sc.nextDouble();

        System.out.println("Area of Triangle = " + triangleArea(base, height));
        System.out.println("Perimeter of Triangle = " + trianglePerimeter(a, b, c));

        // Circle
        System.out.print("\nEnter radius of circle: ");
        double radius = sc.nextDouble();

        System.out.println("Area of Circle = " + circleArea(radius));
        System.out.println("Perimeter of Circle = " + circlePerimeter(radius));

        sc.close();
    }
}

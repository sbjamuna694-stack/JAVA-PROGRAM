import java.util.Scanner;

public class topper {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        // Student 1
        System.out.print("Enter name: ");
        String n1 = obj.nextLine();
        System.out.print("Enter age: ");
        int a1 = obj.nextInt();

        System.out.print("Enter 5 subject marks: ");
        int s11 = obj.nextInt();
        int s12 = obj.nextInt();
        int s13 = obj.nextInt();
        int s14 = obj.nextInt();
        int s15 = obj.nextInt();

        int t1 = s11 + s12 + s13 + s14 + s15;
        int av1 = t1 / 5;


        // Student 2
        System.out.print("Enter name: ");
        String n2 = obj.next();
        System.out.print("Enter age: ");
        int a2 = obj.nextInt();

        System.out.print("Enter 5 subject marks: ");
        int s21 = obj.nextInt();
        int s22 = obj.nextInt();
        int s23 = obj.nextInt();
        int s24 = obj.nextInt();
        int s25 = obj.nextInt();

        int t2 = s21 + s22 + s23 + s24 + s25;
        int av2 = t2 / 5;


        // Student 3
        System.out.print("Enter name: ");
        String n3 = obj.next();
        System.out.print("Enter age: ");
        int a3 = obj.nextInt();

        System.out.print("Enter 5 subject marks: ");
        int s31 = obj.nextInt();
        int s32 = obj.nextInt();
        int s33 = obj.nextInt();
        int s34 = obj.nextInt();
        int s35 = obj.nextInt();

        int t3 = s31 + s32 + s33 + s34 + s35;
        int av3 = t3 / 5;


        // Student 4
        System.out.print("Enter name: ");
        String n4 = obj.next();
        System.out.print("Enter age: ");
        int a4 = obj.nextInt();

        System.out.print("Enter 5 subject marks: ");
        int s41 = obj.nextInt();
        int s42 = obj.nextInt();
        int s43 = obj.nextInt();
        int s44 = obj.nextInt();
        int s45 = obj.nextInt();

        int t4 = s41 + s42 + s43 + s44 + s45;
        int av4 = t4 / 5;


        // Student 5
        System.out.print("Enter name: ");
        String n5 = obj.next();
        System.out.print("Enter age: ");
        int a5 = obj.nextInt();

        System.out.print("Enter 5 subject marks: ");
        int s51 = obj.nextInt();
        int s52 = obj.nextInt();
        int s53 = obj.nextInt();
        int s54 = obj.nextInt();
        int s55 = obj.nextInt();

        int t5 = s51 + s52 + s53 + s54 + s55;
        int av5 = t5 / 5;


        // Display
        System.out.println("\n--- Student Details ---");

        System.out.println(n1 + "  Age: " + a1 + "  Total: " + t1 + "  Average: " + av1);
        System.out.println(n2 + "  Age: " + a2 + "  Total: " + t2 + "  Average: " + av2);
        System.out.println(n3 + "  Age: " + a3 + "  Total: " + t3 + "  Average: " + av3);
        System.out.println(n4 + "  Age: " + a4 + "  Total: " + t4 + "  Average: " + av4);
        System.out.println(n5 + "  Age: " + a5 + "  Total: " + t5 + "  Average: " + av5);


        // Find topper using if-else
        String topper;
        int highest;

        if (t1 >= t2 && t1 >= t3 && t1 >= t4 && t1 >= t5) {
            topper = n1;
            highest = t1;
        } else if (t2 >= t1 && t2 >= t3 && t2 >= t4 && t2 >= t5) {
            topper = n2;
            highest = t2;
        } else if (t3 >= t1 && t3 >= t2 && t3 >= t4 && t3 >= t5) {
            topper = n3;
            highest = t3;
        } else if (t4 >= t1 && t4 >= t2 && t4 >= t3 && t4 >= t5) {
            topper = n4;
            highest = t4;
        } else {
            topper = n5;
            highest = t5;
        }

        System.out.println("\nClass Topper: " + topper);
        System.out.println("Highest Total: " + highest);

    
    }
}

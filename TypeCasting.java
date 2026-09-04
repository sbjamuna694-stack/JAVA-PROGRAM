public class TypeCasting {
    public static void main(String[] args) {

        // Widening Type Casting
        int a = 10;
        double b = a;

        System.out.println("Widening Casting:");
        System.out.println("Integer value: " + a);
        System.out.println("Double value: " + b);

        // Narrowing Type Casting
        double x = 10.75;
        int y = (int) x;

        System.out.println("\nNarrowing Casting:");
        System.out.println("Double value: " + x);
        System.out.println("Integer value: " + y);
    }
}

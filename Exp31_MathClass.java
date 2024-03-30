public class Exp31_MathClass {
    public static void main(String[] args) {
        // Example 1: Math.max()
        int a = 10;
        int b = 20;
        int maxResult = Math.max(a, b);
        System.out.println("Maximum of " + a + " and " + b + " is: " + maxResult);

        // Example 2: Math.min()
        double x = 3.5;
        double y = 2.5;
        double minResult = Math.min(x, y);
        System.out.println("Minimum of " + x + " and " + y + " is: " + minResult);

        // Example 3: Math.abs()
        int num = -15;
        int absResult = Math.abs(num);
        System.out.println("Absolute value of " + num + " is: " + absResult);

        // Example 4: Math.sqrt()
        double squareRoot = Math.sqrt(25);
        System.out.println("Square root of 25 is: " + squareRoot);

        // Example 5: Math.pow()
        double base = 2;
        double exponent = 3;
        double powerResult = Math.pow(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + powerResult);
    }
}

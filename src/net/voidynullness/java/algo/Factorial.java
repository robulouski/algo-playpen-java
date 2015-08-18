package net.voidynullness.java.algo;

/*
 * Recursive factorial implementation.
 *
 */
public class Factorial {
    static long factorial(long n) {
        if (n <= 1)
            return 1;

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("Factorial");
        if (args.length > 0) {
            System.out.println("Input " + args[0]);
            long result = factorial(Long.parseLong(args[0]));
            System.out.print(result);
        }
    }
}

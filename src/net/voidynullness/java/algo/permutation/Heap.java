package net.voidynullness.java.algo.permutation;


public class Heap {
    static int perms;
    static int swaps;

    public static void permutations_print(String s) {
        perms = 0;
        swaps = 0;
        generate_print(s.toCharArray(), s.length());
    }

    public static void generate_print(char[] arr, int n) {
        if (n == 1) {
            output_print(arr);
            perms++;
        }
        else {
            for (int c = 0; c < n; c++) {
                generate_print(arr, n - 1);
                if (c < n - 1) {   // prevents unnecessary swaps at the end of each recursive call
                    if (n % 2 == 1) {
                        // If n is odd, swap first and last elements
                        swap(arr, n - 1, 0);
                        //System.out.println("\t[ODD] N=" + n + " c=" + c);
                    } else {
                        // ...otherwise swap c-th and last elements
                        swap(arr, n - 1, c);
                        //System.out.println("\t[EVEN] N=" + n + " c=" + c);
                    }
                }
            }
        }
    }

    public static void output_print(char [] arr) {
        String str = new String(arr);
        System.out.println(str);
    }

    public static void swap(char[] a, int x, int y){
        char tmp = a[x];
        a[x] = a[y];
        a[y] = tmp;
        swaps++;
    }

    public static void main(String[] args) {
        System.out.println("Heap method permutation generation [print output]");
        if (args.length > 0) {
            System.out.println("Input: " + args[0]);
            permutations_print(args[0]);
        }
        System.out.println("------------------------");
        System.out.println("Count: " + perms + "   Swaps: " + swaps);
        System.out.println("------------------------");
    }
}

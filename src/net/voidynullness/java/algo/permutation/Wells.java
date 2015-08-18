package net.voidynullness.java.algo.permutation;

public class Wells {
    static int count = 0;

    public static void permutations_print(String s) {
        generate_print(s.toCharArray(), s.length());
    }

    public static void generate_print(char[] arr, int n) {
        if (n <= 1)
            return;

        if (n == 2) {
            output_print(arr);
            count++;
            swap(arr, n - 1, n - 2);
            output_print(arr);
            count++;
        }
        else {
            for (int c = 0; c < n; c++) {
                generate_print(arr, n - 1);
                if (c < n - 1) {
                    if ((n % 2 == 0) && c > 1) {
                        swap(arr, n - 1, n - c -2);
                        System.out.println("\t[EVEN] N=" + n + " c=" + c);
                    } else {
                        swap(arr, n - 1, n - 2);
                        System.out.println("\t[SWAP] N=" + n + " c=" + c);
                    }
                }
            }
        }
    }

    public static void output_print(char [] arr) {
        String str = new String(arr);
        System.out.println(str);
    }

    public static void swap(char[] arr, int x, int y){
        char tmp = arr[x];
        arr[x] = arr[y];
        arr[y] = tmp;
    }

    public static void main(String[] args) {
        System.out.println("Wells (string print)");
        if (args.length > 0) {
            System.out.println("Input: " + args[0]);
            permutations_print(args[0]);
        }
        System.out.println("------------------------");
        System.out.println("Count: " + count);
        System.out.println("------------------------");
    }
}

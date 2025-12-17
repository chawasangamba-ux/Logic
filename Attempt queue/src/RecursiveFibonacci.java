/**
*Author:chawa sang'amba
* date:16/06/2025
* purpose:binary search in an array
 */
class RecursiveFibonacci {

    // Recursive method to find the nth Fibonacci number
    public static int fibonacci(int n) {
        if (n <= 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 10; // Number of terms

        System.out.println("Fibonacci Sequence using Recursion:");

        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
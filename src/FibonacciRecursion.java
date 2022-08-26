public class FibonacciRecursion {

    // take n number from user and return that position of Fibonacci number
    // 0 1 1 2 3 5 8 13 21 34 55

    public static void main(String[] args) {

        System.out.println(fibonacci(6));

    }

    static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return (fibonacci(n - 1) + fibonacci(n - 2));
    }

}

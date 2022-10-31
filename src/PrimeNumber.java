public class PrimeNumber {

    /*
    Prime number
        Give a number determine if it is a prime number. A prime number is a number that is only divisible by 1 and itself.
        Ex:
            Input:
                11
            Output:
                prime
        Ex:
            Input:
                10
            Output:
                not prime
     */

    public static void main(String[] args) {
        isPrime1(17);
        isPrime2(17);
        System.out.println(isPrime3(17));
        System.out.println(isPrime4(17));
    }

    // OPTION 1
    public static void isPrime1(int n) {
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                count++;
                break;
            }
        }
        if (count == 0 && n != 1) {
            System.out.println("Number is Prime: " + n);
        } else {
            System.out.println("Number is Not Prime: " + n);
        }
    }


    // OPTION 2
    public static void isPrime2(int n) {
        boolean isPrime = true;
        if (n < 2) {
            System.out.println("Not prime");
            System.exit(0);
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime ? "Prime" : "Not Prime");
    }


    // OPTION 3
    public static boolean isPrime3(int n) {
        if (n <= 1) {
            return false;
        }
        int a = 2;
        while (a * a <= n) {
            if (n % a == 0) {
                return false;
            }
            a++;
        }
        return a * a > n;           // the algo checked till sqrt of the number that means no number was able to divide n evenly. Thus no need to check further.
    }

    // OPTION 4 - option 3 modified a bit
    public static boolean isPrime4(int n) {
        if (n <= 1) {
            return false;
        }
        int a = 2;
        while (a <= Math.sqrt(n)) {
            if (n % a == 0) {
                return false;
            }
            a++;
        }
        return true;
    }
}
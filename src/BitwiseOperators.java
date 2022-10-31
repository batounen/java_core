public class BitwiseOperators {

    public static void main(String[] args) {
        // LEFT shift operator ( << )
        int a = 30 << 1;
        System.out.println(a);                              // 60 left shift doubles the number

        // RIGHT shift operator ( >> )
        int b = 20 >> 1;
        System.out.println(b);                              // 10 right shift halves the number

        System.out.println(isOdd(8));                       // false
        System.out.println(digitCounter(5123123));      // 7
        System.out.println(powerOfTwo(32));             // true
    }


    // AND -> if there are 2 numbers both should be true (1 1 -> 1, 1 0 -> 0)
    static boolean isOdd(int n) {
        return (n & 1) == 1;
    }

    // OR -> if 1 of them is True it is True (0 1 -> 1, 1 1 -> 1)


    /* X OR (^) - EXCLUSIVE OR -> only 1 should be True (1) -> (1 1 -> 0, 1 0 -> 1)
            a ^ 1 = a with line above (opposite aka complement)
            a ^ 0 = a
            a ^ a = 0
         */

    static int ans(int... arr) {
        int unique = 0;
        for (int n : arr) {
            unique ^= n;
        }
        return unique;
    }

    // Find number of digits
    static int digitCounter(int num) {
        int a = 10;
        return (int) (Math.log(num) / Math.log(a)) + 1;
    }

    // Power of Two check
    static boolean powerOfTwo(int num) {
        return (num & (num - 1)) == 0;
    }

}
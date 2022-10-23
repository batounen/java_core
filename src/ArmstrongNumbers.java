public class ArmstrongNumbers {

    /*
    Write a method that can check if a number is Armstrong number
        Note: if I have a 3-digit number then each of the digits is raised to the power of three and added to obtain a number. If the number obtained equals the original number then, we call that armstrong number.
        Armstrong numbers are == 153 370 371 407 == for 3 digits
     */

    public static void main(String[] args) {
        System.out.println(armstrongNumber(370));
        System.out.println(armstrongNumberStringWay(153));

    }


    // OPTION 1 - Integer way
    public static boolean armstrongNumber(int num) {
        int x = num, digit, total = 0;
        while (x > 0) {
            digit = x % 10;
            total += Math.pow(digit, 3);
            x /= 10;
        }
        return num == total;
    }


    // OPTION 2 - String way
    public static boolean armstrongNumberStringWay(int num) {
        int total = 0;
        String str = Integer.toString(num);
        String[] s = str.split("");
        for (String each : s) {
            total += Math.pow(Integer.parseInt(each), str.length());
        }
        return total == num;
    }

}
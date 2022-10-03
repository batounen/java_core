public class Array_MaximumProfit {

    /*
    We are given an array of prices for a given stock. ith  element of this array represents the price of the stock on  day i.
    We are only permitted to complete only one transaction(buy one or sell one share of the stock) per day.
    Write a Java function to find the maximum profit.
        Note that a stock can’t be sold before buying.
        Example:
            Input: [8,3,3,1,4,9,12,11]
            Output: 11
        Explanation: Buy on day 4 (price = 1) and sell on day 7 (price = 12), profit = 12-1 = 11.
        Not 8-1 = 7, as the selling price needs to be larger than buying price.
     */

    // OPTION 1
    public static int maximumProfit1(int[] arr) {
        int buy = Integer.MAX_VALUE, sell = Integer.MIN_VALUE;
        int left = 0, right = arr.length - 1;

        while (left < right) {
            buy = Integer.min(buy, arr[left]);
            sell = Integer.max(sell, arr[right]);
            left++;
            right--;
        }
        return sell - buy;
    }


    // OPTION 2
    public static int maximumProfit2(int[] arr) {
        int buy = Integer.MAX_VALUE, sell = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length - 1; i++) {
            buy = Integer.min(buy, arr[i]);
            for (int j = i + 1; j < arr.length; j++) {
                sell = Integer.max(sell, arr[j]);
            }
        }
        return sell - buy;
    }


    public static void main(String[] args) {
        System.out.println(maximumProfit1(new int[]{8, 3, 3, 1, 4, 9, 12, 11}));
        System.out.println(maximumProfit2(new int[]{8, 3, 3, 1, 4, 9, 12, 11}));
    }
}
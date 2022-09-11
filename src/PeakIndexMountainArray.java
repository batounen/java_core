public class PeakIndexMountainArray {

    /*
    An array arr a mountain if the following properties hold:
        arr.length >= 3
        There exists some i with 0 < i < arr.length - 1 such that:
            arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
            arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
    Given a mountain array arr, return the index i such that arr[0] < arr[1] < ... < arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1].
    You must solve it in O(log(arr.length)) time complexity.
    Example 1:
        Input: arr = [0,1,0]
        Output: 1
    Example 2:
        Input: arr = [0,2,1,0]
        Output: 1
    Example 3:
        Input: arr = [0,10,5,2]
        Output: 1
     */


    // Linear search - 1 ms, faster than 16.67% & 59.1 MB, less than 95.48%
    public int peakIndexInMountainArray1(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return i;
            }
        }
        return -1;
    }


    // Binary search - 0 ms, faster than 100.00% & 59 MB, less than 98.20%
    public static int peakIndexInMountainArray2(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]) {
                return mid;
            } else if (arr[mid] < arr[mid - 1]) {
                end = mid - 1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] arr = {24,69,100,99,79,78,67,36,26,19};
        System.out.println(peakIndexInMountainArray2(arr));
    }
}
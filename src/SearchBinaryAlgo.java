import java.util.Arrays;

public class SearchBinaryAlgo {

    /*
    Find the target from the given int[] and return its index number. If the target is not found return -1.
     */

    // if the given int[] is RANDOM (not sorted)
    static int binarySearch1(int[] arr, int target) {

        Arrays.sort(arr);                                   // Array needs to be sorted thus included in the algorithm
        int start = 0, end = arr.length - 1, middle;           // int middle can be declared inside the loop as well

        while (start <= end) {
            middle = start + (end - start) / 2;                     // (start + end) / 2 -> may exceed int MAX_VALUE for big data
            if (arr[middle] > target) {
                end = middle - 1;
            } else if (arr[middle] < target) {
                start = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }


    // if the given int[] is sorted either ascending or descending order
    static int binarySearch2(int[] arr, int target) {

        int start = 0, end = arr.length - 1, mid;
        boolean isAscending = arr[start] < arr[end];

        while (start <= end) {
            mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAscending) {
                if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (arr[mid] < target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] test = {856, 973, 729, 374, 978, 644, 523, 758, 799, 1000, 651, 486, 806, 752, 15, 11, 222, 783, 325, 444, 77, 922, 898, 213, 919, 546, 524, 813, 790, 65, 752, 196, 451, 644, 635, 522, 405, 389, 67, 793, 706, 816, 875, 634, 325, 937, 380, 911, 363, 879, 969, 189, 387, 171, 376, 933, 89, 745, 908, 611, 963, 231, 82, 542, 810, 94, 219, 659, 208, 963, 945, 765, 223, 809, 977, 670, 452, 663, 668, 504, 970, 387, 927, 847, 558, 813, 229, 178, 387, 283, 926, 960, 73, 534, 218, 924, 278, 579, 103, 225, 235, 87, 723, 401, 0, 604, 909, 677, 903, 580, 907, 813, 300, 175, 950, 163, 397, 553, 230, 481, 475, 217, 208, 82, 55, 132, 721, 207, 642, 47, 595, 873, 988, 980, 90, 35, 142, 732, 577, 22, 345, 9, 393, 238, 500, 481, 327, 776, 235, 922, 439, 620, 177, 8, 812, 265, 299, 261, 487, 582, 750, 272, 165, 673, 474, 910, 320, 724, 408, 940, 868, 366, 897, 206, 120, 799, 378, 194, 351, 370, 757, 89, 973, 275, 2, 503, 8, 272, 815, 892, 914, 648, 233, 486, 461, 110, 246, 892, 583, 230, 92, 482, 219, 774, 515, 191, 793, 161, 234, 989, 963, 261, 840, 160, 801, 608, 35, 525, 516, 552, 610, 74, 372, 207, 720, 775, 571, 692, 139, 835, 90, 684, 894, 445, 495, 184, 351, 346, 779, 690, 988, 221, 277, 657, 799, 443, 156, 199, 935, 978, 655, 81, 439, 777, 897, 273, 972, 774, 974, 198, 788, 460, 561, 273, 496, 544, 665, 983, 371, 826, 516, 706, 711, 359, 310, 357, 783, 889, 881, 734, 177, 853, 233, 725, 208, 445, 18, 414, 225, 941, 513, 167, 274, 535, 297, 418, 8, 75, 696, 470, 791, 729, 754, 983, 528, 694, 161, 477, 702, 254, 628, 752, 765, 448, 851, 820, 994, 580, 810, 394, 400, 664, 834, 247, 908, 821, 420, 530, 537, 463, 317, 549, 688, 164, 976, 968, 33, 450, 367, 188, 768, 303, 202, 278, 408, 140, 748, 391, 440, 483, 913, 638, 664, 588, 690, 254, 944, 135, 990, 550, 669, 91, 189, 867, 332, 611, 519, 912, 666, 750, 498, 310, 428, 302, 358, 354, 503, 958, 431, 439, 367, 620, 507, 752, 49, 550, 891, 510, 634, 208, 373, 859, 969, 26, 336, 878, 251, 375, 517, 656, 867, 831, 72, 974, 176, 161, 946, 122, 335, 790, 476, 888, 390, 147, 8, 630, 726, 364, 552, 122, 338, 463, 692, 299, 794, 737, 512, 43, 275, 943, 370, 795, 105, 140, 856, 870, 929, 942, 815, 247, 528, 407, 300, 583, 169, 332, 293, 75, 791, 874, 245, 442, 899, 496, 23, 89, 786, 188, 609, 810, 635, 83, 109, 136, 25, 654, 120, 462, 420, 819, 749, 65, 397, 709, 331, 200, 405, 158, 578, 333, 787, 480, 748, 910, 66, 674, 928, 60, 825, 614, 885, 903, 419, 111, 304, 277, 876, 433, 890, 7};

        System.out.println(binarySearch1(test, 709));            // 340
    }
}
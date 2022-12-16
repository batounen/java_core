import java.util.*;
import java.util.stream.Collectors;

public class LastStoneWeight {

    /*
    You are given an array of integers stones where stones[i] is the weight of the ith stone.
    We are playing a game with the stones. On each turn, we choose the heaviest two stones and smash them together. Suppose the heaviest two stones have weights x and y with x <= y. The result of this smash is:
    If x == y, both stones are destroyed, and
    If x != y, the stone of weight x is destroyed, and the stone of weight y has new weight y - x.
    At the end of the game, there is at most one stone left.
    Return the weight of the last remaining stone. If there are no stones left, return 0.
    Example 1:
        Input: stones = [2,7,4,1,8,1]
        Output: 1
        Explanation:
        We combine 7 and 8 to get 1 so the array converts to [2,4,1,1,1] then,
        we combine 2 and 4 to get 2 so the array converts to [2,1,1,1] then,
        we combine 2 and 1 to get 1 so the array converts to [1,1,1] then,
        we combine 1 and 1 to get 0 so the array converts to [1] then that's the value of the last stone.
    Example 2:
        Input: stones = [1]
        Output: 1
    Constraints:
        1 <= stones.length <= 30
        1 <= stones[i] <= 1000
     */


    // OPTION 1 - 8 ms, faster than 6.30% & 41.2 MB, less than 74.99%
    public int lastStoneWeight1(int[] stones) {
        List<Integer> list = Arrays.stream(stones).boxed().sorted().collect(Collectors.toList());
        while (list.size() > 1) {
            int lastDigit = list.get(list.size() - 1);
            int secondLastDigit = list.get(list.size() - 2);
            int lastIndex = list.size() - 1;
            int secondLastIndex = list.size() - 2;
            if (lastDigit > secondLastDigit) {
                list.set(lastIndex, lastDigit - secondLastDigit);
                list.remove(secondLastIndex);
                Collections.sort(list);
            } else if (lastDigit == secondLastDigit) {
                list.remove(secondLastIndex);
                list.remove(lastIndex - 1);
            }
        }
        if (list.size() == 0) {
            return 0;
        } else {
            return list.get(0);
        }
    }


    // OPTION 2 - 3 ms, faster than 42.93% & 41.7 MB, less than 45.15%
    public int lastStoneWeight2(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>();
        for (int stone : stones) {
            maxHeap.add(-stone);            // its min as default. so flip the sign to make it max
        }
        while (maxHeap.size() > 1) {
            int stoneOne = -maxHeap.remove();
            int stoneTwo = -maxHeap.remove();
            if (stoneOne != stoneTwo) {
                maxHeap.add(-(stoneOne - stoneTwo));
            }
        }
        return maxHeap.isEmpty() ? 0 : -maxHeap.remove();
    }

    // OPTION 3 - 1 ms, faster than 99.64% & 41.7 MB, less than 95.21%
    public static int lastStoneWeight3(int[] stones) {

//        lambda to order descending
//        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);

        // Collections class to order descending
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int stone : stones) {
            pq.offer(stone);
        }

        while (pq.size() > 1) {
            int x = pq.poll();
            int y = pq.poll();
            if (x != y) {
                pq.offer(Math.abs(x - y));
            }
        }
        return pq.isEmpty() ? 0 : pq.poll();
    }
}
package AlgorithmsAndDataStructure.week_23;

import java.util.ArrayDeque;
import java.util.Deque;

public class LongestContinuousSubarrayWithAbsoluteDiffLessThanOrEqualToLimit_1438_Medium {
    public static void main(String[] args) {}

    public static int longestSubarray(int[] nums, int limit) {
        Deque<Integer> maxDeque = new ArrayDeque<>();
        Deque<Integer> minDeque = new ArrayDeque<>();

        int left = 0;
        int maxLength = 0;
        for (int right = 0; right < nums.length; right++) {
            while (!maxDeque.isEmpty() && maxDeque.peekLast() < nums[right]) maxDeque.pollLast();
            while (!minDeque.isEmpty() && minDeque.peekLast() > nums[right]) minDeque.pollLast();

            maxDeque.offerLast(nums[right]);
            minDeque.offerLast(nums[right]);

            while (maxDeque.peekFirst() - minDeque.peekFirst() > limit) {
                if (maxDeque.peekFirst() == nums[left]) maxDeque.pollFirst();
                if (minDeque.peekFirst() == nums[left]) minDeque.pollFirst();
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}

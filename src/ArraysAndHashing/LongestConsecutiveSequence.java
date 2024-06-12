package ArraysAndHashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

    //problem link : https://leetcode.com/problems/longest-consecutive-sequence/description/
    //solution video : https://www.youtube.com/watch?v=P6RZZMu_maU

    public int longestConsecutive(int[] nums) {

        int res = 0;

        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }

        for (int i : nums) {
            if (!set.contains(i - 1)) {
                int currMax = 0;
                while (set.contains(i + currMax)) {
                    currMax += 1;
                }
                res = Math.max(res, currMax);
            }
        }

        return res;

    }
}

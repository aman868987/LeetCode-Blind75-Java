package ArraysAndHashing;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    // Problem Link : https://leetcode.com/problems/two-sum/description/
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];

        for (int i = 0; i <= nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                res[0] = i;
                res[1] = map.get(target - nums[i]);
                break;
            } else {
                map.put(nums[i], i);
            }
        }

        return res;


    }
}

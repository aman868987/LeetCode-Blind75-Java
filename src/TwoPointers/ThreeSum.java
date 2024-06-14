package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    //problem link : https://leetcode.com/problems/3sum/description/
    //video : https://www.youtube.com/watch?v=jzZsG8n2R9A

    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];

                if (sum > 0) {
                    k -= 1;
                } else if (sum < 0) {
                    j += 1;
                } else {
                    res.add(List.of(nums[i], nums[j], nums[k]));
                    j += 1;
                    while (nums[j] == nums[j - 1] && j < k) {
                        j += 1;
                    }
                }
            }
        }

        return res;

    }
}

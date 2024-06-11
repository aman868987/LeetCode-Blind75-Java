package ArraysAndHashing;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    //problem link : https://leetcode.com/problems/product-of-array-except-self/description/
    // video solution : https://www.youtube.com/watch?v=bNvIQI2wAjk
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Arrays.fill(result, 1);

        int prefix = 1;
        for (int i = 0; i < n; i++) {
            result[i] = prefix;
            prefix = prefix * nums[i];
        }

        int postfix = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] = result[i] * postfix;
            postfix = postfix * nums[i];
        }
        return result;

    }
}

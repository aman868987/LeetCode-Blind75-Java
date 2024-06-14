package TwoPointers;

public class TwoSum_II {

    //problem link : https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/

    public int[] twoSum(int[] numbers, int target) {


        int l = 0, r = numbers.length - 1;

        int[] res = new int[2];

        while (l < r) {

            int sum = numbers[l] + numbers[r];
            if (sum > target) {
                r -= 1;
            } else if (sum < target) {
                l += 1;
            } else {
                res[0] = l+1;
                res[1] = r+1;
                break;
            }
        }
        return res;
    }
}

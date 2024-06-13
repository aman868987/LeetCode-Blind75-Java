package TwoPointers;

public class IsSubsequence392 {

    //problem link : https://leetcode.com/problems/is-subsequence/description/

    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        int n = s.length();
        int m = t.length();
        if (n == 0) return true;
        while (j < m && i < n) {

            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;

        }
        return i == n;
    }
}

package TwoPointers;

public class ValidPalindrome125 {

    //problem link : https://leetcode.com/problems/valid-palindrome/description/

    public boolean isPalindrome(String s) {

        //remove non-alphanumeric
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i += 1;
            j -= 1;
        }

        return true;

    }

}

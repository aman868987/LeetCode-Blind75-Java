package ArraysAndHashing;

public class ValidAnagrams {
    //Problem link : https://leetcode.com/problems/valid-anagram/description/

    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int[] count1 = new int[256];
        int[] count2 = new int[256];

        for (int i = 0; i < s.length(); i++) {
            count1[s.charAt(i)]++;
            count2[t.charAt(i)]++;
        }

        for (int i = 0; i < 256; i++) {
            if (count1[i] != count2[i]) {
                return false;
            }
        }
        return true;

    }
}

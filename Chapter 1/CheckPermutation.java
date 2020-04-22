/**
 *
 * Problem: Given two strings, write a method to decide if one is a permutation
 * of other.
 *
 * Solution: clarify case sensitive and whitespace
 *
 */

public class CheckPermutation {

    public boolean checkperm(String s1, String s2){
        // Given two string s1, s2
        // Determine s1 is a permutationi of s2 or not

        if (s1 == null || s2 == null || s1.length() != s2.length()){
            return false;
        }
        int[] counts = new int[256];
        for (char ch: s1.toCharArray()){
            counts[ch]++;
        }
        for (char ch: s2.toCharArray()){
            if (--counts[ch] < 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        CheckPermutation cp = new CheckPermutation();
        String s1 = "ba";
        String s2 = "ab";
        System.out.println(cp.checkperm(s1, s2));
    }
}

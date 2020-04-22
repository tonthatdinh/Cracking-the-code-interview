package ArrayvsString;
// Sample code for Google interview
// What should we learn from this
// Naming convention for function --> max_palindrom_substring
// Naming convention for variables --> left, right
// Writing documentation code:
// What is input ? What is the output ?
// What did we do in this function?

public class Main {
    static int expand(String s, int left, int right){
        // given a palindrom substring: s[left..right], we expand [left, right] to
        // find the maximum palindrom substring with center [left..right].
        // returns: length of maximum palindrom substring with center [left..right].

        while (left > 0 && right + 1 < s.length() && s.charAt(left - 1) == s.charAt(right + 1)) {
            left --;
            right ++;
        }
        return right - left + 1;
    }


    static int max_palindrome_substring(String s){
        // Given string s, find its longest palindrome substring.
        // Return: length of longest palindrome substring.
        int result = 0;

        for(int center = 0; center < s.length(); center ++){
            // odd-length substrings
            result = Math.max(result, expand(s, center, center));

            // even-length substrings
            if (center + 1 < s.length() && s.charAt(center) == s.charAt(center + 1)){
                result = Math.max(result, expand(s, center, center + 1));
            }
        }
        return  result;
    }
    public static void main(String[] args){
        System.out.println("HELLO");
        String sample = "abaabc";
        int res = max_palindrome_substring(sample);
        System.out.println(res);
    }
}

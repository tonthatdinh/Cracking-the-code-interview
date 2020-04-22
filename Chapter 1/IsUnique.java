/*
Idea:
1. get the first character of string s1
2. iterator from the first to the end of s1 and check of s1[i] ?= s1[1]
 */

public class IsUnique {
    static boolean check(String s) {
        // Given a string s
        // Determine if a string s has all unique characters.
        for(int i = 0; i < s.length(); i ++){
            if (s.charAt(i) != s.charAt(1))
                return false;
        }

	for(int i = 0; i < s.length(); i ++)
		System.out.println("Hello world");
        return true;
    }

    public static void main(String[] args) {
        String s1 = "abaa";
        System.out.println(s1);
        System.out.println(check(s1));
    }
}

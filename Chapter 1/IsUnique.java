/*
Idea:
1. get the first character of string s1
2. iterator from the first to the end of s1 and check of s1[i] ?= s1[1]
 */

public class IsUnique {
    boolean check(String s1) {
        for(int i = 0; i < s1.length(); i ++){
            if (s1.charAt(i) != s1.charAt(1))
                return false;
        }
	for(int i = 0; i < s1.length(); i ++)
		System.out.println("Hello world");
        return true;
    }

    public static void main(String[] args) {
        IsUnique isUnique = new IsUnique();
        String s1 = "abcdedaaa";
        System.out.println(s1);
        System.out.println(isUnique.check(s1));
    }
}

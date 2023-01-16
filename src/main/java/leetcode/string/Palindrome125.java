package leetcode.string;

public class Palindrome125 {
    public static boolean isPalindrome(String s) {

        if (s == null) {
            return true;
        }
        String s1 = s.toLowerCase();

        StringBuilder str = new StringBuilder(s1.length());


        for (char c : s1.toCharArray()) {

            //通过非正则表达式来处理非数字字母的情况。
            if ((c >= '0' && c <= '9') || (c >= 'a' && c <= 'z')) {
                str.append(c);
            }
        }

        return str.toString().equals(str.reverse().toString());

    }

    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";

        boolean palindrome = Palindrome125.isPalindrome(s);

        System.out.println("palindrome = " + palindrome);

    }
}

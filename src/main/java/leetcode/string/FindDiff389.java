package leetcode.string;

public class FindDiff389 {

    public static char findTheDifference(String s, String t) {

        char c = (char) ((char) t.chars().sum() - s.chars().sum());

        return c;


    }

    public static void main(String[] args) {

        String s = "abcd", t = "abcde";

        char theDifference = findTheDifference(s, t);

        System.out.println("theDifference = " + theDifference);

    }
}

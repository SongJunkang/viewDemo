package leetcode.string;

public class ReverseWords557 {

    public static String reverseWords(String s) {

        String[] sArray = s.split(" ");

        StringBuffer sb = new StringBuffer(s.length());

        int i = 0;

        for (String str : sArray) {

            char[] chars = str.toCharArray();

            swapArr(chars);

            sb.append(String.valueOf(chars));

            i++;

            if (i<sArray.length){
                sb.append(" ");
            }

        }
        return String.valueOf(sb);

    }



    public static void swapArr(char [] chars){

        for (int i = 0; i < chars.length/2; i++) {

            char temp = chars[i];
            chars[i] = chars[chars.length-i-1];
            chars[chars.length-i-1] = temp;
            //两个指针同时移动
        }

    }

    public static void main(String[] args) {

       String s1 = "Let's take LeetCode contest";

        String s = reverseWords(s1);

        System.out.println("s = " + s);

        char a = 'c';
        char b = 'd';

        System.out.println("b = " + b);
        System.out.println("a = " + a);
    }
}

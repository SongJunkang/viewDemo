package leetcode.basic;

import leetcode.string.ReverseString344;

import java.util.Arrays;

/**
 * @author joakims
 * @create 2023-01-17-0:21
 * java 中…^=的交换作用。
 **/
public class YiHuo344 {

    public static void main(String args[]) {
        int a1 = 5; // 0000 0101
        int b1 = 3; // 0000 0011
        a1 |= b1; // 0000 00111
        System.out.println("|= "+a1);

        int a2 = 5; // 0000 0101
        int b2 = 3; // 0000 0011
        a2 &= b2; // 0000 0001
        System.out.println("&= "+a2);

        int a3 = 5; // 0000 0101
        int b3 = 3; // 0000 0011
        a3  = a3 ^ b3; // 0000 0110
        b3 = a3 ^ b3 ; // 0000 0110
        a3 = b3 ^a3; //交换位置。

        System.out.println("a3^= "+a3);
        System.out.println("b3^= "+b3);


        char[] s = {'h','e','l','l','o'};
        ReverseString344 string344 = new ReverseString344();

        string344.reverseString(s);

        System.out.println("s = " + Arrays.toString(s));



    }

}

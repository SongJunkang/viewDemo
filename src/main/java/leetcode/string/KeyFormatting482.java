package leetcode.string;

import java.util.Arrays;

public class KeyFormatting482 {

    public static String licenseKeyFormatting(String s, int k) {

        s = s.toUpperCase();
        String[] split = s.split("-");

//        String s1 = new String(Arrays.toString(split));
//        s1 = [5F3Z, 2E, 9, W],这样的字符串有问题。需要用stringBuilder

        StringBuffer sb1 = new StringBuffer();

        for (String value : split) {

            sb1.append(value);

        }

        String s1 = sb1.toString();


        StringBuilder sb= new StringBuilder();

        for (int i = s1.length()-1, j = 0; i >= 0 ; i--,j++) {

            if (j%k ==0 && j>0){

                sb.append("-").append(s1.charAt(i));
            }
            else {
                sb.append(s1.charAt(i));
            }

        }
        return sb.reverse().toString();

    }

    public static void main(String[] args) {
        String s = "5F3Z-2e-9-w";
        System.out.println("s = " + s);

        int k= 4;

        String s1 = licenseKeyFormatting(s, k);

        System.out.println("s1 = " + s1);


    }
}

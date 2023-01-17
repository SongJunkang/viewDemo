package leetcode.string;

public class StringAdd415 {
    public static String addStrings(String num1, String num2) {

        StringBuilder sb= new StringBuilder();

        int carry = 0;

        int i = num1.length() -1,j = num2.length()-1;

        while (i >= 0 || j >= 0 || carry != 0){

            if (i >= 0) carry += num1.charAt(i--) -'0';
            if (j >= 0) carry += num2.charAt(j--) -'0';

            sb.append(carry%10);

            carry /=10;
        }

        return sb.reverse().toString();



    }

    public static void main(String[] args) {
       String num1 = "11", num2 = "13";

        String s = addStrings(num1, num2);

        System.out.println("s = " + s);


    }
}

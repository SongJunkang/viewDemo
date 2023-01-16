package leetcode.string;

public class ColumnTitle171 {

    public static int titleToNumber(String columnTitle) {

        char[] charArray = columnTitle.toCharArray();

        int sum = 0;

        int j = charArray.length;

        for (char c : charArray) {


            int mid = c - 'A' +1;
//            sum = mid * (26^(j-1)) +sum;这个有问题

            sum += mid * Math.pow(26,j-1);

            j--;
        }

        return sum;

    }

    public static void main(String[] args) {

        String columnTitle = "ZY";

        int result = ColumnTitle171.titleToNumber(columnTitle);

        System.out.println("result = " + result);
    }
}

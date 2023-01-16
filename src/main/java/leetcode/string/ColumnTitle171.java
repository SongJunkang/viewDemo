package leetcode.string;

public class ColumnTitle171 {

    public static int titleToNumber(String columnTitle) {

        char[] charArray = columnTitle.toCharArray();

        int sum = 0;

        int j = charArray.length;

        for (char c : charArray) {


            int mid = c - 'A' +1;
//            sum = mid * (26^(j-1)) +sum;这个有问题
            //java中^表示位运算。^是异或运算符，符号两边的数必须为二进制。
            //计算方式：符号左右两边的二进制数，相应的位相同为0，不相同为1

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

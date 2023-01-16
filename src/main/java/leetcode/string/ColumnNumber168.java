package leetcode.string;

public class ColumnNumber168 {

    public static String convertToTitle(int columnNumber) {


        StringBuilder str = new StringBuilder();

        while(columnNumber >0){


            int tail = (columnNumber -1) % 26;

            columnNumber = (int)(columnNumber-1)/26;

            char c = (char) (tail + 'A');

            str.append(c);

        }


        return str.reverse().toString() ;

    }

    public static void main(String[] args) {


        int i = 701;

        String s = ColumnNumber168.convertToTitle(i);

        System.out.println("s = " + s);

    }
}


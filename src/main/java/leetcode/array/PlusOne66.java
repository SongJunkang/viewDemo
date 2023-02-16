package leetcode.array;

public class PlusOne66 {

    public int[] plusOne(int[] digits) {

//        int index = 0;
//
//        int n = digits.length -1;
//
//        while(index == 0){
//
//            if (digits[0] == 0){
//                digits[0] = 1;
//
//                return digits;
//
//            } else if (digits.length>1) {
//
//                index = digits[n] +1;
//
//                if (index == 10) {
//
//                    digits[n] = 0;
//                    digits[n -1] = digits[n -1]+1;
//                    index =  digits[n -1];
//                }
//                else {
//                    digits[n] = digits[n] +1;
//                    break;
//                }
//                n--;
//
//            }
//
//        }
//
//
//        return digits;
//
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        //跳出for循环，说明数字全部是9
        int[] temp = new int[digits.length + 1];
        temp[0] = 1;
        return temp;


    }
}

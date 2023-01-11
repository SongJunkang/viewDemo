package leetcode.string;

/**
 * @author joakims
 * @create 2023-01-11-17:31
 **/
public class LongestCommon14 {

    public static   String longestCommonPrefix(String[] strs) {

        String result = strs[0];
        for (String str : strs) {

            result = maxStr(result, str);
        }
        return result;

    }



    public static String maxStr(String str1, String str2){

        int min = Math.min(str1.length(),str2.length());
        int  i = 0;

        for (;i< min;i++){

            if (str1.charAt(i) != str2.charAt(i)){
                return str1.substring(0,i);
            }

        }
        if(i == min){
            return str1.substring(0,i);
        }
        return "";

    }

    public static void main(String[] args) {

        String [] str = {"flower","flow","flight"};

       String  result  = LongestCommon14.longestCommonPrefix(str);

        System.out.println("result = " + result);

    }

}

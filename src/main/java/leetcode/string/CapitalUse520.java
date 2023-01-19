package leetcode.string;

/**
 * @author joakims
 * @create 2023-01-19-11:44
 **/
public class CapitalUse520 {

    public boolean detectCapitalUse(String word) {

        int upper = 0;//记录大写字母
//        int low = 0;//记录小写字母
        char[] chars = word.toCharArray();

        for(char c:chars){

            if (c < 'a') {
                upper ++;
            }
        }

        return upper == word.length() || upper == 0 || (upper == 1 && word.charAt(0) < 'a');

    }
}

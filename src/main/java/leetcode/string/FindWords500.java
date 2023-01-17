package leetcode.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author joakims
 * @create 2023-01-18-0:36
 **/
public class FindWords500 {
    public static String[] findWords(String[] words) {

        String tem1 =  "qwertyuiopQWERTYUIOP";
        String tem2 =  "asdfghjklASDFGHJKL";
        String tem3 =  "zxcvbnmZXCVBNM";

        List<String > list = new ArrayList<>();

        for (String word : words) {

            char[] charArray = word.toCharArray();
            int index1 = 0 ,index2 =0,index3 = 0 ;
            for (int i =0;i<charArray.length;i++)
            {
                if (tem1.contains(String.valueOf(charArray[i]))){

                    index1++;
                }
                if (tem2.contains(String.valueOf(charArray[i]))){

                    index2++;
                }
                if (tem3.contains(String.valueOf(charArray[i]))){

                    index3++;
                }

            }
            if (index1 == charArray.length ||index2 == charArray.length || index3 == charArray.length){

                list.add(word);
            }

        }
        return  list.toArray(list.toArray(new String[0]));

    }

    public static void main(String[] args) {
        String [] strings = {"a","b"};
        String[] words = findWords(strings);
        System.out.println("words = " + Arrays.toString(words));
    }
}

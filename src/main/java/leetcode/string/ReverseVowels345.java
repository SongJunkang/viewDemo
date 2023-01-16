package leetcode.string;

import java.util.ArrayList;
import java.util.List;

/**
 * @author joakims
 * @create 2023-01-17-0:40
 **/
public class ReverseVowels345 {

    public String reverseVowels(String s) {

        char[] charsArray = s.toCharArray();

        StringBuilder sb = new StringBuilder(s.length());

        String temp = "aeiouAEIOU";

        List<Integer> index = new ArrayList<>();

        for (int i = 0; i < charsArray.length; i++) {

//            if (charsArray[i] =='a' || charsArray[i] =='e' || charsArray[i] =='i'|| charsArray[i] =='o'|| charsArray[i] =='u' )

            if (temp.contains(String.valueOf(charsArray[i])))
            {
                sb.append(charsArray[i]);
                index.add(i);
            }
        }
        char[] newchars = sb.reverse().toString().toCharArray();

        for (int i = 0; i < sb.length(); i++) {
           charsArray[index.get(i)] = newchars[i];
        }
        return new String(charsArray);
    }
}


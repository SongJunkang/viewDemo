package leetcode.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author joakims
 * @create 2023-01-16-22:42
 **/
public class WordPattern290 {

    public static boolean wordPattern(String pattern, String s) {

        char[] chars = pattern.toCharArray();
        String[] s1 = s.split(" ");

        if (chars.length !=s1.length)
            return false;

        Map<Character,String> map = new HashMap<>();
//        Map<String,Character> map2 = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {

            char c = chars[i];
            String s2 = s1[i];
//            if((s2t.containsKey(x) && s2t.get(x) != y) || (t2s.containsKey(y) && t2s.get(y) != x)) 仿照第205

            if ((map.containsKey(c) && !Objects.equals(map.get(c), s2) )|| ( !map.containsKey(c)  &&map.containsValue(s2))){

                return false;
            }
            map.put(c,s2);
//            map2.put(s2,c);

        }

        return true;

    }

    public static void main(String[] args) {
        String pattern ="abba", s = "dog cat cat dog";
        boolean b = WordPattern290.wordPattern(pattern, s);
        System.out.println("是否相同词组模式= " + b);
    }
}

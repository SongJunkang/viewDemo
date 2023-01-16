package leetcode.string;

import java.util.HashMap;
import java.util.Map;

public class Isomorphic205 {

    public  static boolean isIsomorphic(String s, String t){

        Map<Character,Character> s2t = new HashMap<>();

        Map<Character,Character> t2s = new HashMap<>();

        int len = s.length();

        for (int i = 0; i<len; i++){

            char x = s.charAt(i);
            char y = t.charAt(i);

            if((s2t.containsKey(x) && s2t.get(x) != y) || (t2s.containsKey(y) && t2s.get(y) != x)){


                return false;
            }

            s2t.put(x, y);
            t2s.put(y, x);

        }
        return true;

    }

    public static void main(String[] args) {

//        String s = "paper", t = "title";
        String s = "foo", t = "bar";
        boolean res = Isomorphic205.isIsomorphic(s, t);

        System.out.println("res = " + res);
    }
}

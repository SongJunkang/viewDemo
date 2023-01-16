package leetcode.string;

import java.util.HashMap;
import java.util.Map;

/*
给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。

注意：若 s 和 t 中每个字符出现的次数都相同，则称 s 和 t 互为字母异位词

 */
public class Anagram242 {

    //直接转成数组排序，然后比较，是更简单的，
    public static boolean isAnagram(String s, String t) {


        Map<Character,Integer> s2m = anagramHandler(s);
        Map<Character,Integer> t2m = anagramHandler(t);


        return s2m.equals(t2m);

    }

    private static Map<Character, Integer> anagramHandler(String s) {

        Map<Character,Integer> map= new HashMap<>();

        for (char c :
                s.toCharArray()) {
            if (!map.containsKey(c)){
                map.put(c,1);
            }
            else map.put(c,map.get(c)+1);

        }

        return map;

    }

    public static void main(String[] args) {

        String s = "anagram", t = "nagaram";

        boolean result = Anagram242.isAnagram(s, t);

        System.out.println("result = " + result);

    }


}

package leetcode.string;

import java.util.HashMap;
import java.util.Map;

/**
 * @author joakims
 * @create 2023-01-17-11:52
 **/
public class CanConstruct383 {

    public static boolean canConstruct(String ransomNote, String magazine)
    {

        Map<Character, Integer> noteMap = s2m(ransomNote);
        Map<Character, Integer> magaMap = s2m(magazine);

        int index= 0;
        for (char c : noteMap.keySet()) {
            if (magaMap.containsKey(c) && (magaMap.get(c) >= noteMap.get(c))) {

                index++;
            }

        }
        return index == noteMap.size();
    }
    public static Map<Character,Integer> s2m(String s)
    {
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
        String s = "fihjjjjei", t = "hjibagacbhadfaefdjaeaebgi";

        boolean b = canConstruct(s, t);

        System.out.println("result = " + b);
    }


}

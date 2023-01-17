package leetcode.basic;

import java.util.HashMap;
import java.util.Map;

/**
 * @author joakims
 * @create 2023-01-17-11:59
 **/
public class CommonUtil {

    public Map<Character,Integer> s2m(String s)
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
}


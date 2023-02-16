package leetcode.basic;

import java.util.HashMap;
import java.util.Map;

/**
 * @author joakims
 * @create 2023-01-17-11:59
 **/
public class CommonUtil {



    //对字符串中的字母进行map操作，
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

/*
        对数组数据进行倒序
 */
    public static void swapArr(char [] chars){

        for (int i = 0; i < chars.length/2; i++) {

            char temp = chars[i];
            chars[i] = chars[chars.length-i-1];
            chars[chars.length-i-1] = temp;
            //两个指针同时移动
        }

    }
}


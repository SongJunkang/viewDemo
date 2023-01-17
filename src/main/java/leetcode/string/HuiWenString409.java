package leetcode.string;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HuiWenString409 {

    public int longestPalindrome(String s) {

        Map<Character, Integer> map = s2m(s);

//        Stream<Map.Entry<Character, Integer> > stream = map.entrySet().stream();

//        map.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));

//       map.forEach(->{
//
//            Map.Entry::getValue
//               }
//               );

        int sum = 0;

        int index = 0;//记录是否有很多奇数的情况，如果有最后就需要+1；
        for(int i:map.values()){

//            if (i%2 == 0){
//
//                sum +=i;
//            }
//            else {
//                index++;
//                sum = sum + i -1;
//            }

            sum += i / 2 * 2;
            if (i % 2 == 1 && sum % 2 == 0) {
                sum++;
            }


        }
//        return  index == 0?sum : sum+1 ;
        return sum;

    }

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

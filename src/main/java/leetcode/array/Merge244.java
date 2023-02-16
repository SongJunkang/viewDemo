package leetcode.array;

import java.util.*;

public class Merge244 {
    public int[][] merge(int[][] intervals) {

        if (intervals.length == 0){
            return intervals;
        }

        Arrays.sort(intervals,(a,b) ->a[0]-b[0]);//1、对二维数组按照第一列升序排序

        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));//按每行的第0列升序排序
        Vector<int[]> integerVector =  new Vector<>();///由于我们事先不知道数组大小，所以用Vector类实现动态数组。

         List<int []> list = new ArrayList<>();
        int term[] =intervals[0];//临时空间，1 判断是否需要合并集合，2 是否放入结果集
        for (int i = 1; i < intervals.length; i++) {
            if (term[1]>=intervals[i][0]){
                term[1]=Math.max(term[1],intervals[i][1]);
            }else {
                list.add(term);
                term=intervals[i];
            }
        }
        list.add(term);
        return list.toArray(new int[list.size()][2]);
    }

}

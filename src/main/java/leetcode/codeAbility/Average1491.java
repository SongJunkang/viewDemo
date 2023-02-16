package leetcode.codeAbility;

import java.util.*;

public class Average1491 {

    public double average(int[] salary) {


//        List list = new ArrayList<>(Arrays.asList(salary));
//        List list = new ArrayList<>(Collections.singletonList(salary));
//
//        Integer max = list.stream().reduce(list.get(0), Integer::max);
//
//        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2));
//
//        Integer min = list1.stream().reduce(list1.get(0), Integer::min);



        int min1 = Arrays.stream(salary).min().getAsInt();
        int max = Arrays.stream(salary).max().getAsInt();

        double sum = Arrays.stream(salary).asDoubleStream().sum();

        return (sum - max-min1) /(salary.length-2);
    }
}

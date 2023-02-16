package leetcode.string;

import java.util.*;

public class FindRestaurant599 {

    public static String[] findRestaurant(String[] list1, String[] list2) {

        int[] indexSum = new int[Math.min(list1.length, list2.length)];

        List<String> list = new ArrayList<>();

        int k = 0;

        for (int i = 0; i < list1.length; i++) {

            for (int j = 0; j < list2.length; j++) {

                if (Objects.equals(list1[i], list2[j])) {


                    int sum = i + j;

                    indexSum[k] = sum;

//                    OptionalInt min = Arrays.stream(indexSum).sorted().min();

//                    Arrays.sort(indexSum);不需要排序的，本来是1，0，0，然后排序就是 001，这样无法插入



                    if (sum == indexSum[0]) {

                        list.add(list1[i]);
                    }
                    else if (sum < indexSum[0]){
                        list.remove(0);
                        list.add(list1[i]);
                    }

                    k++;

                }

            }

        }

        return list.toArray(new String[0]);

    }


    public static void main(String[] args) {
        String[] list1 = new String[]{"Shogun","Piatti","Tapioca Express","Burger King","KFC"};
        String[] list2 = new String[]{"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};

        String[] restaurant = findRestaurant(list1, list2);

        System.out.println("restaurant = " + Arrays.toString(restaurant));

    }
}
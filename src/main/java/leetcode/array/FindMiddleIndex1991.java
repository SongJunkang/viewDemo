package leetcode.array;

import java.util.Arrays;

public class FindMiddleIndex1991 {
    public static  int findMiddleIndex(int[] nums) {


        int rightsum = 0;

        int sum = Arrays.stream(nums).sum();

        int leftsum = 0;

        for (int i = 0; i <nums.length; i++) {


            sum  =sum -nums[i];

            if (sum == leftsum) {

                return i;
            }

            leftsum = leftsum +nums[i];

        }


        return -1;
    }

    public static void main(String[] args) {
         int [] nums =  {1,7,3,6,5,6};

        int middleIndex = findMiddleIndex(nums);

        System.out.println("middleIndex = " + middleIndex);
    }
}

package leetcode.array;

import java.util.Arrays;

public class Merge88 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int index = 0;

        for (int i = m,j = 0; i < nums1.length; i++,j++) {

                nums1[i] = nums2[j];

        }
        Arrays.sort(nums1);

    }
}

package leetcode.array;

public class SearchInsert35 {

    public int searchInsert(int[] nums, int target) {

        for (int i = 0; i <nums.length; i++) {

            if (target <= nums[i]) {
                return i;
            }

            else if (nums[nums.length-1] < target){
                return nums.length;
            }

        }
        return 0;

    }
}

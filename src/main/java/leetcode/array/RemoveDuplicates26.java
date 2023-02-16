package leetcode.array;

public class RemoveDuplicates26 {
    public  static int removeDuplicates(int[] nums) {

        int index = 1;


        //指针指向替换位，i遍历，第一次不同，就是就是替换到第二个位置，第二次出现不同，就是替换到第三个位置。
        for (int i = 1; i < nums.length; i++) {

            if (nums[i-1] != nums[i]){

//                nums[++index] = nums[i];


                nums[index++] = nums[i];

            }

        }
        return index ;
    }

    public static void main(String[] args) {


        int[] nums= {1,1,1,2};

        int i = removeDuplicates(nums);

        System.out.println("i = " + i);
    }
}

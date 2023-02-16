package leetcode.array;

public class RemoveElement27 {

    public static int  removeElement(int[] nums, int val) {

        //原先的思路，是通过一个判断删除值来进行。
//
//        int index = 0;
//
//        if (nums.length ==1 ){
//            if (nums[0] == val){
//                return 0;
//            }
//            else return 1;
//        }
//
//        for (int i = 0; i < nums.length; i++) {
//
//                for (int j = i+1; j < nums.length; j++) {
//
//                    if (nums[i]== val &&  nums[j] != val){
//
//                        nums[i] = nums[j];
//                        nums[j] = val;
//
//                        index ++;
//                    }
//                    else return 0;
//
//                }
//
//        }
//
//        return nums.length -index ;

        int slowIndex = 0;//更新的下标就是慢指针。

        int fastIndex ;//找到数组中新的数，往前覆盖。寻找新数组的元素 ，新数组就是不含有目标元素的数组

        for (fastIndex = 0;fastIndex<nums.length;fastIndex++){

            if ( val != nums[fastIndex]) {

                nums[slowIndex++] = nums[fastIndex];

            }

        }
        return slowIndex;

    }

    public static void main(String[] args) {

       int [] nums =  {3,2,2,3};

       int k = 3;


        int result = removeElement(nums, k);

        System.out.println("result = " + result);

    }
}

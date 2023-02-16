package leetcode.codeAbility;

public class CountOdds1523 {

    public int countOdds(int low, int high) {


        int reduce = high - low;



        if ( high %2 ==0 &&reduce % 2 == 0 ){

            return reduce/2;
        }
        else
            return reduce+1;

    }
}

package leetcode.string;

public class SubSequence392 {
    public boolean isSubsequence(String s, String t) {

        char[] charsS = s.toCharArray();

        char[] charsT = t.toCharArray();

        int index = -1;

        for(char c: charsS){

            index = t.indexOf(c,index+1);

            if (index == -1){

                return false;
            }

        }

        return true;

    }

}

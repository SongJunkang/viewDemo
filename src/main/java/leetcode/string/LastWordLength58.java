package leetcode.string;

/**
 * @author joakims
 * @create 2023-01-12-23:45
 **/
public class LastWordLength58 {

    public int lengthOfLastWord(String s) {

        String[] strArr = s.split(" ");
        String lastWord = strArr[strArr.length-1];
        return lastWord.length();
    }

    public static void main(String[] args) {
        LastWordLength58 lastWordLength58 = new LastWordLength58();

        String s = "luffy is still joyboy";

        int result = lastWordLength58.lengthOfLastWord(s);

        System.out.println("result = " + result);


    }
}


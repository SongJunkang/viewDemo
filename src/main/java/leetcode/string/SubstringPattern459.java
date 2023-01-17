package leetcode.string;

public class SubstringPattern459 {

    public static boolean repeatedSubstringPattern(String s) {

        boolean result =false;

        for (int i =1;i<=s.length()/2;i++){


            if(s.length()%(i)!=0){ // 不能整除 跳过
                continue;
            }

            result = repeated(s, new StringBuilder(s.substring(0, i)));

            if (result){
                return true;
            }

        }
        return false;
    }

    public static boolean repeated(String s, StringBuilder subS) {


//StringBuilder sumSt =  subS;这里的sumSt会随着subS的改变而改变。
        String sumSt = String.valueOf(subS);

        while (!s.contentEquals(subS)){

            subS.append(sumSt);
            if (subS.length() > s.length()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String s = "abab";
        boolean b = repeatedSubstringPattern(s);
        System.out.println("b = " + b);

    }
}

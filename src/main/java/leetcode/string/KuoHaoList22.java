package leetcode.string;

import java.util.ArrayList;
import java.util.List;

/**
 * @author joakims
 *  2023-01-12-17:36
 **/
public class KuoHaoList22 {



//    static List<String> res  = new ArrayList<>();
//
//    public static List<String> generateParenthesis(int n) {
//
//        if (n ==0 ){
//            return res;
//        }
//
//        getParenthesis("",n,n);
//        return res;
//
//    }
//
//    private static void getParenthesis(String str, int left, int right) {
//
//        if(left == 0 && right == 0 ){
//            res.add(str);
//            return;
//        }
//        if(left == right){
//            //剩余左右括号数相等，下一个只能用左括号
//            getParenthesis(str+"(",left-1,right);
//        }else if(left < right)
//        {
//            //剩余左括号小于右括号，下一个可以用左括号也可以用右括号
//            if(left > 0){
//                getParenthesis(str+"(",left-1,right);
//            }
//            getParenthesis(str+")",left,right-1);
//        }
//    }

    static List<String> res = new ArrayList<>();
    public static List<String> generateParenthesis(int n) {
        dfs(n, n, "");
        return res;
    }

    private static void dfs(int left, int right, String curStr) {
        if (left == 0 && right == 0) { // 左右括号都不剩余了，递归终止
            res.add(curStr);
            return;
        }


        if (left > 0) { // 如果左括号还剩余的话，可以拼接左括号
            dfs(left - 1, right, curStr + "(");
        }
        if (right > left) { // 如果右括号剩余多于左括号剩余的话，可以拼接右括号
            dfs(left, right - 1, curStr + ")");
        }
    }


    public static void main(String[] args) {

        List<String> list = KuoHaoList22.generateParenthesis(1);

        System.out.println("list = " + list);
    }
}

package leetcode.string;

import java.util.Stack;

/**
 * @author joakims
 * @create 2023-01-11-23:59
 **/
public class KuoHao20 {

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<Character>();

        //之前的思路
        for (int i = 0; i < s.length(); i++) {
           char c = s.charAt(i);
           switch (c){
               case '{' : case '[' : case  '(':
                   stack.push(c);
                   break;
               case '}' :
                   if (stack.isEmpty() || stack.peek() != '{') {
                       return false;
                   }
                   stack.pop();
                   break;

               case ']' :
                   if (stack.isEmpty() || stack.peek() != '[') {
                       return false;
                   }
                   stack.pop();
                   break;
               case ')' :
                   if (stack.isEmpty() || stack.peek() != '(') {
                       return false;
                   }
                   stack.pop();
                   break;

           }

        }
        if (!stack.isEmpty()){
            return false;
        }

        return true;

    }


    //更简洁的步骤

//        for (char c : s.toCharArray()) {
//
//            if (c == '(')
//                stack.push(')');
//            else if(c=='[')
//                stack.push(']');
//            else if(c=='{')
//                stack.push('}');
//            else if(stack.isEmpty()||c!=stack.pop())return false;

//            else if (stack.isEmpty() || c != stack.pop()) {
//
//            }

    public static void main(String[] args) {

        String s = "()";

        Boolean result = KuoHao20.isValid(s);

        System.out.println("result = " + result);

    }
}


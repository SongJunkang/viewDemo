package leetcode.string;

import java.util.ArrayList;
import java.util.List;

public class CountSegments434 {

    public static int countSegments(String s) {

        List<String> list = new ArrayList<>();

        if (s.equals("")){
            return 0;
        }

        else {
            String[] s1 = s.split(" ");

            for (int i = 0; i <s1.length; i++) {

                if (!s1[i].equals("")){

                    list.add(s1[i]);
                }

            }

            return list.size();
        }

    }

    public static void main(String[] args) {

        String s = "Hello, my name is John";

        int i = countSegments(s);

        System.out.println("i = " + i);

    }
}

package leetcode.string;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FindDiff389 {

    public static char findTheDifference(String s, String t) {

        char c = (char) ((char) t.chars().sum() - s.chars().sum());

        return c;




    }

    public static void main(String[] args) throws IOException {

        String s = "abcd", t = "abcde";

        String name1 = "sudu.avi";

        Path path = Paths.get(name1);

        String s1 = Files.probeContentType(path);


        String extension = name1.substring(name1.lastIndexOf("."));

        char theDifference = findTheDifference(s, t);

        System.out.println("theDifference = " + theDifference);

        System.out.println("该扩展名是："+ extension);
        System.out.println("该扩展名是："+ s1);//

    }
}

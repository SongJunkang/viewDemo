package projdemo;

import cn.hutool.crypto.digest.DigestUtil;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Administrator
 * @version 1.0
 * @description 测试File的断点续传功能
 * @date 2023/3/8 13:03
 */
public class FileTest {


    public static void main(String[] args) throws IOException {

        String name1 = "sudu.avi";

        Path path = Paths.get(name1);
        String s1 = Files.probeContentType(path);

        System.err.println("该扩展名是：" + s1);//该扩展名是：video/avi

        String nameMd5 = DigestUtil.md5Hex(name1);
        System.out.println("nameMd5 = " + nameMd5);

        ProcessBuilder processBuilder = new ProcessBuilder();

        processBuilder.command();

        Process start = processBuilder.start();

    }
}






package projdemo;

import bean.User;
import cn.hutool.json.JSONUtil;

/**
 * @author Administrator
 * @version 1.0
 * @description 测试 hutool的 JSONUtil使用
 * @date 2023/3/14 13:30
 */
public class JSONDemo {

    public static void json2Clazz(){

        User user = new User();

        user.setName("song");

        user.setGender("man");

        user.setId(1);

        String jsonSt = JSONUtil.toJsonStr(user);

        System.out.println("User的jsonSt字符串为 = " + jsonSt);

        User s = JSONUtil.toBean(jsonSt,User.class);

        System.out.println("s = " + s.toString());

    }

    public static void main(String[] args) {


//        JSONDemo jsonDemo;

        json2Clazz();

        String s2 = "Java";

        String s1 = "hello %s";

        String format = String.format(s1, s2);

        System.out.println("format = " + format);
    }
}

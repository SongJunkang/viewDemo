package projdemo;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author Administrator
 * @version 1.0
 * @description TODO
 * @date 2023/3/16 17:02
 */
public class PasswordDemo {

    public static void main(String[] args) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        /**
         $2a$10$1sp7I0OdYH3Azs/2lK8YYeuiaGZzOGshGT9j.IYArZftsGNsXqlma
         $2a$10$m983E2nmJ7ITlesbXzjbzO/M7HL2wP8EgpgX.pPACDm1wG38Lt.na
         $2a$10$rZvathrW98vVPenLhOnl0OMpUtRTdBkWJ45IkIsTebITS9AFgKqGK
         $2a$10$2gaMKWCRoKdc42E0jsq7b.munjzOSPOM4yr3GG9M6194E7dOH5LyS
         $2a$10$I/n93PIKpKL8m4O3AuT5kuZncZhfqV51bfx5sJrplnYoM7FimdboC
         */
//        for (int i = 0; i < 5; i++) {
//            String encode = passwordEncoder.encode("11111");
//            System.out.println(encode);
//        }

        //TODO

        boolean matches = passwordEncoder.matches("11111", "$2a$10$m983E2nmJ7ITlesbXzjbzO/M7HL2wP8EgpgX.pPACDm1wG38Lt.na");
        System.out.println(matches);
    }
}

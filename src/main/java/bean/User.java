package bean;

import lombok.Data;
import sun.misc.Contended;

/**
 * @author joakims
 * @create 2022-09-13-18:11
 **/
@Data
@Contended
public class User {

    private Integer id;
    private String name;
    private String gender;

}

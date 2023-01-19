package leetcode.string;

/**
 * @author joakims
 * @create 2023-01-19-11:58
 *  * 借鉴，indexOf。函数。
 **/
public class LUSlength521 {
    public int findLUSlength(String a, String b) {
        int tmp1 = getResult(a, b);
        int tmp2 = getResult(b, a);
        return tmp1 > tmp2 ? tmp1 : tmp2;
    }

    public int getResult(String a, String b) {
        int result = -1;
        boolean flag = false;
        for (int i = 0; i < a.length() ; i++) {
            for (int j = 0; j <= i; j++)
                if (b.indexOf(a.substring(j, a.length()-i+j)) == -1) {
                    result = a.length()-i;
                    flag = true;
                    break;
                }
            if (flag = true)
                break;
        }
        return result;
    }
}

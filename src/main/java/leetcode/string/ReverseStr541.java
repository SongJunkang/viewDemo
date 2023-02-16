package leetcode.string;

/**
 * @author joakims
 * @create 2023-01-19-12:27
 *
 **/
public class ReverseStr541 {

    public static String reverseStr(String s, int k) {

        if (k == 1){
            return s;
        }
        else {
            int result = s.length()/(2*k);

            int tail = s.length() %(2*k);

            StringBuilder sb  = new StringBuilder();

            int strat = 0,end = k;

            for (int i = 0; i < result; i++) {

                StringBuilder substring = new StringBuilder(s.substring(strat, end));

                sb.append(substring.reverse());

                sb.append(s.substring(end, end+k));

                strat = strat+2*k;

                end = (strat + k  > s.length() ? sb.length() : strat +k  );

            }
            if (tail <k){
                StringBuilder substring = new StringBuilder(s.substring(result*2*k, s.length()));
                sb.append(substring.reverse());
            }
            else {
                StringBuilder substring1 = new StringBuilder(s.substring(result*2*k , result*2*k+k));
                sb.append(substring1.reverse());
                sb.append(s.substring(result * 2 * k + k, s.length()));
            }

            return String.valueOf(sb);

        }



    }

    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 2;
        String s1 = reverseStr(s, k);

        System.out.println("s1 = " + s1);

    }
}

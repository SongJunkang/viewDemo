package leetcode.string;

/**
 * @author joakims
 * @create 2023-01-19-12:27
 *
 **/
public class ReverseStr541 {

    public String reverseStr(String s, int k) {

        int result = s.length()/(2*k);

        int tail = s.length() %(2*k);

        StringBuilder sb  = new StringBuilder();

        int strat = 0,end = k;

        for (int i = 0; i < result; i++) {

            StringBuilder substring = new StringBuilder(s.substring(strat, end-1));

            sb.append(substring.reverse());

            sb.append(s.substring(end - 1, 2 * end - 1));

            strat = strat+2*k;

            end = strat +2 * k;

        }
        if (tail <k){
            StringBuilder substring = new StringBuilder(s.substring(result*2*k -1, s.length()-1));
            sb.append(substring.reverse());
        }
        else {
            StringBuilder substring1 = new StringBuilder(s.substring(result*2*k -1, s.length()-1-k));
            sb.append(substring1.reverse());
            sb.append(s.substring(result * 2 * k + k - 1, s.length() - 1));
        }

        return String.valueOf(sb);

    }
}

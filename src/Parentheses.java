import java.util.*;

public class Parentheses {
    public List<String> generateParenthesis(int n) {
        List<String> output = new ArrayList<>();
        build(n, "", output, n, n);
        return output;
    }


    public void build(int n, String cur, List output, int left, int right) {
        if(left > right) return;

        if((left == 0 && right == 0)) {
            output.add(cur);
            return;
        }

        if(left > 0) {
            build(n, cur + "(", output, left - 1, right);
        }


        if(right > 0) {
            build(n, cur + ")", output, left, right - 1);
        }
    }
}

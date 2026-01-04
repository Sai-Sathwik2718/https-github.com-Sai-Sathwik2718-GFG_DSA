// User function Template for Java
class Solution {

  public ArrayList<String> generateParentheses(int n) {
        ArrayList<String> res = new ArrayList<>();

        // If n is odd, no valid sequence
        if (n % 2 != 0) return res;

        int pairs = n / 2;
        backtrack(pairs, pairs, "", res);
        return res;
    }

    private void backtrack(int open, int close, String curr, ArrayList<String> res) {

        // Base case: valid balanced string
        if (open == 0 && close == 0) {
            res.add(curr);
            return;
        }

        // Add '(' if available
        if (open > 0) {
            backtrack(open - 1, close, curr + "(", res);
        }

        // Add ')' only if it keeps the sequence valid
        if (close > open) {
            backtrack(open, close - 1, curr + ")", res);
        }
    }
}

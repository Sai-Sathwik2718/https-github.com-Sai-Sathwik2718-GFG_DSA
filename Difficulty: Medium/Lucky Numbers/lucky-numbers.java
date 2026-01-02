class Solution {
    static boolean isLucky(int n) {
        return helper(n, 2);
    }

    static boolean helper(int n, int k) {

        // If n gets eliminated at this step
        if (n % k == 0) {
            return false;
        }

        // If k exceeds n, number survives
        if (k > n) {
            return true;
        }

        // Update position after elimination
        int newN = n - (n / k);

        return helper(newN, k + 1);
    }
}

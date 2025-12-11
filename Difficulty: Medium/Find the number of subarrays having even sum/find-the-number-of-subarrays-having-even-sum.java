class Solution {
    public long countEvenSum(int[] arr) {
        long even = 1;  // prefix sum = 0 is even
        long odd = 0;
        long prefix = 0;
        long ans = 0;

        for (int num : arr) {
            prefix += num;

            if (prefix % 2 == 0) {
                ans += even; // even-even → even subarray
                even++;
            } else {
                ans += odd;  // odd-odd → even subarray
                odd++;
            }
        }
        return ans;
    }
}

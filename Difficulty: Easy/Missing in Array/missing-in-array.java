class Solution {
    int missingNum(int arr[]) {
        int n = arr.length + 1;  // because array has n-1 elements
        long expected = (long) n * (n + 1) / 2;

        long sum = 0;
        for (int x : arr) {
            sum += x;
        }

        return (int)(expected - sum);
    }
}


class Solution {

    public void Rearrange(int a[], int n) {
        int[] ans = new int[n];
        int idx = 0;

        // Step 1: add all negative numbers
        for (int i = 0; i < n; i++) {
            if (a[i] < 0) {
                ans[idx++] = a[i];
            }
        }

        // Step 2: add all positive numbers
        for (int i = 0; i < n; i++) {
            if (a[i] >= 0) {
                ans[idx++] = a[i];
            }
        }

        // Step 3: copy back to original array
        for (int i = 0; i < n; i++) {
            a[i] = ans[i];
        }
    }
}


// User function Template for Java

class Solution {
    public static int findSum(int A[], int N) {
        // code here
        Arrays.sort(A);
        int l=A.length-1;
        int mini=A[0];
        int max=A[A.length-1];
        return mini+max;
    }
}

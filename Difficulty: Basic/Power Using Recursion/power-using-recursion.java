class Solution {
    static int RecursivePower(int n, int p) {
        // Code here
        if(n==1 || p==0) return 1;
        int j=n*RecursivePower(n,p-1);
        return j;
    }
}

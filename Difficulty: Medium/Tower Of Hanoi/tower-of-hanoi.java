class Solution {
    public int towerOfHanoi(int n, int from, int to, int aux) {
        // code here
        // if(n==0) return;
        // towerOfHanoi(n-1,src,dest,aux);
        // towerOfHanoi(n-1,aux,dest,src);
        return (int)(1L<<n)-1;
    }
}

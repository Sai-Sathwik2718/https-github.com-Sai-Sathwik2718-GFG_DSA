class Solution {
    public int findMin(int n) {
        // code here
        int coins=0;
        coins+=n/10;
        n=n%10;
        coins+=n/5;
        n=n%5;
        coins+=n/2;
        n=n%2;
        coins+=n/1;
        n=n/1;
        return coins;
    }
}

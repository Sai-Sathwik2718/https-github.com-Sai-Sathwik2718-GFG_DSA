class Solution {
    static boolean isPrime(int n) {
        // code here
        int cnt=0;
        for(int i=1;i<=n;i++){
            int rem=n%i;
            if(rem==0){
                cnt+=1;
            }
        }
        return cnt==2;
    }
}
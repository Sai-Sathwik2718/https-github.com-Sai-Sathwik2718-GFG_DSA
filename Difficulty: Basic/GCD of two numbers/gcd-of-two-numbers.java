class Solution {
    public static int gcd(int a, int b) {
        // code here
        while(b!=0){
            int rem=a%b;
            int temp=b;
            b=rem;
            a=temp;
        }
        return a;
    }
}

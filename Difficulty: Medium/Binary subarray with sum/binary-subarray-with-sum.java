// User function Template for Java

class Solution {
    public int numberOfSubarrays(int[] arr, int target) {
        // code here
        return atmost(arr,target)-atmost(arr,target-1);
    }
    public int atmost(int[] arr,int target){
        int left=0;
        int sum=0;
        int cnt=0;
        for(int right=0;right<arr.length;right++){
            sum+=arr[right];
            while(sum>target){
                sum-=arr[left];
                left++;
            }
            cnt+=(right-left+1);
        }
        return cnt;
    }
}
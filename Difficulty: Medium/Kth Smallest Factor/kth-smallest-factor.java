// User function Template for Java

class Solution {
    static int kThSmallestFactor(int n, int k) {
        // code here
        ArrayList<Integer> ar=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                ar.add(i);
            }
        }
        PriorityQueue<Integer> pr=new PriorityQueue<>();
        for(int j:ar){
            pr.add(j);
        }
        if (k > pr.size()) return -1; 
        for(int i=1;i<k;i++){
            pr.poll();
        }
        return pr.poll();
    }
}
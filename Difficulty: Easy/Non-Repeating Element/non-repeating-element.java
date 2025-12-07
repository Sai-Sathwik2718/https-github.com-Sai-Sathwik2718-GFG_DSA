// User function Template for Java

class Solution {
    public int firstNonRepeating(int[] arr) {
        // Complete the function
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int a:arr){
            map.put(a,(map.getOrDefault(a,0))+1);
        }
        for(int a:arr){
            if(map.get(a)==1){
                return a;
            }
        }
        return 0;
    }
}

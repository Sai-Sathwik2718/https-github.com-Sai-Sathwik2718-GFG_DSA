class Solution {
    // Method to find the element with odd occurrence in given array
    int getOddOccurrence(int[] arr) {
        // code here
        int res=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int a:arr){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        for(Map.Entry<Integer,Integer> it: map.entrySet()){
            if((it.getValue())%2!=0){
                res=it.getKey();
            }
        }
        return res;
        
    }
}
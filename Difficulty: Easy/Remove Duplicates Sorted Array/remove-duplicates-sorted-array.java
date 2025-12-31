class Solution {
    // Function to remove duplicates from the given array.
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[j]!=arr[i]){
                arr[i+1]=arr[j];
                i++;
            }
        }
        for(int k=0;k<=i;k++){
            res.add(arr[k]);
            
        }
        return res;
    }
}

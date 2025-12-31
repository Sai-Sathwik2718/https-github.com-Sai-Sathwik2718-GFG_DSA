class Solution {
    public List<Integer> frequencyCount(int[] arr) {
        // code here
         ArrayList<Integer> res = new ArrayList<>();
        int n=arr.length;
        // initialize with zeros
        for (int i = 0; i < n; i++) {
            res.add(0);
        }

        for (int x : arr) {
            res.set(x - 1, res.get(x - 1) + 1);
        }

        return res;
        
    }
}

// User function Template for Java

class Solution {
    ArrayList<Integer> arranged(ArrayList<Integer> arr) {

        int pos = 0, neg = 1;
        int n = arr.size();

        // FIX 1: Create ArrayList with size n
        ArrayList<Integer> res = new ArrayList<>(Collections.nCopies(n, 0));

        for (int i = 0; i < n; i++) {
            if (arr.get(i) < 0) {
                res.set(neg, arr.get(i));  // FIX 2: use set()
                neg += 2;
            } else {
                res.set(pos, arr.get(i));
                pos += 2;
            }
        }
        return res;
    }
}

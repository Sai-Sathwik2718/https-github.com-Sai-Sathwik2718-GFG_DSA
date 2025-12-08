class Solution {
    public ArrayList<Integer> minAnd2ndMin(int[] arr) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        Arrays.sort(arr);
        res.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
        if (arr[i] != arr[i - 1]) {
            res.add(arr[i]);
            break;
        }
    }

    // if only one unique element → return [-1]
    if (res.size() < 2) {
        res.clear();
        res.add(-1);
    }

    return res;
    }
}

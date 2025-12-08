class Solution:
    def findDuplicates(self, arr):
        # code here
       
        freq = {}
        for x in arr:
            freq[x] = freq.get(x, 0) + 1

        res = [x for x, c in freq.items() if c == 2]
        return res
                
       
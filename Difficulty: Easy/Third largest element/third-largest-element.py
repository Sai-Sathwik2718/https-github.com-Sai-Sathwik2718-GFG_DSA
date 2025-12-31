class Solution:
    def thirdLargest(self,arr):
        # code here
        n=len(arr)
        arr.sort()
        if n<3:
            return -1
        else:
            return arr[-3]
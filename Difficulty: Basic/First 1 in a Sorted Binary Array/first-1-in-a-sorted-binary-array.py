#User function Template for python3

class Solution:
    def firstIndex(self, arr):
    # Your code goes here
        for i in range(len(arr)):
            if arr[i]==1:
                return i
            
        return -1

class Solution:
    def minPatches(self, nums: List[int], n: int) -> int:
        right = 0 
        patches = 0

        for num in nums:
            while n > right and num > right + 1:
                right += right + 1
                patches += 1
            right += num

        while n > right:
            right += right + 1
            patches += 1
            
        return patches 
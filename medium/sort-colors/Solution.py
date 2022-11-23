class Solution:
    def sortColors(self, nums: List[int]) -> None:
        a = b = c = i = 0
        while i < len(nums):
            if nums[i] == 0:
                a += 1
            elif nums[i] == 1:
                b += 1
            else:
                c += 1
            i += 1
        i = 0
        while i < len(nums):
            if i < a:
                nums[i] = 0
            elif i < a + b:
                nums[i] = 1
            else:
                nums[i] = 2
            i += 1
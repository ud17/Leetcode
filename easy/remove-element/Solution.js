/**
 * @param {number[]} nums
 * @param {number} val
 * @return {number}
 */

var swap = (nums, start, end) => {

    let temp = nums[start];
    nums[start] = nums[end];
    nums[end] = temp;
    return nums;
}

var removeElement = function(nums, val) {
    let end = nums.length-1;
    let start = 0;

    while(start<=end) {
        if(nums[start] === val) {
            nums = swap(nums, start, end);
            end--;
            nums.pop();
        } else {
            start++;
        }
    }
    
    return nums.length;
};
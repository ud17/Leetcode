/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
 var twoSum = function(nums, target) {
    const map = new Map();
    
    for(let n=0; n<nums.length; n++) {
        var x = target - nums[n];
        if(map.has(x)) {
            return [map.get(x), n];
        }
        map.set(nums[n], n);
    }
};
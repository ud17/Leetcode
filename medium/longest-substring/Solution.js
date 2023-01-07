/**
 * @param {string} s
 * @return {number}
 */
 var lengthOfLongestSubstring = function(s) {
    if(s.length === 1) return 1;
    let longestSubstring = 0;
    let map = new Map();

    for(let i=0; i<s.length; i++) {
        let char = s.charAt(i);
        let length = 0, index = i;
        while(index < s.length && !map.has(char)) {
            map.set(char, 1);
            length++;
            index++;
            char = s.charAt(index);
        }

        if(length>longestSubstring) {
            longestSubstring = length;
        }

        map.clear();
    }
    return longestSubstring;
};
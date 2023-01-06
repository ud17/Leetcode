/**
 * @param {string[]} strs
 * @return {string}
 */
 var longestCommonPrefix = function(strs) {
    
    let idx = 0;
    let longestPrefix = "";

    while(true) {
        let char = strs[0].charAt(idx);

        if(!char) return longestPrefix;

        for(let str of strs) {
            let curr = str.charAt(idx);

            if(!curr || char != curr) return longestPrefix;
        }

        longestPrefix += char;
        idx++;
    }
};
/**
 * @param {string} s
 * @return {boolean}
 */
 var isValid = function(s) {
    let l = s.length;
    var stack = [];

    for(let c of s) {
        if(c === '(' || c === '{' || c === '[') {
            stack.push(c);
        }
        else if (stack.length && c === ')' && stack[stack.length-1] === '(' ) {
            stack.pop();
        } 
        else if (stack.length && c === '}' && stack[stack.length-1] === '{' ) {
            stack.pop();
        } 
        else if (stack.length && c === ']' && stack[stack.length-1] === '[' ) {
            stack.pop();
        } 
        else return false;
    }
    return !stack.length;
};
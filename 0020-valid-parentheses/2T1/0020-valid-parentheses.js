/**
 * @param {string} s
 * @return {boolean}
 */
var isValid = function(s) {
    let stack = [];
    const brackets = {
        "[" : "]",
        "(" : ")",
        "{" : "}"
    }
    for(const i of s){
        if('([{'.includes(i)) stack.push(i);
        else if(brackets[stack.pop()] != i) return false;
    }
    return stack.length === 0;
};
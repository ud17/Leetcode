/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isIsomorphic = function(s, t) {
    let sLength = s.length;
    let tLength = t.length;
    if(sLength !== tLength) return false;

    let map = new Map();

    for(let i=0; i<sLength; i++) {
        let sc = s.charAt(i);
        let tc = t.charAt(i);

        if(map.has(sc)) {
            if(map.get(sc) !== tc) return false;
        } else {
            map.set(sc, tc);
        }
    }
    map.clear();

    for(let i=0; i<sLength; i++) {
        let sc = s.charAt(i);
        let tc = t.charAt(i);

        if(map.has(tc)) {
            if(map.get(tc) !== sc) return false;
        } else {
            map.set(tc, sc);
        }
    }

    return true;
};
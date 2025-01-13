function shortestPalindrome(s: string): string {
    let reverse: string = s.split("").reverse().join("");
    const tam: number = s.length;
    if (s === reverse) {
        return reverse;   
    }
    for (let i = 0; i < tam; i++) {
        if (s.startsWith(reverse.slice(i, tam))) {
            return reverse.slice(0, i).concat(s);
        }
    }
    return "";
};
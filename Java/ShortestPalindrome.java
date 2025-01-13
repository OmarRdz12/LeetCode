class Solution {
    public String reverse(String s) {
        String reverse = "";
        for(int i = s.length() - 1; i >= 0; i--){
            reverse += s.charAt(i);
        }
        return reverse;
    }

    public String shortestPalindrome(String s) {
        int size = s.length();
        String rev = reverse(s);
        if(s.compareTo(rev) == 0) {
            return s;
        }
        for(int i = 0; i < size; i++) {
            if(s.startsWith(rev.substring(i, size))) {
                return rev.substring(0, i).concat(s);
            }
        } 
        return s;
    }
}
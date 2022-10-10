class Solution {
    public String breakPalindrome(String palindrome) {
        if(palindrome.length() == 1) return "";
        char[] word = palindrome.toCharArray();
        int n = word.length;
        int i = 0;
        for( ; i < n; i++) {
            if(word[i] == 'a') continue;
            word[i] = 'a';
            if(!isPalindrome(new String(word))) break;
            word[i] = palindrome.charAt(i);
        }
        if(i == n) word[n - 1] = 'b';
        return new String(word);
    }
    
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while(i < j) {
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}

class Solution {
    public boolean canConstruct(String s1, String s2) {
    int[] hash1 = new int[26];
    int[] hash2 = new int[26];
    
    for(int i = 0;i < s1.length();i++){
        int pos = s1.charAt(i) - 'a';
        
        hash1[pos]++;
    }
    
    for(int i = 0;i < s2.length();i++){
        int pos = s2.charAt(i) - 'a';
        
        hash2[pos]++;
    }
    
    for(int i = 0;i < s1.length();i++){
        int pos = s1.charAt(i) - 'a';
        
        if(hash2[pos] < hash1[pos]){
            return false;
        }
    }
    
    return true;
    }
}

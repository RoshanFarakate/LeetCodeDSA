class Solution {
    public String longestCommonPrefix(String[] strs) {
         String ans=strs[0];
        for(String s : strs){
            if(ans=="")
                break;
            while(!(s.startsWith(ans)))
                ans=ans.substring(0,ans.length()-1);
        }
        return ans;
    }
}

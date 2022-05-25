class Solution {
    public String restoreString(String s, int[] indices) {
        int i,n=indices.length;
        char ans[] = new char[n];
        for(i=0;i<n;i++){
            ans[indices[i]]=s.charAt(i);
        }
        return new String(ans);
    }
}

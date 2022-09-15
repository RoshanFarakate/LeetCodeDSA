class Solution {
    public int[] findOriginalArray(int[] changed) {
        if(changed.length%2==1){ return new int[0]; }
        
        int[] arr=new int[100001];
        
        for(int i : changed){ arr[i]++; }

        int k=changed.length/2;
        
        int[] ans=new int[k];
        
        int index=0;
        
        for(int i=0; i<100001; i++){
            if(arr[i]>0){
                int j=i*2;
                if(j>100000 || arr[j]==0){ return new int[0]; }
                else{ arr[j]--; ans[index]=i; index++; }
                arr[i]--; i--;
            }
        }
        
        return ans;
    }
}

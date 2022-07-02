class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        
        int n=horizontalCuts.length;
        int m=verticalCuts.length;
        
         long maxHorizontalCut=Integer.MIN_VALUE;
         long maxVerticalCut=Integer.MIN_VALUE;
        
        int mod=1000000007;
        
        for(int i=0;i<n;i++){
            if(i==0)
                maxHorizontalCut=(long)Math.max(maxHorizontalCut,horizontalCuts[i]-0);  
            else
                maxHorizontalCut=(long)Math.max(maxHorizontalCut,horizontalCuts[i]-horizontalCuts[i-1]);
        }
        
        maxHorizontalCut=Math.max(maxHorizontalCut,h-horizontalCuts[n-1]);
      
        for(int i=0;i<m;i++){
            if(i==0)
                maxVerticalCut=Math.max(maxVerticalCut,verticalCuts[i]-0);            
            else
                maxVerticalCut=(long)Math.max(maxVerticalCut,verticalCuts[i]-verticalCuts[i-1]);
        }
    
        maxVerticalCut=(long)Math.max(maxVerticalCut,w-verticalCuts[m-1]);
        return (int)((maxHorizontalCut*maxVerticalCut)%mod);
        
    }
}

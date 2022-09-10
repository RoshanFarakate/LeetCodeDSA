class Solution {
    public int maxProfit(int k, int[] price)   //prices->price
    {
        if(price.length==0 || k==0)
            return 0;
        int[] minPrice=new int[k],profit=new int[k];
        
        for(int i=0;i<k;i++)
        {
            minPrice[i]=Integer.MAX_VALUE;
            profit[i]=0;
        }
        
     //    current_price-minPrice= rofit
     // => minPrice= current_price-(previous transaction profit)
        
        for(int i=0;i<price.length;i++)
        {
            for(int j=0;j<k;j++)
            {
                minPrice[j]=Math.min(minPrice[j],price[i]-(j==0? 0:profit[j-1]));
                profit[j]=Math.max(profit[j],price[i]-minPrice[j]);
            }
        }
        return profit[k-1];
    }
}

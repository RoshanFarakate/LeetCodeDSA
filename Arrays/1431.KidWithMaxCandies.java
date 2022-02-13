class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> output = new ArrayList<Boolean>();
        
        int maximum = candies[0];   // start with the first value
        for (int i=1; i<candies.length; i++) {
        if (candies[i] > maximum) {
            maximum = candies[i];   // new maximum
        }
    }
    int max = maximum;
        
        for(int i=0;i<candies.length;i++)
        {
            int res = candies[i] + extraCandies;
            if(res >= max){
                output.add(true);
            }
            else if(res<max){
                output.add(false);
            }
        }
        return output;
    }
}

class Solution {
    public int candy(int[] ratings) {
        int[] arr=new int[ratings.length];
        for(int i=1; i<ratings.length; i++){
            if(ratings[i]>ratings[i-1])
                { 
                    arr[i]=arr[i-1]+1; 
                }
        }
        for(int i=ratings.length-2; i>=0; i--){
            if(ratings[i]>ratings[i+1] && arr[i]<=arr[i+1]){ arr[i]=arr[i+1]+1; i++; }
        }
        int sum=ratings.length;
        for(int i : arr){ sum+=i; }
        return sum;
    }
}

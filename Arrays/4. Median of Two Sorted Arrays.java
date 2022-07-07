class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double fact = 1e5, ans = 0;
        int len = nums1.length + nums2.length;
        int[] arr = new int[len];
        for(int i=0; i<len; i++){
            if(i<nums1.length)
                arr[i] = nums1[i];
            else
                arr[i] = nums2[i-nums1.length];
        }
        Arrays.sort(arr);
        if(len%2==0)
            ans = (double)(arr[(len)/2 - 1]+arr[(len)/2])/2;
        else
            ans = arr[len/2];
        return Math.round(ans * fact)/fact;
    }
}

class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int[][] arr1 = new int[arr.length][2];
        for(int i=0; i<arr.length; i++){
            arr1[i][0] = arr[i];
            arr1[i][1] = Math.abs(arr[i]-x);
        }
        Arrays.sort(arr1,(a,b)->a[1]<b[1]?-1:a[1]==b[1]?0:1);
        List<Integer> ans = new ArrayList<>();
        for(int i=0; i<k; i++){
            ans.add(arr1[i][0]);
        }
        Collections.sort(ans);
        return ans;
    }
}

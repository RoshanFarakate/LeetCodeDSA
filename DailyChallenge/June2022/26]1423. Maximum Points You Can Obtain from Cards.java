class Solution {
    public int maxScore(int[] A, int k) {
        int res, curr, n = A.length;
	    res = curr = Arrays.stream(A,0,k).sum();
	    for(int i = 0 ; i < k ; i++) {
		    curr += A[n - 1 - i] - A[k - 1 - i];
		    res = Math.max(res,curr);
	    }
	    return res;
    }
}

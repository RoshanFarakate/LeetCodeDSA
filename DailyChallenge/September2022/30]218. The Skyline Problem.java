class Solution {
    public List<List<Integer>> getSkyline(int[][] buildings) {
        return getSkyline(buildings, 0, buildings.length-1);
    }
    
    private List<List<Integer>> getSkyline(int[][] buildings, int start, int end) {
        if (start > end) return new ArrayList();
        if (start == end) {
            List<List<Integer>> skyline = new ArrayList();
            addPoint(skyline, buildings[start][0], buildings[start][2]);
            addPoint(skyline, buildings[start][1], 0);
            return skyline;
        }
        int mid = start + (end - start) / 2;
        List<List<Integer>> leftSkyline = getSkyline(buildings, start, mid);
        List<List<Integer>> rightSkyline = getSkyline(buildings, mid+1, end);
        return merge(buildings, leftSkyline, rightSkyline);
    }
    
    private List<List<Integer>> merge(int[][] buildings, 
                                      List<List<Integer>> left, List<List<Integer>> right) {
        List<List<Integer>> skyline = new ArrayList();
        int pL = 0, pR = 0, currY = 0, leftY = 0, rightY = 0, currX = 0;
        while(pL < left.size() && pR < right.size()) {
            int lx = left.get(pL).get(0);
            int ly = left.get(pL).get(1);
            int rx = right.get(pR).get(0);
            int ry = right.get(pR).get(1);
        
            if (lx < rx) {
                leftY = ly; currX = lx;
                pL++;
            } else if (rx < lx) {
                rightY = ry; currX = rx;
                pR++;                
            } else {
                leftY = ly; rightY = ry;
                currX = lx;
                pL++;
                pR++;
            }
            int max = Math.max(leftY, rightY);
            if (currY != max) {
                currY = max;
                addPoint(skyline, currX, currY);
            }
        }
        
        while(pL < left.size()) {
            addPoint(skyline, left.get(pL).get(0), left.get(pL).get(1));
            pL++;
        }
        
        while(pR < right.size()) {
            addPoint(skyline, right.get(pR).get(0), right.get(pR).get(1));
            pR++;         
        }
        return skyline;
    }
    
    private void addPoint(List<List<Integer>> skyline, int x, int y) {
        List<Integer> p = new ArrayList() {{add(x); add(y);}};
        skyline.add(p);
    }
}

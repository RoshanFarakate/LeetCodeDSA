class Solution {
    
    public int minCost(int[] houses, int[][] cost, int m, int n, int target) {
        
		// Map of paint -> target -> cost (ptc)
		Map<Integer, Map<Integer, Integer>> ptc = new HashMap<>();
        
        for (int i = 0; i < m; i++) {
            Map<Integer, Map<Integer, Integer>> newPtc = new HashMap<>();
            if (houses[i] != 0) {
                newPtc.put(houses[i], compute(ptc, houses[i], 0));
            } else {
			    // Try all possible paints and compute minimum (target->cost).
                for (int p = 0; p < n; p++) {
                    newPtc.put(p+1, compute(ptc, p+1, cost[i][p]));
                }
            }
            ptc = newPtc;
        }
        
		// Get the min cost
        int minCost = Integer.MAX_VALUE;
        for (Map<Integer, Integer> tcMap : ptc.values()) {
            for (Integer t : tcMap.keySet()) {
                if (t == target) {
                   minCost = Math.min(minCost, tcMap.get(t));
                }    
            }
        }
        
        return minCost == Integer.MAX_VALUE ? -1 : minCost;
    }
    
	// Compute the (target->cost) for the paint you are applying to i'th house.
    private Map<Integer, Integer> compute(Map<Integer, Map<Integer, Integer>> ptc, int currentHousePaint, int cost) {
        Map<Integer, Integer> tc = new HashMap<>();

		// If it is the first house, target is 1.
        if (ptc.size() == 0) {
            tc.put(1, cost);
            return tc;
        }
        
		// For the paint->target->value of (i-1)'th house, compute new minimum (target->value)
        for (int prevPaint : ptc.keySet()) {
            for (int prevTarget : ptc.get(prevPaint).keySet()) {   
                int newTarget = prevTarget;
                if (prevPaint != currentHousePaint) {
                    newTarget = prevTarget+1;
                }
                int prevCost = tc.getOrDefault(newTarget, Integer.MAX_VALUE);
                int newCost = Math.min(prevCost, ptc.get(prevPaint).get(prevTarget) + cost);
                tc.put(newTarget, newCost);
            }
        }
        return tc;
    }
    
}

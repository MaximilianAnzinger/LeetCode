class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        return solve(candidates, 0, target);
    }
    
    public List<List<Integer>> solve(int[] candidates, int i, int target) {
        LinkedList<List<Integer>> result = new LinkedList<>();
        for(int j = i; j < candidates.length; j++) {
            if(candidates[j] == target) {
                LinkedList<Integer> l = new LinkedList<>();
                l.add(candidates[j]);
                result.add(l);
            }
            if(target <= candidates[j])
                break;
            for(List<Integer> l : solve(candidates, j, target - candidates[j])) {
                l.add(candidates[j]);
                result.add(l);
            }
        }
        return result;
    }
}
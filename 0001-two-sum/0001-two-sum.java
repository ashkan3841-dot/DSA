class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] ans = {-1};
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<n;i++){
            int v=target - nums[i];
            if(mp.containsKey(v)){
                int k=mp.get(v);
                ans = new int[]{i,k};
                return ans;
            }else{
                mp.put(nums[i],i);
            }
        }
        return ans;

        
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] ans = {-1};
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<n;i++){
            
            if(mp.containsKey(target-nums[i])){
                ans = new int[]{i,mp.get(target-nums[i])};
                return ans;
            }else{
                mp.put(nums[i],i);
            }
        }
        return ans;

        
    }
}
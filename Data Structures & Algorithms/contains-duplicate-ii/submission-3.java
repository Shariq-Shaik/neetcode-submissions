class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        for(int i=0;i<nums.length;i++){
            int idx = i+1;
            int cnt = 0;
            while(idx<nums.length && cnt<k){
                if(nums[i] == nums[idx]){
                    return true;
                }
                idx++;
                cnt++;
            }
            
        }
        return false;
        
    }
}
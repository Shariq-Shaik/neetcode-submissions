class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
       HashSet<Integer>set = new HashSet<>();
       for(int i:nums){
        set.add(i);
       }
       int max = 0;
       for(int i:nums){
        if(!set.contains(i-1)){
            int currnum = i;
            int cnt = 1;
            while(set.contains(currnum+1)){
                currnum++;
                cnt++;
            }
            max = Math.max(max,cnt);
        }
       }       
       return max;
    }
}

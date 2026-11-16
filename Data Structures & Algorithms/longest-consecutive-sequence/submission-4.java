class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int max = 0;
        for (int i:nums){
            set.add(i);
        }
        for(int i:set){
            if(!set.contains(i-1)){
                int key = i;
                int cnt = 0;
                while(set.contains(key)){
                    cnt++;
                    key++;
                    
                }
                max = Math.max(max,cnt);
            }
        }
        return max;
    }
}

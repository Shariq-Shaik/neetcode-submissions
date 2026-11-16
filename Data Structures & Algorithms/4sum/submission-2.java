class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>>list = new ArrayList<>();
        HashSet<List> set = new HashSet<>();
        Arrays.sort(nums);
        if(target<0 && nums[0]>=0){
            return list;
        }
        for(int i = 0;i<nums.length-3;i++){
         
            for(int j = i+1;j<nums.length-2;j++){
                
                int start = j+1;
                int end = nums.length-1;
                while(start<end){
                    int sum = nums[i]+nums[j]+nums[start]+nums[end];
                    if(sum == target){
                    List<Integer> ans =  Arrays.asList(nums[i],nums[j],nums[start],nums[end]);
                    if(!set.contains(ans)){
                        list.add(ans);
                        set.add(ans);
                    }
                       
                        while(start<end && nums[start] == nums[start+1]){
                            start++;
                        }
                        while(start<end && nums[end] == nums[end-1]){
                            end--;
                        }
                        start++;
                        end--;
                    }else if(sum<target){
                        start++;
                    }else{
                        end--;
                    }
                }
            }
        }
        return list;
    }
}
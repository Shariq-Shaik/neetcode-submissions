class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer>map = new HashMap<>();
        HashSet<Integer>set = new HashSet<>();
        List<Integer>list = new ArrayList<>();
        for(int i: nums){
            map.put(i,map.getOrDefault(i,0)+1);
            if(map.get(i)> n/3 && !set.contains(i)){
                list.add(i);
                set.add(i);
            }
        }
        return list;
    }
}
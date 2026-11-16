class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashSet<String>set = new HashSet<>();
        List<List<String>>ans = new ArrayList<>();
        for(int i = 0;i<strs.length;i++){
            if (set.contains(strs[i])) {
                continue;
            }
            char a[] = strs[i].toCharArray();
            Arrays.sort(a);
            List<String>list = new ArrayList<>();
            for(int j = i;j<strs.length;j++){
                if(strs[i].length() == strs[j].length()){
                    char b[] = strs[j].toCharArray();
                    Arrays.sort(b);
                    
                    if(Arrays.equals(a,b)){
                        list.add(strs[j]);
                        set.add(strs[j]);
                    }
                }
            }
            if(list.size()!= 0){
                ans.add(list);
            }
        }
        return ans;
    }
}

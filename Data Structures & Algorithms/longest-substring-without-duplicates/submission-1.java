class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int idx = 0;
        int max = 0;
        for(int i = 0;i<s.length();i++){
            char a = s.charAt(i);
            while(set.contains(a)){
                set.remove(s.charAt(idx));
                idx++;
            }
            set.add(a);
                max = Math.max(max,i-idx+1);
            
        }
        return max;
    }
}

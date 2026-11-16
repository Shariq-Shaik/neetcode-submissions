class Solution {
    public String longestCommonPrefix(String[] strs) {
        String n = strs[0];
        String ans = "";
        for (int i = 1;i<=n.length();i++){
            String str1 = n.substring(0,i);
            for(int j = 1;j<strs.length;j++){
                if(i> strs[j].length()){
                    return ans;
                }            
                String str2 = strs[j].substring(0,i);
                if(!str1.equals(str2)){
                    return ans;
                }
            }
            ans = str1;
        }
        return ans;
    }
}
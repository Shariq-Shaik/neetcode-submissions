class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        int minlen = Math.min(len1,len2);
        String ans = "";
        for(int i = 0;i<minlen;i++){
            ans = ans + word1.charAt(i)+word2.charAt(i);
        }
        if(len1>minlen){
            ans+=word1.substring(minlen,len1);
        }
        if(len2>minlen){
            ans+=word2.substring(minlen,len2);
        }
        return ans;
    }
}
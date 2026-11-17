class Solution {
    public int characterReplacement(String s, int k) {
        int arr[] = new int[26];
        int maxfreq = 0;
        int idx = 0;
        int maxlen = 0;
        for(int i = 0;i<s.length();i++){
            arr[s.charAt(i)-'A']++;
            maxfreq = Math.max(maxfreq,arr[s.charAt(i)-'A']);
            if(i-idx+1 - maxfreq <=k){
                maxlen = Math.max(maxlen,i-idx+1);
            }else{
                arr[s.charAt(idx)-'A']--;
                idx++;
            }
        }
        return maxlen;
    }
}

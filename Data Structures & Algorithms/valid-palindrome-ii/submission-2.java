class Solution {
    public boolean validPalindrome(String s) {
        int cnt = 0;
        int n = s.length();
        for(int i = 0;i<s.length()/2;i++){
            int idx = n-i-1;
            if(s.charAt(i)!=s.charAt(idx)){
                boolean val1 = false;
                boolean val2 = false;
                String str1 = s.substring(i+1,idx+1);
                String str2 = s.substring(i,idx);
                String str3 = new StringBuilder(str1).reverse().toString();
                val1 = str1.equals(str3);
                String str4 = new StringBuilder(str2).reverse().toString();
                val2 = str2.equals(str4);
                return val1||val2;
            }
        }
        return true;
    }
}
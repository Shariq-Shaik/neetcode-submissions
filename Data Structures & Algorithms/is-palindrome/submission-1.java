class Solution {
    public boolean isPalindrome(String s) {
          String s1 = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            if((s1.charAt(i)>='a'&&s1.charAt(i)<='z')||(s1.charAt(i)>='0'&&s1.charAt(i)<='9')){
                sb.append(s1.charAt(i));
            }
        }
        String str = sb.toString();
        System.out.println(str);
        for(int i = 0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}

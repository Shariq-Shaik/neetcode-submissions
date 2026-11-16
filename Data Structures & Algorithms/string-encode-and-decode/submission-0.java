class Solution {

    public String encode(List<String> strs) {
        String encoded = "";
        for (int i = 0;i< strs.size();i++){
            int n = strs.get(i).length();
            encoded=encoded+Integer.toString(n)+"#"+strs.get(i);
        }
        return encoded;
    }

    public List<String> decode(String str) {
       int i = 0;
List<String> res = new ArrayList<>();
while (i < str.length()) {
    int delimiter = str.indexOf('#', i);
    int length = Integer.parseInt(str.substring(i, delimiter));
    int start = delimiter + 1;
    res.add(str.substring(start, start + length));
    i = start + length;
}
return res;
    }
}

class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int start = 0;
        int end = people.length-1;
        int cnt = 0;
        while(start<end && people[end]>=limit){
            cnt++;
            end--;           
        }
        int len = end-start+1;
        while(start<=end){
            int sum = people[start]+people[end];
           
            if(sum <=limit){
                start++;
                end--;
            }else{
                end--;
            }
             cnt++;
        }
        return cnt;
    }
}
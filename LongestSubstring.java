class Solution{
    public int lengthOfLongestSubstring(String s){
        int left = 0;
        int maxlength = 0;
        int count[] = new int[128];

        for(int right = 0; right < s.length(); right++){
            char rchar = s.charAt(right);
            count[rchar]++;

            while(count[rchar]>1){
                char lchar = s.charAt(left);
                count[lchar]--;
                left++;
            } 
            maxLength = Math.max(maxlength, right - left + 1);
        }
        return maxlength;
    }
}
class Solution{
    public boolean isPalindrome(String s){
        int left = 0;
        int right = s.length()-1;

        while(left<right){
            char lchar = s.charAt(left);
            char rchar = s.charAt(right);
            if(Character.isLetterOrDigit(s.charAt(left))==false){
                left++;
                continue;
            }
            if(Character.isLetterOrDigit(s.charAt(right))==false){
                right--;
                continue;
            }
            lchar = Character.toLowerCase(lchar);
            rchar = Character.toLowerCase(rchar);
            if(lchar==rchar){
                left++;
                right--;
            }
            else{
                return false;
            }          
        }

         return true;  
    }
}
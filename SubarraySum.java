import java.util.HashSet

class Solution{
    public findSubarrays(int[] nums){
        HashSet<Integer> set = new HashSet<> ();
        for(int i=0;i<nums.length-1;i++){
            int currentSum = nums[i] + nums[i + 1]:
            if(set.contains(currentSum)){
                return true;
            }
            set.add(currentSum);
        }
    return false;
    }
}
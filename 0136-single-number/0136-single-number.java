class Solution {
    public int singleNumber(int[] nums) {
   int ans = 0;
        for(int it:nums) 
            ans= ans ^ it;
        return ans;
    }
}
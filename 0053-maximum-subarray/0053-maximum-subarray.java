class Solution {
    public int maxSubArray(int[] nums) {
         int currentSum=nums[0];
        int result=nums[0];
        for(int i=1;i<nums.length;i++){
            if( currentSum + nums[i] > nums[i]){
                    currentSum =currentSum + nums[i];
            }else{
                currentSum = nums[i];
                
            }
 result= Math.max(result,currentSum);
        }
       
        return result;
    }
}
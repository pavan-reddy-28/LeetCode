class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> obj = new HashSet();
        for(int i =0;i<nums.length;i++){
           if( !obj.add(nums[i])){
               return true;
           }
        }
        return false;
    }
}
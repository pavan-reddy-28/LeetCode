class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> map = new HashSet<>();
        for(int x: nums)
            map.add(x);
        int max=0;
        int count=1;
        for(int value :map){
            count=1;
            if(!map.contains(value+1)){
                while(map.contains(--value)){
                    count++;
                }
            }
            
            max=Math.max(max,count);
            
            
            
        }
        return max;
        
    }
}
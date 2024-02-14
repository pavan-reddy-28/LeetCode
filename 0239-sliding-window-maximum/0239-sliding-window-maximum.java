class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayList<Integer> queue = new ArrayList<>();

        int[] result = new int[nums.length - k + 1];
        int index=0;
        int i=0;
        int j=0;

        while( i <= (nums.length - k) ){
            while(j<(k+i)){
                while( !queue.isEmpty() && (queue.get(queue.size()-1) < nums[j]) ){
                   queue.remove(queue.size()-1);
                }
                queue.add(nums[j]);
                j++;
            }
            if(j==(k+i)){
                result[index] = queue.get(0);
                if(result[index] == nums[i]){
                    queue.remove(0);
                }
                index++;
                i++;
            }


        }
        return result;
    }
}
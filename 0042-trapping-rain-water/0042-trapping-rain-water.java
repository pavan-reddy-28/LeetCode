class Solution {
    public int trap(int[] height) {
        int leftMax=height[0];
        int rightMax = height[height.length-1];
        
        int i =0,j=height.length-1;
        int count=0;
        while(i<j){
            
            if(leftMax<=rightMax){
                int storage = Math.min(leftMax,rightMax);
                storage = storage - height[i];
                if(storage>0)
                    count+=storage;
                i++;
                if(height[i]>leftMax){
                    leftMax=height[i];
                }
            }else{
                int storage = Math.min(leftMax,rightMax);
                storage = storage - height[j];
                if(storage>0)
                    count+=storage;
                j--;
                if(height[j]>rightMax){
                    rightMax=height[j];
                }
            }
            
            
            
        }
        return count;
        
        
        
    }
}
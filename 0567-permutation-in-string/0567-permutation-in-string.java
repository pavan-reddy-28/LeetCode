class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer> pattern = new HashMap<>();
        for(char x : s1.toCharArray()){
            int value = pattern.getOrDefault(x,0);
            pattern.put(x,value+1);
        }

        int count = pattern.size();
        int k =s1.length();
        int i =0;
        int j=0;

   char key= s2.charAt(j);
   int value =0;
        while( i <=( s2.length() - k )){
            
            while(j<(k+i)){
                key = s2.charAt(j);
              value =  pattern.getOrDefault(key,Integer.MIN_VALUE);
               if( value != Integer.MIN_VALUE ){
                   value--;
                   if(value ==0){
                       count--;
                   }
                   pattern.put(key,value);
               }
                j++;
            }

            if(count ==0){
                return true;
            }
            key = s2.charAt(i);
           value =  pattern.getOrDefault(key,Integer.MIN_VALUE);
            if(value != Integer.MIN_VALUE){
                value++;
                if(value ==1){
                    count++;
                }
                pattern.put(key,value);
            }
            i++;
        }
        return false;

    }
}
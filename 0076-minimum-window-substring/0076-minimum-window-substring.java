class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> pattern = new HashMap<>();
        
        for(Character key : t.toCharArray()){
            int value = pattern.getOrDefault(key,0);
            pattern.put(key,value+1);
        }

        String resultString =s;
        boolean visited=false;
        int i=0;
        int j=0;
        int count = pattern.size();
        char key =s.charAt(j);
        int value =0;
        while(i<=( s.length() - t.length())){
            
            while( count >0 &&  j<s.length()){
                key = s.charAt(j);
                value = pattern.getOrDefault(key,Integer.MIN_VALUE);
                if(value!= Integer.MIN_VALUE){
                    value--;
                    pattern.put(key,value);
                    if(value==0){
                        count--;
                    }
                    
                }
                j++;
            }

          if(count==0){
                String result = s.substring(i,j);
          visited=true;
               
                resultString = result.length() < resultString.length() ? result :resultString;
          }
                key = s.charAt(i);
                value = pattern.getOrDefault(key,Integer.MIN_VALUE);
          
                if(value != Integer.MIN_VALUE){
                    value++;
                    if(value ==1){
                        count++;
                    }
                    pattern.put(key,value);
                }

            i++;

            

        }
        return visited?resultString:"";
    
    }
}
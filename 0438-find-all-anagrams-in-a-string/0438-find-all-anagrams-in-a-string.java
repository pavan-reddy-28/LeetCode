class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int k = p.length();
        int count = 0;
        List<Integer> result = new ArrayList<Integer>();
        HashMap<Character, Integer> pattern = new HashMap<>();

        for (Character key : p.toCharArray()) {
            int value = pattern.getOrDefault(key, 0);
            pattern.put(key, value + 1);
        }
        count = pattern.size();

        int i = 0, j = 0;

        while (i <= (s.length() - k)) {
            char key = s.charAt(j);
             int value = pattern.getOrDefault(key, Integer.MIN_VALUE);

            while (j < (i + k)) {

              key = s.charAt(j);
            value = pattern.getOrDefault(key, Integer.MIN_VALUE);
               
                if (value != Integer.MIN_VALUE) {
                    value -= 1;
                    if (value == 0) {
                        count--;
                    }
                    pattern.put(key, value);

                }
                j++;

            }
            
            if (count == 0) {
                result.add(i);
            }

             key = s.charAt(i);

             value = pattern.getOrDefault(key, Integer.MIN_VALUE);
            if (value != Integer.MIN_VALUE) {
                value = value + 1;
                if (value == 1) {
                    count++;
                }
                pattern.put(key,value);
            }
            i++;

        }
        return result;
    }
}
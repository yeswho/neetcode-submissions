class Solution {
    public int lengthOfLongestSubstring(String s) {
        //zxyzxyz
        //--
        Map<Character, Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        int maxLength = 0;

        while(j<s.length()){
            while(map.containsKey(s.charAt(j))){
                map.remove(s.charAt(i));
                i++;
            }
            maxLength = Math.max(maxLength, j-i+1);
            map.put(s.charAt(j),1);
            j++;

        }

        return maxLength;

    }
}

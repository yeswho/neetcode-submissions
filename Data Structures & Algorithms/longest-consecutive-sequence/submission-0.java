class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer, Boolean> map = new HashMap<>();
        int longest = 0;

        for(int n: nums){
            map.put(n, false);
        }

        for(int n: nums){
            int longestC = 1;
            int nextNum = n+1;
            while(map.containsKey(nextNum) && map.get(nextNum) == false){
                longestC++;
                map.put(nextNum, true);
                nextNum++;
            }

            int prevNum = n-1;
            while(map.containsKey(prevNum) && map.get(prevNum)==false){
                longestC++;
                map.put(prevNum, true);
                prevNum--;
            }

            longest = Math.max(longestC, longest);
        }
        return longest;
    }
}

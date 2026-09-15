class Solution {
    public boolean isAnagram(String s, String t) {
        // char[] sArr = s.toCharArray();
        // char[] tArr = t.toCharArray();

        // Arrays.sort(sArr);
        // Arrays.sort(tArr);

        // String sS = new String(sArr);
        // String tS = new String(tArr);

        // if(sS.equals(tS)){
        //     return true;
        // } else{
        //     return false;
        // }
        int[] count = new int[26];
        if(s.length() != t.length()) return false;

        for(int i = 0; i < s.length(); i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        
        for(int n:count){
            if(n!=0){
                return false;
            }
        }
        return true;
    }
}

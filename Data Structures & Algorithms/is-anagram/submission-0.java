class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);

        String sS = new String(sArr);
        String tS = new String(tArr);

        if(sS.equals(tS)){
            return true;
        } else{
            return false;
        }
    }
}

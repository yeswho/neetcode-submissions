class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s : strs){
            sb.append(s.length());
            sb.append('#');
            sb.append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;
        String s = str;
        while(i<s.length()){
            int j = i;
            while(s.charAt(j) != '#'){
                j++;
            }
            int start = j+1;
            int length = Integer.parseInt(s.substring(i,j));
            String actString = s.substring(start, start+length);

            result.add(actString);
            i = start+length; 
        }
        return result;
    }
}

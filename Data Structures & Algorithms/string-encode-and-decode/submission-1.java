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
        //3#app12#somethingabc5#apple
        List<String> res = new ArrayList<>();
        int i = 0;
        while(i < str.length()){
            int j = i;
            //find the #
            while(str.charAt(j) != '#'){
                j++;
            }
            //find the length
            int start = j+1;
            int length = Integer.parseInt(str.substring(i,j));
            String string = str.substring(start,start+length);
            res.add(string);
            i = start + length;
        }
        return res;
    }
}

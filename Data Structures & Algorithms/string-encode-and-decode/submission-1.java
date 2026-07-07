class Solution {

    public String encode(List<String> strs) {
        StringBuilder encode = new StringBuilder();
        for(String str : strs){
            encode.append(str.length());
            encode.append('#');
            encode.append(str);
        }

        return encode.toString();
    }

    public List<String> decode(String str) {
        List<String> decode = new ArrayList<>();

        int i = 0;
        while(i < str.length()){
            int len = 0;

            while(str.charAt(i) != '#'){
                len = len * 10 + (str.charAt(i) - '0');
                i++;
            }

            i++;

            String temp = str.substring(i, i + len);
            decode.add(temp);
            i += len;
        }

        return decode;
    }
}

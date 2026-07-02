class Solution {
    public boolean isAnagram(String s, String t) {
        int[] count = new int[26];

        if(s.length() == t.length()){
            for(int i=0;i<s.length();i++){
                char ch = s.charAt(i);
                int idx = ch - 'a';
                count[idx]++;
            }

            for(int j=0;j<t.length();j++){
                char ch = t.charAt(j);
                int idx = ch - 'a';
                count[idx]--;
            }
        }
        else{
            return false;
        }
        

        for(int i=0;i<count.length;i++){
            if(count[i] != 0){
                return false;
            }
        }
        return true;
    }
}

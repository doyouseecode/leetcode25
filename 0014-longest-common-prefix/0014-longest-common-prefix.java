class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0 || strs == null){
            return "";
        }
        String prefix = strs[0];

        for(int i = 0; i < strs.length; i++){
            while(!strs[i].startsWith(prefix)){
                prefix = prefix.substring(0, prefix.length()-1);
                if(prefix.length()==0) return "";
            }
        }

        return prefix;
    }
}
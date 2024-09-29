class Solution {
    public String longestCommonPrefix(String[] strs) {

        String prefix = strs[0];

        for(int i=1; i<strs.length; i++){
            int prefixLength = prefix.length();
            if(prefixLength==0){
                return "";
            }
            if(strs[i].length()<prefixLength){
                prefixLength = strs[i].length();
            }
            StringBuilder sb = new StringBuilder("");
            for(int j=0; j<prefixLength; j++){
                if(prefix.charAt(j)==strs[i].charAt(j)){
                    sb.append(prefix.charAt(j));
                }else{
                    break;
                }
            }
            prefix = sb.toString();
        }

        return prefix;
        
    }
}
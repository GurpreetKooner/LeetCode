class Solution {
    public String longestCommonPrefix(String[] strs) {

        String prefix = strs[0];

        for(int i=1; i<strs.length; i++){
            String temp = "";
            for(int j=0; (j<strs[i].length() && j<prefix.length()); j++){
                if(strs[i].charAt(j)==prefix.charAt(j)){
                    temp += strs[i].charAt(j);
                }else{
                    break;
                }
            }
            if(temp.equals("")){
                return "";
            }else{
                prefix = temp;
            }
        }

        return prefix;
        
    }
}
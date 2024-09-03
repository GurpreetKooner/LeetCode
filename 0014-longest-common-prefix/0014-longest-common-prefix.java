class Solution {
    public String longestCommonPrefix(String[] strs) {

        int minLength = strs[0].length();

        for(int i=1; i<strs.length; i++){
            if(strs[i].length()<minLength){
                minLength = strs[i].length();
            }
        }

        String prefix = strs[0].substring(0,minLength);

        for(int i=1; i<strs.length; i++){
            String temp = "";
            for(int j=0; (j<minLength && j<prefix.length()); j++){
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
class Solution {
    public boolean isPalindrome(String s){
        int i=0, j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }else{
                i++;
                j--;
            }
        }
        return true;
    }

    public String longestPalindrome(String s) {
        String sb  = "";

        for(int i=0; i<s.length(); i++){
            for(int j=i+1; j<=s.length(); j++){
                String ss = s.substring(i,j);
                if(isPalindrome(ss) && ss.length() > sb.length()){
                    sb = ss;
                } 
            }
        }
        return sb;
    }
}
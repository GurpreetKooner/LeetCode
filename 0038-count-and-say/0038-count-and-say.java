class Solution {

    public String rle(String s){
        if(s.length()==1){
            return "11";
        }
        StringBuilder sb = new StringBuilder("");
        int count = 1;
        int i;

        for(i=1; i<s.length(); i++){
            if(s.charAt(i)==s.charAt(i-1)){
                count++;
            }else{
                sb.append(count);
                sb.append(s.charAt(i-1));
                count = 1;
            }
        }
        sb.append(count);
        sb.append(s.charAt(i-1));
        return sb.toString();
    }

    public String countAndSay(int n) {

        if(n==1){
            return "1";
        }
        String ans = rle(countAndSay(n-1));
        return ans;
    }

}
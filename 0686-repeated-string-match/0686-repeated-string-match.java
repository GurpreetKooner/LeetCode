class Solution {
    public int repeatedStringMatch(String a, String b) {

        StringBuilder sb = new StringBuilder("");
        int count = 0;

        while(sb.length()<b.length()){
            sb.append(a);
            count++;
        }

        if(sb.indexOf(b)==-1){
            sb.append(a);
            count++;
            if(sb.indexOf(b)==-1){
                return -1;
            }
        }else{
            return count;
        }
        return count;
    }
}
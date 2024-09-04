class Solution {
    public String makeFancyString(String s) {

        int n = s.length();
        if (n > 2) {
            StringBuilder sb = new StringBuilder();
            sb.append(s.charAt(0));
            int i = 1;

            while (i < n - 1) {
                if (!(s.charAt(i) == s.charAt(i - 1) && s.charAt(i) == s.charAt(i + 1))) {
                    sb.append(s.charAt(i));
                }
                i++;
            }
            sb.append(s.charAt(n - 1));
            return sb.toString();
        }else{
            return s;
        }

    }
}
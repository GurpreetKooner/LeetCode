class Solution {
    public int myAtoi(String s) {

        s = s.trim();
        boolean neg = false;
        long ans = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= '0' && ch <= '9') {
                int dig = ch - '0';
                ans = ans * 10 + dig;

                if (neg) {
                    long check = -ans;
                    if (check <= Integer.MIN_VALUE) {
                        return Integer.MIN_VALUE;
                    }
                } else if (ans >= Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }
            } else {
                if (i == 0 && (ch == '-' || ch == '+')) {
                    if (ch == '-') {
                        neg = true;
                    }
                } else {
                    break;
                }
            }
        }
        if(neg){
            ans = -ans;
        }

        return (int) ans;
    }
}
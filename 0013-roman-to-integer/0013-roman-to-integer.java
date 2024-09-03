class Solution {

    public int symbolValue(char r) {
        int val = 0;
        switch (r) {
            case 'I':
                val = 1;
                break;
            case 'V':
                val = 5;
                break;
            case 'X':
                val = 10;
                break;
            case 'L':
                val = 50;
                break;
            case 'C':
                val = 100;
                break;
            case 'D':
                val = 500;
                break;
            case 'M':
                val = 1000;
                break;
        }
        return val;
    }

    public int romanToInt(String s) {
        int n = s.length();
        int val1 = symbolValue(s.charAt(n - 1));
        int ans = val1;

        for (int i = n - 2; i >= 0; i--) {
            int val2 = symbolValue(s.charAt(i));
            if (val1 > val2) {
                ans -= val2;
            } else {
                ans += val2;
            }
            val1 = val2;
        }
        return ans;
    }
}
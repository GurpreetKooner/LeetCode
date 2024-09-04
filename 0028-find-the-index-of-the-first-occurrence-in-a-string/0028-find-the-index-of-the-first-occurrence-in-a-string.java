class Solution {
    public int strStr(String haystack, String needle) {
        int hl = haystack.length();
        int nl = needle.length();

        if (nl > hl) {
            return -1;
        } 
        // else if (nl == hl) {
        //     if (haystack.equals(needle)) {
        //         return 0;
        //     } else {
        //         return -1;
        //     }
        // }
         else {
            for (int i = 0; i <= hl - nl; i++) {
                String ss = haystack.substring(i, i + nl);
                if (ss.equals(needle)) {
                    return i;
                }
            }
        }
        return -1;
    }
}
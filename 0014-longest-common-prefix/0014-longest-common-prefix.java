class Solution {
    public String longestCommonPrefix(String[] strs) {

        StringBuilder prefix = new StringBuilder(strs[0]);

        for (int i = 1; i < strs.length; i++) {
            StringBuilder temp = new StringBuilder("");
            for (int j = 0; (j < strs[i].length() && j < prefix.length()); j++) {
                if (strs[i].charAt(j) == prefix.charAt(j)) {
                    temp.append(strs[i].charAt(j));
                } else {
                    break;
                }
            }
            if (temp.equals("")) {
                return "";
            } else {
                // prefix.setLength(0);
                prefix = temp;
            }
        }

        return prefix.toString();

    }
}
class Solution {
    public String reverseWords(String s) {

        String[] words = s.split(" ");
        StringBuilder ans = new StringBuilder("");

        for (int i = words.length - 1; i >= 0; i--) {
            if (!words[i].equals("") && !words.equals(" ")) {
                if (i != words.length - 1) {
                    ans.append(" ");
                }
                String tWord = words[i].trim();
                ans.append(tWord);
                
            }
        }

        return ans.toString();
    }
}
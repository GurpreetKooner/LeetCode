class Solution {
    public String reverseWords(String s) {

        String[] words = s.split(" ");
        String ans = "";

        for (int i = words.length - 1; i >= 0; i--) {
            if (!words[i].equals("") && !words.equals(" ")) {
                if (i != words.length - 1) {
                    ans += " ";
                }
                String tWord = words[i].trim();
                ans += tWord;
                
            }
        }

        return ans;
    }
}
class Solution {

    boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        int[] arr = new int[26];
        for (int i = 0; i < str1.length(); i++) {
            arr[str1.charAt(i) - 'a'] += 1;
            arr[str2.charAt(i) - 'a'] -= 1;
        }

        for (int n : arr) {
            if (n != 0) {
                return false;
            }
        }
        return true;
    }

    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> ansArr = new ArrayList<>();
        boolean[] check = new boolean[strs.length];
        

        for(int i=0; i<strs.length; i++){
            if(check[i]){
                continue;
            }
            List<String> ans = new ArrayList<>();
            String s = strs[i];
            ans.add(s);
            check[i] = true;
            for(int j=i+1; j<strs.length; j++){
                if(check[j]){
                    continue;
                }
                
                if(isAnagram(s, strs[j])){
                    check[j]=true;
                    ans.add(strs[j]);
                }
            }
            ansArr.add(ans);
        } 
        return ansArr;
    }
}
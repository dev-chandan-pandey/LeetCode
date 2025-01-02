class Solution {
    public boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public List<Integer> vowelStrings(String[] words, int[][] queries) {
        List<Integer> v = new ArrayList<>();
        for (String word : words) {
            v.add(isVowel(word.charAt(0)) && isVowel(word.charAt(word.length() - 1)) ? 1 : 0);
        }

        int[] pref = new int[v.size()];
        pref[0] = v.get(0);
        for (int i = 1; i < v.size(); i++) {
            pref[i] = pref[i - 1] + v.get(i);
        }

        List<Integer> ans = new ArrayList<>();
        for (int[] query : queries) {
            int l = query[0];
            int r = query[1];
            ans.add(l == 0 ? pref[r] : pref[r] - pref[l - 1]);
        }
        return ans;
    }
}
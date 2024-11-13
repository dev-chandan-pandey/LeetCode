class Solution {
    public boolean isMatch(final String s, final String p) {
        return dfs(s, p, 0, 0, new Boolean[s.length()][p.length()]);
    }

    private boolean dfs(final String s, final String p, final int i, final int j, final Boolean[][] cache) {
        if(i >= s.length() && j >= p.length())
            return true;

        if(j >= p.length())
            return false;

        if(i < s.length() && cache[i][j] != null)
            return cache[i][j];

        final boolean match = i < s.length() && (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.');

        if(j + 1 < p.length() && p.charAt(j + 1) == '*') {
            final boolean r = dfs(s, p, i, j + 2, cache) || (match && dfs(s, p, i + 1, j, cache));

            if(i < s.length())
                cache[i][j] = r;

            return r;
        }

        if(match) {
            cache[i][j] = dfs(s, p, i + 1, j + 1, cache);

            return cache[i][j];
        }

        if(i < s.length())
            cache[i][j] = false;

        return false;
    }    
}
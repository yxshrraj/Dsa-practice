class Solution {
    public int minDeletions(String s) {
         Integer[] v = new Integer[26];
        Arrays.fill(v, 0);
        for(char a : s.toCharArray()) {
            v[a - 'a']++;
        }
        Arrays.sort(v, Collections.reverseOrder());
        int f = v[0];
        int ans = 0;
        for(int a : v) {
            if(a > f) {
                if(f > 0) ans += (a - f);
                else ans += a;
            }
            f = Math.min(f - 1, a - 1);
        }
        return ans;
    }
}

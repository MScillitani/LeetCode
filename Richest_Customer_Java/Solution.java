class Solution {
    public int maximumWealth(int[][] accounts) {
        int b = 0;
        int r = 0;
        for (int i = 0; i<accounts.length; i++) {
            for (int j = 0; j<accounts[i].length; j++) {
                b += accounts[i][j];
                if (b > r) {
                    r = b;
                }
            }
            b = 0;
        }
        return r;
    }
}
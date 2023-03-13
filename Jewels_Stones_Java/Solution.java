class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        char[] jArray = jewels.toCharArray();
        char[] sArray = stones.toCharArray();
        int r = 0;
        for (int i = 0; i < jArray.length; i++) {
            for (int j = 0; j < sArray.length; j++) {
                if (jArray[i] == sArray[j]) {
                        r++;
                }
            }
        }
        return r;
    }
}
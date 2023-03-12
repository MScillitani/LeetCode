class Solution {
    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        int offset = nums.length % 2;
        int j = 0; // result increment
        int k = 0; // offset increment
        for (int i = 0; i < nums.length; i += n) {
            if (offset == 0 && k == 1) {
                i += 1;
                k = 0;
            }
            result[j] = nums[i];
            j++;
            if (i + n >= nums.length && result[nums.length - 1] == 0) {
                i -= nums.length;
                k = 1;
            }
        }
        return result;
    }
}

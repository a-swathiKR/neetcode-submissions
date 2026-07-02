class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int size = nums.length * 2;
        int[] ans = new int[size];

        for(int i = 0;i < nums.length;i++){
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }

        return ans;
    }
}
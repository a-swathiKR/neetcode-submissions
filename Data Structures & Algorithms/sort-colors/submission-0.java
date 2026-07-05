class Solution {
    public void sortColors(int[] nums) {
        for(int i = 1;i < nums.length;i++){
            int prev = i - 1;
            int curr = nums[i];

            while(prev >= 0 && curr < nums[prev]){
                nums[prev + 1] = nums[prev];
                prev--;
            }

            nums[prev + 1] = curr;
        }

    }
}
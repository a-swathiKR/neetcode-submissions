class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int[] preffixProduct = new int[n];
        preffixProduct[0] = 1;

        for(int i = 1;i < n;i++){
            preffixProduct[i] = preffixProduct[i - 1] * nums[i - 1];
        }

        int[] suffixProduct = new int[n];
        suffixProduct[n - 1] = 1;

        for(int i = n - 2;i >= 0;i--){
            suffixProduct[i] = suffixProduct[i + 1] * nums[i + 1];
        }


        int[] result = new int[n];
        for(int i = 0;i < preffixProduct.length;i++){
            result[i] = preffixProduct[i] * suffixProduct[i];
        }

        return result;
    }
}  

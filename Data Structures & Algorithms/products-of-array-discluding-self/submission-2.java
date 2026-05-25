class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        Arrays.fill(prefix, 1);
        int[] suffix = new int[nums.length];
        Arrays.fill(suffix, 1);

        //ex. prefix = [1, 1, 2, 8]
        for(int i = 1; i < nums.length; i++){
            prefix[i] = prefix[i-1] * nums[i-1];
        }

        //ex. suffix = [48, 24, 6, 1]
        for(int j = nums.length - 2; j >= 0; j--){
            suffix[j] = suffix[j+1] * nums[j+1];
        }

        int[] output = new int[nums.length];
        for(int o = 0; o < nums.length; o++){
            output[o] = prefix[o] * suffix[o];
        } 
        return output;
    }
}  

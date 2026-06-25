class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1, zcount = 0;

        for(int n : nums){
            if(n != 0) {
                prod *= n;
            }
            else{
                zcount ++;
            }
            
        }

        if(zcount > 1){
            return new int[nums.length];
        }

        int[] res = new int[nums.length];
        
        for(int i=0; i<nums.length; i++){
            if(zcount > 0){
                res[i] = (nums[i]==0) ? prod : 0;
            }
            else{
                res[i] = prod / nums[i];
            }
        }
        return res;
    }
}  

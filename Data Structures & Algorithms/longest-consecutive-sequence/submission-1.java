class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);

        int res=0, i=0, curr = nums[0] , streak = 0;
        while(i < nums.length){
            if(nums[i] != curr){
                curr = nums[i];
                streak=0;
            }
            while(i<nums.length && nums[i] == curr){
                i++;
            }
            streak++;
            curr++;
            res = Math.max(res, streak);
            
        }
        return res;


    }
}

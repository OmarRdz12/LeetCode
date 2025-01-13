class Solution {
    public int minPatches(int[] nums, int n) {
        long right = 0;
        int patches = 0;

        for(int num=0; num<nums.length; num++){
            while((n > right) && (nums[num] > (right + 1))){
                right += right + 1;
                patches += 1;
            }
            right += nums[num];
        }
            
        while (n > right){
            right += right + 1;
            patches += 1;
        }    
        return patches;
    }
}
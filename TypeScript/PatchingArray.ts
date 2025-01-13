function minPatches(nums: number[], n: number): number {
    let right: number = 0;
    let patches: number = 0;

    for(let num=0; num<nums.length; num++){
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
};
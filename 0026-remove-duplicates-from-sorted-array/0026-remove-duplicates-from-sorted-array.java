class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 1;
        int number = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i]!=number){
                nums[index++] = nums[i];
                number = nums[i];
            }
        }
        return index;
    }
}
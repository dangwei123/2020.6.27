给你一个未排序的整数数组，请你找出其中没有出现的最小的正整数。

class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            while(nums[i]>0&&nums[i]<=n&&nums[i]-1!=i&&nums[nums[i]-1]!=nums[i]){
                int tmp=nums[nums[i]-1];
                nums[nums[i]-1]=nums[i];
                nums[i]=tmp;
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]-1!=i) return i+1;
        }
        return n+1;
    }
}


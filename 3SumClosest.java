class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest = 0        ;
        int diff = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++){
            int j = i+1;
            int k = nums.length-1;
            while (j < k) {
                int sum = nums[i]+nums[j]+nums[k]; 
                if (sum == target) {
                    return sum;
                }
                else if (sum < target) {
                    j++;
                }
                else {
                    k--;
                }
                int value = Math.abs(target-sum);
                if (value < diff) {
                    diff = value;
                    closest = sum;
                }
            }
        }
        return closest;
    }
}
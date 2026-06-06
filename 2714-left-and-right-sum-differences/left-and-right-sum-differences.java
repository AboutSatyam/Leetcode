class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        
        // Step 1: Calculate the total sum of the array
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        
        // Step 2: Calculate leftSum and rightSum on the fly
        int leftSum = 0;
        for (int i = 0; i < n; i++) {
            // rightSum is total minus what's on the left and the current element
            int rightSum = totalSum - leftSum - nums[i];
            
            // Store the absolute difference
            answer[i] = Math.abs(leftSum - rightSum);
            
            // Update leftSum for the next element
            leftSum += nums[i];
        }
        
        return answer;
    }
}
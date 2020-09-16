// 3Sum
// Medium

// 7937

// 873

// Add to List

// Share
// Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

// Notice that the solution set must not contain duplicate triplets.

 

// Example 1:

// Input: nums = [-1,0,1,2,-1,-4]
// Output: [[-1,-1,2],[-1,0,1]]
// Example 2:

// Input: nums = []
// Output: []
// Example 3:

// Input: nums = [0]
// Output: []
 

// Constraints:

// 0 <= nums.length <= 3000
// -105 <= nums[i] <= 105
// Accepted
// 1,029,165
// Submissions
// 3,800,300
// Seen this question in a real interview before?

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        
        Arrays.sort(nums);
        for (int i = 0 ; i < nums.length-2 ; i++) {
            if (i > 0 && nums[i] == nums[i-1])
                continue;
            int j = i+1;
            int k = nums.length-1;
            while (j < k) {
                if (nums[j] + nums[k] > 0-nums[i]) {
                    k--;
                }
                else if (nums[j] + nums[k] < 0-nums[i]) {
                    j++;
                }
                else {
                    ArrayList<Integer> al = new ArrayList<Integer>();
                    al.add(nums[i]);
                    al.add(nums[j]);
                    al.add(nums[k]);
                    ans.add(al);
                    while (j < k && nums[j] == nums[j+1])
                        j++;
                    while (j < k && nums[k] == nums[k-1])
                        k--;
                    j++;
                    k--;
                }
            }
        }
        
        return ans;
    }
}
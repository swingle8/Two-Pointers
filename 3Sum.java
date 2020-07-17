//3Sum
//https://leetcode.com/problems/3sum/



class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> ans = new HashSet<List<Integer>>();
        for (int i = 0 ; i < nums.length-1 ; i ++) {
            int curr_val = nums[i];
            int start = i+1;
            int end = nums.length-1;
            while (start < end) {
                int sum = nums[start] + nums[end];
                if (sum+curr_val == 0) {
                    ArrayList<Integer> al = new ArrayList<Integer>();
                    al.add(nums[start]);
                    al.add(nums[end]);
                    al.add(nums[i]);
                    ans.add(al);
                    start++;
                }
                else if (sum+curr_val > 0)
                    end--;
                else
                    start++;
            }
        }
        ArrayList<List<Integer>> anas = new ArrayList<List<Integer>>(ans);
        return anas;
    }
}
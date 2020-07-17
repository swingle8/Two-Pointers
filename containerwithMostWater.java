//Container with most water
// https://leetcode.com/problems/container-with-most-water/


class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int l = 0;
        int r = n-1;
        int max_volume = Integer.MIN_VALUE;
        int width = n-1;
        while (l < r) {
            int vol = Math.min(height[l], height[r]) * width;
            if (vol > max_volume)
                max_volume = vol;
            
            if (height[l] > height[r])
                r--;
            else
                l++;
            
            width--;
        }
        
        return max_volume;
    }
}
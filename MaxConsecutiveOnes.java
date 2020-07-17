// https://leetcode.com/problems/max-consecutive-ones-iii/submissions/
// Max Consecutive Ones III

class Solution {
    public int longestOnes(int[] A, int K) {
        int ans = 0;
        int start = -1;
        int end = -1;
        ArrayList<Integer> index = new ArrayList<Integer>();
        int count = 0;
        
        for (int i = 0 ; i < A.length ; i++) {
            
            if (A[i] == 1) {
                end = i;
                if (start == -1)
                    start = i;
                continue;
            }
            
            if (K == count) {
                
                int sum = end-start+1;
                ans = Math.max(sum, ans);
                
                while (K == count && start != -1) {
                    if (A[start] == 1)
                        start++;
                    else {
                        count--;
                        start++;
                    }
                }
            }
            
         
            
            if (A[i] == 0 && count < K) {
                count++;
                end = i;
                if (start == -1)
                    start = i;
                continue;
            }
        }
        
        if (start == -1 && end == -1)
            return 0;
        
          int sum = end-start+1;
          ans = Math.max(sum, ans);
        
        
        return ans;
    }
}
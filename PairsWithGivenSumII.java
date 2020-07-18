Pairs with given sum II
Problem Description

Given a sorted array of integers (not necessarily distinct) A and an integer B, find and return how many pair of integers ( A[i], A[j] ) such that i != j have sum equal to B.

Since the number of such pairs can be very large, return number of such pairs modulo (109 + 7).



Problem Constraints
1 <= |A| <= 100000

1 <= A[i] <= 10^9

1 <= B <= 10^9



Input Format
The first argument given is the integer array A.

The second argument given is integer B.



Output Format
Return the number of pairs for which sum is equal to B modulo (10^9+7).



Example Input
Input 1:

A = [1, 1, 1]
B = 2
Input 2:

 
A = [1, 1]
B = 2


Example Output
Output 1:

 3
Output 2:

 1


Example Explanation
Explanation 1:

 Any two pairs sum up to 2.
Explanation 2:

 only pair (1, 2) sums up to 2.




{
    public int solve(int[] A, int B) {
        //int start = 0;
        int n = A.length-1;
        int ans = 0;
       int end = n;
        for (int i = 0 ; i < n ; i  ++) {
            int curr = A[i];
            //int end = n;
            int previousIndex = -1;
            while (end > i) {
                if ((curr + A[end]) == B)
                    ans++;
                
                else if ((curr + A[end]) < B) {
                     if (previousIndex != -1)
                        end = previousIndex;
                     break;
                 }
                
                if (previousIndex == -1) 
                    previousIndex = end;
                
                else if (A[previousIndex] != A[end])
                    previousIndex = end;

                end--;
            }
            
            if (previousIndex != -1 && A[previousIndex] == A[end])
               end = previousIndex;
        }
        
        return ans;
    }
}
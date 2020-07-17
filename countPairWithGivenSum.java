import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	    Scanner sc = new Scanner(System.in);
	    int cases = sc.nextInt();
	    
	    while (cases-- > 0) {
	        int n = sc.nextInt();
	        int k = sc.nextInt();
	        int [] arr = new int[n];
	        for (int i = 0 ; i < n ; i ++) {
	            arr[i] = sc.nextInt();
	        }
	        getCount(arr, k, n);
	    }
	 }
	 
	 public static void getCount (int [] arr, int k, int n) {
	     
	        int ans = 0;
	        for (int j = 0 ; j < n-1 ; j++ ) {
	        int start = j;
	        int end = start+1;
	        
	        while (end < n) {
	            int sum = arr[start] + arr[end];
	            if (sum == k) {
	                ans++;
	            }
	           
	               end++;
	            
	        }
	        }
	        
	        System.out.println(ans);
	 }
}
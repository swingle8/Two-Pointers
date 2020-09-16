// Given an unsorted array Arr[] and a number N. You need to write a program to find if there exists a pair of elements in the array whose difference is N.

// Input:
// First line of input contains an integer T which denotes the number of test cases. Then T test cases follows. First line of each test case contains two space separated integers L and N where L denotes the length of array or the number of elements in the array and N denotes the difference between two elements. Second line of each test case contains L space separated integers which denotes the elements of the array.

// Output:
// For each test case, in a new line print 1 if the pair is found otherwise print -1 if there does not exist any such pair.

// Constraints:
// 1<=T<=100
// 1<=L<=104
// 1<=Arr[i]<=105

// Example:
// Input:
// 2
// 6 78
// 5 20 3 2 5 80
// 5 45
// 90 70 20 80 50
// Output:
// 1
// -1

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
	     int arr[] = new int[n];
	     int k = sc.nextInt();
	     //System.out.println("Hello");
	     for (int i = 0 ; i < n ; i++) {
	         arr[i] = sc.nextInt();
	     }
	     
	     
	     diff(arr, k);
	 }
	 }
	 
	 public static void diff (int [] arr, int k) {
        // naive approach O(n^2)
	   //  for (int i = 0 ; i < arr.length-1 ; i++) {
	   //      int curr = arr[i];
	   //      for (int j = i+1 ; j < arr.length ; j++) {
	   //          int diff = arr[i] - arr[j];
	   //          if (diff < 0)
	   //             diff = diff * -1;
	   //          if (diff == k) {
	   //             System.out.println(1);
	   //             return;
	   //          }
	   //      }
	   //  }
	   
	   Arrays.sort(arr);
	   int i = 0;
	   int j = 1;
	   int n = arr.length;
	   
	   while (i < arr.length-1 && j < arr.length) {
	       if (arr[j] - arr[i] < k)
	           j++;
	       else if (arr[j] - arr[i] > k)
	            i++;
	       else {
	           System.out.println(1);
	           return;
	       }
	            
	   }
	   System.out.println(-1);
	 }
}
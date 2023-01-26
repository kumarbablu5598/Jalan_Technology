 /*Write a program that takes as input an array of positive and negative numbers 
 (0 excluded).The objective is to return those items from the array whose sum is 0. 
 If no such items exist return “No Elements found” Example: For an input array 
 [-4, 1, 3, -2, -1],one of the possible results would be 3, -2, -1 since their sum is 0.*/
import java.io.*;
import java.util.*;
class Solution {
    
	public static void main (String[] args) {
	    
	Scanner sc = new Scanner(System.in);
	int n= sc.nextInt();
	int arr[] = new int[n];

	for(int i=0;i<n;i++)
	arr[i]=sc.nextInt();
	
  Map<Integer, Integer> map = new HashMap<Integer, Integer>();
  int presum[]=new int[n];
  
  presum[0]=arr[0];
  for(int i=1;i<n;i++)
  {
      presum[i]=presum[i-1]+arr[i];
  }
 
	// left & right index of result subarray 
	int left=0,right=0;
  for(int i=0;i<n;i++)
  {  
       
      if(presum[i]==0){
          right=i;
          break;
      }
      else if(map.containsKey(presum[i])){
          left=map.get(presum[i])+1;
          right=i;
          break;
      }
      else{
          map.put(presum[i],i);
      }
  }
  
  if(left==0 && right==0)  
     System.out.println("No Elements found");
  else {
          int result[]= new int[right-left+1];
           int p=0;
          for(int i=left;i<=right;i++)
          {
             result[p++]=arr[i];
          }

        for(int el:result)   
           System.out.print(el+" ");

       }
  }

}

//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args)throws IOException{
		
		//taking input using BufferedReader class
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//taking total count of testcases
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    //Reading the two Strings
		    String s1 = br.readLine();
		    String s2 = br.readLine();
		    
		    //Creating an object of class Rotate
		    Solution obj = new Solution();
		    
		    //calling areRotations method 
		    //of class Rotate and printing
		    //"1" if it returns true
		    //else "0"
		    if(obj.areRotations(s1,s2))
		    {
		        System.out.println("1");
		    }
		    else
		    {
		        System.out.println("0");
		    }
		}
	}
}
// } Driver Code Ends



class Solution
{
    //Function to check if two strings are rotations of each other or not.
    public static boolean areRotations(String p, String q )
    {
        return ((p.length()==q.length()) && (p+p).contains(q));
    }
    
}
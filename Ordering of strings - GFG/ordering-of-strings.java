//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    String s[] = new String[n];
                    for(int i = 0;i<n;i++){
                        s[i] = sc.next();
                    }
                    
                    Solution ob = new Solution();
                    String ans[] = ob.orderString(s, n);
                    System.out.println(ans[0] + " " + ans[1]);
                }
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    String[] orderString(String s[], int n){
        String max="";
        String min=s[0];
        for(int i=0;i<s.length;i++){
           if(s[i].compareTo(max)>0)
           max=s[i];
           if(s[i].compareTo(min)<0){
               min=s[i];
           }
        }
         String k[]={min, max};
        return k;
        
    }
}
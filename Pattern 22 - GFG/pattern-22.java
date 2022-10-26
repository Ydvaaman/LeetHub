//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            obj.printSquare(n);
        }
    }
}
// } Driver Code Ends


class Solution {

    void printSquare(int n) {
       for(int i =n;i>0;i--)
     {
         for(int j=n;j>0;j--){

             if(j>i)System.out.print(j+" ");

             else System.out.print(i+" ");

         }

         int j=i;

         for(int k=2;k<=n;k++){
                         if(j>k)System.out.print(j+" ");

             else System.out.print(k+" ");
         }

         System.out.println(" ");
     }

     for(int i = 2;i<=n;i++)

     {
         for(int j=n;j>0;j--){

             if(j>i)System.out.print(j+" ") ;

             else System.out.print(i+" ");

         }

         int j=i;

         for(int k=2;k<=n;k++){

             if(j>k) System.out.print(j+" ");

             

             else System.out.print(k+" ");

         }

         System.out.println(" ");

     }

 }
    }

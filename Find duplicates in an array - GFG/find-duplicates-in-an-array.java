//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.Map.Entry;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            Solution g = new Solution();
            ArrayList<Integer> ans = g.duplicates(a, n);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends



class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        
        ArrayList<Integer> a=new ArrayList<>();
        Arrays.sort(arr);
        for(int i=1;i<n;i++){
            if( a.size() != 0) {
                if(arr[i]==arr[i-1] && a.get(a.size()-1)!=arr[i]){
                    a.add(arr[i]);
                }
            } else if(arr[i]==arr[i-1]) {
                a.add(arr[i]);
            }
            
        }
        if(a.size()==0) {
            a.add(-1);
        }
        
        return a;
  
    }
}

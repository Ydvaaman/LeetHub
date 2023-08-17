class Solution {
    long mod = 1000000007;
    public int countGoodNumbers(long n) {
        // Calculate the number of even and odd positions in the digit string
        long odd = n/2;
        long even = (n+1)/2;
        
        // Calculate the total number of good digit strings
        // multiplying 5 by even because there could only be 5 even numbers between 0-9
        // multiplying 4 by odd because there could only be 4 prime numbers between 0-9
        return (int)(pow(5,even) * pow(4,odd) % mod);
    }
    
    public long pow(long x, long n){
        
        //base case for the recursion
        if(n==0) return 1;
        
        //computing power for pow(x,n/2) -> divide & conquer step
        long temp = pow(x,n/2);
        
        if(n%2==0) return (temp*temp)%mod; //using that result of subproblem (2 power 2 = 2 power 1 * 2 power 1)
        
        else return (x*temp*temp)%mod;//using that result of subproblem (2 power 3 = 2 power 1 * 2 power 1 * 2)
        
		// if n is odd, x power n = x power n/2 * x power n/2 * x
        //if n is even, x power n = x power n/2 * x power n/2
        
    }
}
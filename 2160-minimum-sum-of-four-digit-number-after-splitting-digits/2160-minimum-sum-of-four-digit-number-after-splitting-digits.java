class Solution {
    public int minimumSum(int num) {
        int[] arr = new int[4];
        int i = 0;
        while(num>0){
            int a = num%10;
            num=num/10;
            arr[i++]=a;
        }
        Arrays.sort(arr);
        
        int v1 = arr[0]*10 + arr[2];
        int v2 = arr[1]*10 + arr[3];
        
        return v1+v2;

    }
}
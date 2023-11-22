class Solution {
    public int differenceOfSums(int n, int m) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%m != 0){
                list.add(i);
            }else{
                list2.add(i);
            }
        }
        int sum =0 ;
        for(int i=0;i<list.size();i++){
            sum+=list.get(i);
        }
        int sum2 =0;
        for(int i=0;i<list2.size();i++){
            sum2+=list2.get(i);
        }
        int res = sum - sum2;
        return res;
        
    }
}
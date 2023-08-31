class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        // System.out.println(map);
        // for(int i=0;i<nums.length;i++){
        //     if(map.get(nums[i])==2){
        //         list.add(nums[i]);
        //     }
        // }
        for(int key:map.keySet()){
            if(map.get(key)==2){
                list.add(key);
            }
        }
        return list;
        
    }
}

// 2 2 3 3
class Solution {

    public String kthDistinct(String[] arr, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i])==1){
                count++;
            }
            if(count == k){
            return arr[i];
        }
        }
        return "";
    }
}

// another way:
// class Solution {

//     public String kthDistinct(String[] arr, int k) {
//         HashMap<String, Integer> map = new HashMap<>();
//         for (int i = 0; i < arr.length; i++) {
//             map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
//         }
//         ArrayList<String> list = new ArrayList<>();
//         for (String str : arr) {
//             if (map.get(str) == 1) {
//                 list.add(str);
//             }
//         }
//         if(list.size()<k){
//             return "";
//         }
//         return list.get(k-1);
//     }
// }

class Solution {

    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int n : map.keySet()) {
            if (n == map.get(n)) {
                list.add(n);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        if(max!=Integer.MIN_VALUE){
            return max;
        }else
        return -1;
    }
}

class Solution {

    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        Collections.sort(
            list,
            (a, b) -> {
                if (map.get(a) == map.get(b)) {
                    return b - a;
                }
                return map.get(a) - map.get(b);
            }
        );
        int res[] = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}

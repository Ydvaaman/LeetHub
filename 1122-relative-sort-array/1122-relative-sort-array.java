class Solution {

    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] ans = new int[arr1.length];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int idx = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (map.containsKey(arr2[i])) {
                int size = map.get(arr2[i]);
                while (size > 0) {
                    ans[idx] = arr2[i];
                    idx++;
                    size--;
                }
            }
            map.remove(arr2[i]);
        }
        ArrayList<Integer> rem = new ArrayList<>(map.keySet());
        Collections.sort(rem);
        for (int n : rem) {
            if (map.containsKey(n)) {
                int size = map.get(n);
                while (size > 0) {
                    ans[idx] = n;
                    idx++;
                    size--;
                }
            }
        }

        return ans;
    }
}

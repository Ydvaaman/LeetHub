class Solution {

    public int minSteps(String s, String t) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (char i : s.toCharArray()) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int count = 0;
        for (char i : t.toCharArray()) {
            if (map.containsKey(i) && map.get(i) > 0) {
                map.put(i, map.get(i) - 1);
            } else {
                count++;
            }
        }
        return count;
    }
}

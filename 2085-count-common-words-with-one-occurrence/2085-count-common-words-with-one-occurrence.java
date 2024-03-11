class Solution {

    public int countWords(String[] words1, String[] words2) {
        String[] ans = new String[words1.length + words2.length];
        int idx = 0;
        for (String s1 : words1) {
            ans[idx] = s1;
            idx++;
        }
        for (String s2 : words2) {
            ans[idx] = s2;
            idx++;
        }
        HashMap<String, Integer> map = new HashMap<>();
        for (String str : ans) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        int count = 0;
System.out.println(map);
        for (String st : map.keySet()) {
            if (map.get(st) == 2 && Arrays.asList(words1).contains(st) && Arrays.asList(words2).contains(st)) {
                count++;
            }
        }
        return count;
    }
}

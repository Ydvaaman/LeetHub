class Solution {

    public boolean digitCount(String num) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (char ch : num.toCharArray()) {
            map.put(Character.getNumericValue(ch), map.getOrDefault(Character.getNumericValue(ch), 0) + 1);
        }
        for (int i = 0; i < num.length(); i++) {
            if (map.get(i) != null && map.get(i) != Character.getNumericValue(num.charAt(i))) {
                return false;
            } else if (map.get(i) == null && Character.getNumericValue(num.charAt(i)) != 0) {
                return false;
            }
        }
        return true;
    }
}

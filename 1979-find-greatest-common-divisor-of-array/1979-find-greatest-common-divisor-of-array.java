class Solution {

    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[nums.length - 1];
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        int i = 1;
        while (i <= min) {
            if (min % i == 0) {
                list1.add(i);
            }
            i++;
        }
        int j = 1;
        while (j <= max) {
            if (max % j == 0) {
                list2.add(j);
            }
            j++;
        }
        list1.retainAll(list2);
        int maxi = Integer.MIN_VALUE;
        for (int k = 0; k < list1.size(); k++) {
            if (list1.get(k) > maxi) {
                maxi = list1.get(k);
            }
        }
        return maxi;
    }
}

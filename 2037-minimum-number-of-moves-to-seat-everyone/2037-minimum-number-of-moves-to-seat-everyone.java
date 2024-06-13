class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int steps = 0;
        for(int i=0;i<seats.length;i++){
            steps += Math.abs(seats[i]-students[i]);
        }
        return steps;
    }
}
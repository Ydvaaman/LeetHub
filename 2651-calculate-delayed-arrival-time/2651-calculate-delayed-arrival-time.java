class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int arrival = 0;
        arrival = arrivalTime + delayedTime;
        if(arrival>=24){
            arrival = arrival%24;
        }
        return arrival;
    }
}
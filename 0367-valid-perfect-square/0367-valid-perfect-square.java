class Solution {
    public boolean isPerfectSquare(int num) {
        double a  = Math.sqrt(num);
        return a == (int)a;
    }
}
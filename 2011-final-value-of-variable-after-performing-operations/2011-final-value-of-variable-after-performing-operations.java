class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        //System.out.println(operations.length());
        for(int i=0;i<operations.length;i++){
        if(operations[i].equals("++X") || operations[i].equals("X++")) x=x+1;
    else if(operations[i].equals("--X") || operations[i].equals("X--")) x=x-1;
        }
        return x;
    }
}
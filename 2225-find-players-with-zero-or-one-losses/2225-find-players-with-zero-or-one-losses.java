class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        Set<Integer> win = new HashSet<>();
        Set<Integer> lose = new HashSet<>();
        
        HashMap<Integer,Integer> loseCount = new HashMap<>();
        
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> winList = new ArrayList<>();
        List<Integer> loseList = new ArrayList<>();
        
        for(int[] arr: matches){
            int winner = arr[0];
            int loser = arr[1];
            
            win.add(winner);
            lose.add(loser);
            loseCount.put(loser,loseCount.getOrDefault(loser,0)+1);
        }
        
        for(int i : win){
            if(!lose.contains(i)) winList.add(i);
        }
        for(int i : lose){
            if(loseCount.containsKey(i) && loseCount.get(i)==1){
                loseList.add(i);
            }
        }
        Collections.sort(winList);
        Collections.sort(loseList);
        list.add(winList);
        list.add(loseList);
        
        return list;
        
    }
}
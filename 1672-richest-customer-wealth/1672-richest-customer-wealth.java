class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxwealth=0;
        for(int[] i : accounts){
            int sum=0;
            for(int j : i){
                sum+= j;
            }
            if(sum>maxwealth)
                maxwealth=sum;
        }
        return maxwealth;
    }
}
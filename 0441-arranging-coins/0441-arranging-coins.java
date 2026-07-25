class Solution {
    public int arrangeCoins(int n) {
        int rows = 0;
        long coins = n;

        while (coins >= rows + 1) {
            rows++;
            coins -= rows;
        }

        return rows;
    }
}
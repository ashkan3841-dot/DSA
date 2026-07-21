class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int n = s.length();

        int totalOnes = 0;
        int previousZeroGroup = Integer.MIN_VALUE;
        int maxMerge = 0;

        int i = 0;

        while (i < n) {
            int j = i;

            while (j < n && s.charAt(j) == s.charAt(i)) {
                j++;
            }

            int length = j - i;

            if (s.charAt(i) == '1') {
                totalOnes += length;
            } else {
                maxMerge = Math.max(maxMerge, previousZeroGroup + length);
                previousZeroGroup = length;
            }

            i = j;
        }

        return totalOnes + maxMerge;
    }
}
class Solution {
    public int countBinarySubstrings(String s) {

        int previousGroup = 0;
        int currentGroup = 1;
        int answer = 0;

        for (int i = 1; i < s.length(); i++) {

            if (s.charAt(i) == s.charAt(i - 1)) {
                currentGroup++;
            } else {
                answer += Math.min(previousGroup, currentGroup);
                previousGroup = currentGroup;
                currentGroup = 1;
            }
        }

        answer += Math.min(previousGroup, currentGroup);

        return answer;
    }
}
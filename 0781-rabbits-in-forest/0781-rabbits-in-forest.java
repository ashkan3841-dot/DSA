class Solution {
    public int numRabbits(int[] answers) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int rabbits = 0;

        for (int answer : answers) {
            if (!map.containsKey(answer) || map.get(answer) == 0) {
                rabbits += answer + 1;
                map.put(answer, answer);
            } else {
                map.put(answer, map.get(answer) - 1);
            }
        }

        return rabbits;
    }
}  
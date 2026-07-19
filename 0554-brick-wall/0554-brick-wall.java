import java.util.*;

class Solution {
    public int leastBricks(List<List<Integer>> wall) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (List<Integer> row : wall) {
            int position = 0;
            for (int i = 0; i < row.size() - 1; i++) {
                position += row.get(i);
                map.put(position, map.getOrDefault(position, 0) + 1);
            }
        }
        int maxEdges = 0;
        for (int count : map.values()) {
            maxEdges = Math.max(maxEdges, count);
        }

        return wall.size() - maxEdges;
    }
}
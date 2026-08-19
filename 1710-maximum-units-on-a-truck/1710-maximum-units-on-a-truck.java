import java.util.Arrays;

class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
        
        int totalUnits = 0;
        
        for (int[] box : boxTypes) {
            int numBoxes = box[0];
            int unitsPerBox = box[1];
            
            if (truckSize >= numBoxes) {
                totalUnits += numBoxes * unitsPerBox;
                truckSize -= numBoxes;
            } else {
                totalUnits += truckSize * unitsPerBox;
                break;
            }
        }
        
        return totalUnits;
    }
}
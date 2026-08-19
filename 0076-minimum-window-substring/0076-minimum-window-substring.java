class Solution {
    public String minWindow(String s, String t) {
        
        if (s == null || t == null || s.length() < t.length()) {
            return "";
        }
        int[] mapT = new int[128];
        for (char c : t.toCharArray()) {
            mapT[c]++; 
        }

        int left = 0, right = 0;
        int minLen = Integer.MAX_VALUE;
        int startIdx = 0; 
        int requiredCount = t.length(); 
        while (right < s.length()) {
            char rightChar = s.charAt(right);

            if (mapT[rightChar] > 0) {
                requiredCount--;
            }
            
            mapT[rightChar]--;
            right++;

            while (requiredCount == 0) {
 
                if (right - left < minLen) {
                    minLen = right - left;
                    startIdx = left;
                }

                char leftChar = s.charAt(left);
                mapT[leftChar]++; 
                if (mapT[leftChar] > 0) {
                    requiredCount++; 
                }
                
                left++; 
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(startIdx, startIdx + minLen);
    }
}
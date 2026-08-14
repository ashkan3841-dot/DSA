class Solution {
    public int trap(int[] height) {
        int i=0;
        int j=height.length-1;
        int imax=0;
        int jmax=0;
        int c=0;

        while(i<j){
            if(height[i]<height[j]){
                if(height[i]>imax){
                    imax=height[i];

                }else{
                    c+= imax-height[i];
                }
                i++;     
            }else{
                if(height[j]>=jmax){
                    jmax=height[j];
                }
                else{
                    c+= jmax-height[j];

                }
                j--;
            }
        }
        return c;



        
    }
}
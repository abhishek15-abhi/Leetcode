class Solution {
   
    public int trap(int[] height) {
        int n=height.length;
         int trapwater=0;
        int leftmax[]=new int[height.length];
        int rightmax[]= new int[height.length];
        leftmax[0]=height[0];
       
        for(int i=1;i<n;i++)
            leftmax[i]=Math.max(leftmax[i-1],height[i]);
       
        rightmax[n-1]=height[n-1];
        for(int j=n-2;j>=0;j--)
            rightmax[j]=Math.max(rightmax[j+1],height[j]);

        for(int k=0;k<n;k++){
            int waterlevel=Math.min(leftmax[k],rightmax[k]);
            trapwater+=waterlevel-height[k];
            
        }
        return trapwater;
    }

}
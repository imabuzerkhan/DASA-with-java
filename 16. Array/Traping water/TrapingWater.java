public class TrapingWater {
  public static int TrapingRainWater(int height[]){
    int n = height.length ;
    // * left max boundary using auxilary verb
    int leftmax[] = new int[n] ;
    leftmax[0] = height[0];
    for(int i=1; i<n; i++){
      leftmax[i] = Math.max(height[i], leftmax[i-1] ) ;
    }
    //* */ calculate right max boundary using auxilary verb
    int rightmax[] = new int[n];
    rightmax[n-1] = height[n-1] ;
    for(int i=n-2; i>=0; i--){
      rightmax[i] = Math.max(height[i], rightmax[i+1]);
    }
    // trapped water
    int trapedwater = 0;
    // loop
    for(int i=0; i<n; i++){
      int waterlevel = Math.min(leftmax[i], rightmax[i]) ;
      trapedwater += waterlevel - height[i] ; 
    }
    return trapedwater ;
    
  }
  public static void main (String args[]){
    int height[] = {4,2,0,6,3,2,5};
    System.out.println(TrapingRainWater(height));
  }
}

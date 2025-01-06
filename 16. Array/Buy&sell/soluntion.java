

public class soluntion {
  public static int Buy(int prices[]){
    int n = prices.length ;
    int BuyingPrices = Integer.MAX_VALUE;
    int maxProfit = 0;
    for(int i=0; i<n; i++){
     if(BuyingPrices<prices[i]){
      int profit = prices[i] - BuyingPrices ;
      maxProfit = Math.max(maxProfit, profit);
      System.out.println("the maxium profit is " + maxProfit);
     }else{
      BuyingPrices = prices[i];
   
     }
    }
    return maxProfit ;
  }
  public static void main(String[] args) {
    int prices[] = {7,10,12,23,45,34} ;
    System.out.println(Buy(prices));
  }
}

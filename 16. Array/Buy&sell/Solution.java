public class Solution {
  public static int Buy(int prices[]) {
    int n = prices.length;
    int minBuyingPrice = Integer.MAX_VALUE;
    int maxProfit = 0;
    
    for(int i = 0; i < n; i++) {
      if(prices[i] > minBuyingPrice) {
        int profit = prices[i] - minBuyingPrice;
        maxProfit = Math.max(maxProfit, profit);
        System.out.println("The maximum profit so far is " + maxProfit);  // Optional: Remove if not needed
      } else {
        minBuyingPrice = prices[i];  // Update minimum buying price
      }
    }
    return maxProfit;
  }
  
  public static void main(String[] args) {
    int prices[] = {7, 1, 5, 6, 2};
    System.out.println("The maximum profit is: " + Buy(prices));
  }
}

/**
 * 
 */
package easy;

/**
 * @author hoang
 *
 */
public class BestTimeBuySellStock {

  /**
   * @param args
   */
  public static void main(String[] args) {
    System.out.println(maxProfit(new int[] {7,1,5,3,6,4}));
  }
  
  public static int maxProfit(int[] prices) {
    int oldProfit = 0;
    int lowValue = prices[0];
    for (int price : prices) {
      if (price < lowValue) {
        lowValue = price;
        continue;
      }
      if (price - lowValue > oldProfit) {
        oldProfit = price - lowValue;
      }
    }
    return oldProfit;
  }

}

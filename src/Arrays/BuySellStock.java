package Arrays;

import java.util.Scanner;

public class BuySellStock {

    public int maxProfit(int[] prices) {
        int currentDay=prices[0];
        int max_profit=0;

        for(int i=1;i<prices.length;i++){
            max_profit=Math.max(max_profit,prices[i]-currentDay);
            currentDay=Math.min(currentDay,prices[i]);
        }
        return max_profit;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BuySellStock obj=new BuySellStock();
        int n=sc.nextInt();
        int[] prices=new int[n];
        for(int i=0;i<n;i++){
            prices[i]=sc.nextInt();
        }
        int max_profit=obj.maxProfit(prices);
        System.out.println(max_profit);
    }
}

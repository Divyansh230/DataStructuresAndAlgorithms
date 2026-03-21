package Dynamic_Programming;
import java.util.*;
public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int dp[][]=new int[n+1][amount+1];

        Arrays.fill(dp[0],Integer.MAX_VALUE-1);
        for(int i=1;i<=n;i++){
            dp[i][0]=0;
        }
        for(int i=1;i<=amount;i++){
            if(i%coins[0]==0)dp[1][i]=i/coins[0];
            else dp[1][i]=Integer.MAX_VALUE-1;
        }

        for(int i=2;i<=n;i++){
            for(int j=1;j<=amount;j++){
                if(coins[i-1]<=j){
                    dp[i][j]=Math.min(1+dp[i][j-coins[i-1]],dp[i-1][j]);
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return (dp[n][amount]!=Integer.MAX_VALUE-1)?dp[n][amount]:-1;
    }

    public static void main(String args[]){
        CoinChange obj=new CoinChange();
        System.out.println(obj.coinChange(new int[]{1,2,3},2));
    }
}

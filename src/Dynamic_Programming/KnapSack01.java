package Dynamic_Programming;

public class KnapSack01 {
    public int knapsack(int W, int val[], int wt[]) {
        // code here
        int n = wt.length;
        int dp[][] = new int[n + 1][W + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= W; j++) {
                if (wt[i - 1] <= j) {
                    dp[i][j] = Math.max(val[i - 1] + dp[i - 1][j - wt[i - 1]], dp[i - 1][j]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][W];
    }

    public static void main(String[] args) {
        KnapSack01 obj = new KnapSack01();
        int W = 8;
        int val[]={1, 2, 3};
        int wt[]={4, 5, 1};
        System.out.println(obj.knapsack(W,val,wt));
    }
}
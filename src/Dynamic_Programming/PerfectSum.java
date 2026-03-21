package Dynamic_Programming;

public class PerfectSum {
    public int perfectSum(int[] arr, int sum) {
        // code here
        int dp[][]=new int[arr.length+1][sum+1];
        dp[0][0]=1;

        for(int i=1;i<=arr.length;i++){
            for(int j=0;j<=sum;j++){
                if(arr[i-1]<=j){
                    dp[i][j]=dp[i-1][j-arr[i-1]]+dp[i-1][j];
                }
                else dp[i][j]=dp[i-1][j];
            }
        }
        return dp[arr.length][sum];
    }

    public static void main(String[] args) {
        PerfectSum p=new PerfectSum();
        System.out.println(p.perfectSum(new int[]{1,2,3,4}, 5));
    }



}

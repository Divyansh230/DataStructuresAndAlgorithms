package Dynamic_Programming;

public class RodCuttingProblem {
    public int cutRod(int price[]){

        int n=price.length;
        int dp[][]=new int[n+1][n+1];

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i<=j){
                    dp[i][j]=Math.max(price[i-1]+dp[i][j-i],dp[i-1][j]);
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][n];
    }

    public static void main(String[] args) {
        RodCuttingProblem obj=new RodCuttingProblem();
        System.out.println(obj.cutRod(new int[]{1,2,3,4,5}));
    }
}

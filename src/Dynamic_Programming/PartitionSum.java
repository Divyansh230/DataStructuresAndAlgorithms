package Dynamic_Programming;

public class PartitionSum {
    public boolean partitionSum(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        if(sum%2!=0)return false;

        int k=sum/2;
        boolean[][] dp=new boolean[n][k+1];
        for(int i=0;i<n;i++){
            dp[i][0]=true;
        }
        if(nums[0]<=k)dp[0][nums[0]]=true;
        for(int i=1;i<n;i++){
            for(int j=1;j<=k;j++){
                boolean take=(nums[i]<=j)?dp[i-1][j-nums[i]]:false;
                boolean ntake=dp[i-1][j];
                dp[i-1][j]=take||ntake;
            }
        }
        return dp[n-1][k];
    }

    public static void main(String[] args) {
        PartitionSum p=new PartitionSum();
        System.out.println(p.partitionSum(new int[]{1,2,3,4}));
    }
}

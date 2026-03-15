package Searching;

public class SquareRoot {
    public int squareRoot(int x){
        if(x==0)return x;
        int start=1,end=x;
        int ans=start;
        while(start<=end){
            int mid=start+(end-start)/2;
            long square=(long)mid*mid;

            if(square==x)return mid;
            else if(square<x){
                ans=mid;
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        SquareRoot sr = new SquareRoot();
        System.out.println(sr.squareRoot(100));
    }
}

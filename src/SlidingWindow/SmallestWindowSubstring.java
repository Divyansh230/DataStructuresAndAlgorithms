package SlidingWindow;

public class SmallestWindowSubstring {
    public String minWindow(String s, String t) {
        int n=s.length(),total=t.length();
        if(n<total)return "";

        int m[]=new int[256];
        char A[]=s.toCharArray();
        char B[]=t.toCharArray();

        for(int i=0;i<B.length;i++){
            m[B[i]]++;
        }
        int start=0,end=0,index=-1,ans=Integer.MAX_VALUE;
        while(end<n){
            m[A[end]]--;
            if(m[A[end]]>=0)total--;

            while(total==0 && start<=end){
                if(ans>end-start+1){
                    ans=end-start+1;
                    index=start;
                }
                m[A[start]]++;
                if(m[A[start]]>0)total++;
                start++;
            }
            end++;
        }
        if(index==-1)return "";
        String str="";
        for(int i=index;i<index+ans;i++){
            str+=A[i];
        }
        return str;
    }

    public static void main(String args[]){
        SmallestWindowSubstring s=new SmallestWindowSubstring();
        System.out.println(s.minWindow("abcd", "efg"));
    }
}

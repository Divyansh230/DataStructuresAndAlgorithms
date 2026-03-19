package SlidingWindow;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

public class SmallestDistinctWindow {
    public int findSubString(String str) {
        // code here
        Set<Character> set=new HashSet<>();
        for(int i=0;i<str.length();i++){
            set.add(str.charAt(i));
        }
        Map<Character,Integer> map=new HashMap<>();
        int l=0,r=0,len=Integer.MAX_VALUE;
        while(r<str.length()){


            //1.Check weather all element has been seen aur not
            while(set.size()>0 && r<str.length()){
                char c=str.charAt(r);
                if(set.contains(c)){
                    set.remove(c);
                }
                map.put(c,map.getOrDefault(c,0)+1);
                r++;
            }

            len=Math.min(len,r-l);

            //1.Shriking face of Window till set got a element
            while(set.size()!=1){
                len=Math.min(len,r-l);
                char c=str.charAt(l);
                map.put(c,map.getOrDefault(c,0)-1);
                if(map.get(c)==0){
                    set.add(c);
                }
                l++;
            }
        }
        return len;
    }

    public static void main(String[] args) {
        SmallestDistinctWindow s=new SmallestDistinctWindow();
        System.out.println(s.findSubString("abcd"));
    }
}

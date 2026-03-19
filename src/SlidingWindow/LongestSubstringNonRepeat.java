package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringNonRepeat {
    public static void main(String[] args){
        String s="abcabcbb";
        LongestSubstringNonRepeat l=new LongestSubstringNonRepeat();
        System.out.println(l.longestSubstringNonRepeating(s));
    }

    public int longestSubstringNonRepeating(String s){
        int n=s.length();
        Map<Character,Integer> map=new HashMap<>();

        int start=0,end=0,max_len=0;
        while(end<n){
            if(map.containsKey(s.charAt(end)) && map.get(s.charAt(end))>=start){
                start=map.get(s.charAt(end))+1;
            }
            map.put(s.charAt(end),end);
            max_len=Math.max(max_len,end-start+1);
            end++;
        }
        return max_len;
    }
}

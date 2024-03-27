package LeetCode;

/**
 * @Author: Chenxy
 * @Date: 20/3/2024  下午8:36
 * @Version 1.0
 */
public class Leetcide3 {

    /**
     3. 无重复字符的最长子串
     给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串的长度
     */
    public static void main(String[] args) {
        String s="abcabcbb";
        Solution solution=new Solution();

        System.out.println(solution.lengthOfLongestSubstring(s));

    }
}
class Solution {
    public int lengthOfLongestSubstring(String s) {
        boolean flag=true;
        if (s.length()==0){

            return  0;
        }
        int maxlength=1;
        for (int i=0;i<s.length();i++){
            StringBuilder ns= new StringBuilder(s.substring(i, i + 1));
            for (int j=i+1;j<s.length();j++){
                ns.append(s.charAt(j));
                if(ns.toString().contains(s.substring(j, j + 1))){
                    if (maxlength<= ns.length()-1){
                        maxlength= ns.length()-1;
                        flag=false;
                        break;
                    }
                }
            }
            if (maxlength<= ns.length()&&flag){
                maxlength= ns.length();
            }
        }
        return  maxlength;
    }
}

package com.dfzt.javalib;

public class LongestCommonPrefix {

    public static void main(String[] args) {

    }

    public String longestCommonPrefix(String[] strs) {

        if (strs==null||strs.length==0){
            return "";
        }

        if(strs.length==1){
            return strs[0];
        }

        String target = strs[0];
       int length = target.length();

       for(int i=1;i<length;i++){
           target = strs[0].substring(0,i);
            for (String s : strs) {
                if(!s.substring(0,i).equals(target)){
                    return strs[0].substring(0,i-1);
                }
            }

        }
       return "";
    }
}

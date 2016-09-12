package com.zdxb.utils;

/**
 * Created by hp on 2016/8/2.
 */
public class StringSplit {
    public String spli(String a){
        if (a==null){
            return "";
        }
        String[] sourceStrArray = a.split(" ");
        return sourceStrArray[0]==null?a:sourceStrArray[0];
    }
}

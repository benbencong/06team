package com.benben;

import java.io.*;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.spi.LocaleNameProvider;

public class demo
{
    //请利用Stack把一个给定的整数转换为十六进制：
    public static void main(String[] args) {
        String hex = toHex(12500);
        if (hex.equalsIgnoreCase("30D4")) {
            System.out.println("测试通过");
        } else {
            System.out.println("测试失败");
        }
    }


    static String toHex(int n) {
        List<String> l=List.of("0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F");
        Stack<String> s=new Stack<>();
        while (n/16!=0){
            Integer i=n%16;
            System.out.println("yushu"+i);
            System.out.println(l.get(i));
            s.push(l.get(n%16));
            n=n/16;
            System.out.println(n);
        }
        s.push(l.get(n%16));
        System.out.println(s);
        String st="";
        while(s.size()!=0){
            st+=s.pop();
        }
        System.out.println(st);
        return st;
    }

}



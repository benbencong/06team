package com.benben;

import java.io.File;

public class fileDemo {
    public static void main(String[] args) {
        File f=new File("e:\\java");
        getFileName(f,0);
    }
    public static void getFileName(File file, int count) {
        //System.out.println("dsd"+file+count);
        for(File f:file.listFiles()) {         //遍历目录
            String preStr = "";
            //System.out.println("dd"+f+count);
            for(int i=0; i<=count; i++) {    //所在层级的输出格式
                preStr += " ";
            }
            System.out.println(preStr+f.getName());
            if(f.isDirectory()){            //是否为目录
                //count++;
                getFileName(f,count+1);  //递归调用
            }
        }
    }
}

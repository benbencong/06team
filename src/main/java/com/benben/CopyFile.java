package com.benben;

import java.io.*;
import java.nio.channels.FileLockInterruptionException;
/*
请利用InputStream和OutputStream，编写一个复制文件的程序，它可以带参数运行：
java CopyFile.java source.txt copy.txt
 */
public class CopyFile {
    public static void main(String[] args) throws IOException {

        copy("e:\\java\\1.txt","e:\\java\\2.txt");
    }
    public static void copy(String f1, String f2) throws IOException {
        InputStream input=new FileInputStream(f1);
        OutputStream out=new FileOutputStream(f2);
        for(;;){
            int n=input.read();
            if (n==-1){
                break;
            }
            out.write(n);
            System.out.println(n);
        }
        input.close();
        out.close();



    }
}

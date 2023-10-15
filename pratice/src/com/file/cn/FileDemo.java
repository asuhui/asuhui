package com.file.cn;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        try {
            File file = new File("abc/def/student.txt ");
            //file.createNewFile();//创建一个文件，不包含文件夹
            //System.out.println(file.getParentFile());//拿到上一层文件夹对象
            //System.out.println(file.getParent());
            //file.mkdir();
            //file.mkdirs();//创建文件夹一定选择这个，可以帮我们把上级目录创建出来
            //file.renameTo(new File("abc/def/xx.txt"));
            //file.delete();
            ////查看相关文件
            //System.out.println(file.exists());//查看文件是否存在
            //System.out.println(file.isAbsolute());//查看是否绝对路径
            //System.out.println(file.isDirectory());//查看是否是文件夹
            //System.out.println(file.isFile());//判断文件是否是文件
            //System.out.println(file.length());//查看文件大小
            //System.out.println(file.getName());
            File parrentFile = file.getParentFile();
            if (!parrentFile.exists()) {
                parrentFile.mkdirs();
            }
            file.createNewFile();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

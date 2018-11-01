package IO.IOStream.InputStream;

/**
 * @author Liaohaibo
 * @date 2018/10/31 下午10:25
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * java.io.InputStream 是所有输入流的超类
 * 1. abstract int read(): 读取下一个字节，并返回字节(0~255); 如果已读到末尾，则返回-1；
 * 2. int read(byte[] b): 读取若干字节并填充到byte数组，返回读取的字节数
 * 3. int read(byte[] b,int off,int len): 指定byte数组的偏移量和最大填充数
 * 4. void close(): 关闭输入流
 * 注意： read() 方法是阻塞的
 *
 */


public class InputStreamMain {

    public static void main(String[] args) throws IOException {

        /**
         *  注意最后关闭inputStream
         *  这是try finally的写法
         */
        System.out.println("------------华丽的分割线:使用try finally关闭资源--------------------");
        InputStream input = null;
        try {
            // 绝对路径
            //input = new FileInputStream("/Users/liaohaibo/Desktop/coding/learn/javaLearn/lesson01/src/IO/IOStream/mkdir/readme.md");

            // 相对路径 是指 本project 从根目录下的src开始
            input = new FileInputStream("src/IO/IOStream/mkdir/readme.md");
            int n;
            while ((n = input.read()) != -1) {
                System.out.println(n);
            }
        } finally {
            if (input != null) {
                input.close();
            }
        }

        /**
         * JDK1.7 新增
         * try resource 方法 编译器自动关闭资源 推荐使用
         */
        System.out.println("------------华丽的分割线：使用try resource 关闭资源--------------------");
        try (InputStream input1 = new FileInputStream("src/IO/IOStream/mkdir/readme.md")){
            int m;
            // 调用read 依次读取下一个字节，直到返回-1
            while ((m = input1.read()) != -1) {
                System.out.println(m);
            }
        } // 此处编译器自动关闭InputStream

        System.out.println("------------华丽的分割线： 使用read(byte[] b)--------------------");
        try (InputStream input2 = new FileInputStream("src/IO/IOStream/mkdir/readme.md")){
            int k;
            byte[] buffer = new byte[1000];
            // 调用read(byte[] b)读取若干字节并填充到byte数组，返回读取的字节数
            while ((k=input2.read(buffer)) != -1) {
                System.out.println("read " + k +" bytes.");
            }
        }

    }

}

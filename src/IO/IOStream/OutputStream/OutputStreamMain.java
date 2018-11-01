package IO.IOStream.OutputStream;

/**
 * @author Liaohaibo
 * @date 2018/10/31 下午11:18
 */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 *  java.io.OutputStream 是所有输出类的超类
 *  1. abstract write(int b) 写入一个字节
 *  2. void write(byte[] b) 写入byte[]数组所有字节     阻塞方法，执行完毕之后，才执行下一行
 *  3. void write(byte[] b, int off, int len) 写入byte[]数组指定部分字节
 *  4. void close() 关闭输出流
 *  5. void flush() 将缓存区的内容输出
 */

public class OutputStreamMain {

    public static void main(String[] args) throws IOException {

        try (OutputStream out = new FileOutputStream("src/IO/IOStream/OutputStream/test.md")) {
            byte[] b1 = "Hello".getBytes("utf-8");
            out.write(b1);
            byte[] b2 = ", OutputSteam.".getBytes("utf-8");
            out.write(b2);

        }

    }

}

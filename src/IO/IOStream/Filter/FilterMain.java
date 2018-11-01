package IO.IOStream.Filter;

/**
 * @author Liaohaibo
 * @date 2018/11/1 下午3:24
 */

/**
 * InputStream
 * 1. FileInputStream: 从文件读取数据
 * 2. ServletInputStream: 从Http请求读取数据
 * 3. Socket.getStream: 从TCP链接读取数据
 *
 * 4. 如果要给FileInputStream添加缓冲功能
 *    BufferedFileInputStream extends FileInputStream
 * 5. 如果要给FileInputStream添加计算机签名的功能
 *    DigestFileInputStream extends FileInputStream
 * 6. 如果要给FileInputStream添加加密/解密功能
 *    CipherFileInputStream extends FileInputStream
 *
 *    导致：子类爆炸
 */


import java.io.*;
import java.util.zip.GZIPInputStream;

/**
 *  JDK把InputStream分为两类
 *  1. 直接提供数据：FileInputStream, ByteArrayInpuStream, ServletInputStream
 *  2. 提供额外的附加功能的InputStream： BufferedInputStream, DigestInputStream, CipherFileInputStream
 *
 *  InputStream input = new GZIPInputStream(new BufferedInputStream(new FileInputStream("test.gz")))
 *  这种层层包装、通过组合功能而非继承的设计模式称为Filter模式（或者Decorator模式）
 *  通过少量的类实现了各种功能的组合
 */

public class FilterMain {

    public static void main(String[] args) throws IOException {

        try (InputStream input = new GZIPInputStream(new BufferedInputStream(new FileInputStream("src/IO/IOStream/Filter/test.txt.gz")))) {
            ByteArrayOutputStream output = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int n;
            while ((n=input.read(buffer)) != -1) {
                output.write(buffer,0,n);
            }
        }

    }

}

package IO.IOStream;

/**
 * @author Liaohaibo
 * @date 2018/10/31 下午3:38
 */

/**
 * IO流是一种顺序读写数据的模式：单向流动、以字节为最小单位
 * 1. IO流是一种流式的数据输入/输出模型
 * 2. 二进制数据以Byte为最小单位在InputStream/OutputStream中单向流动
 * 3. 字符数据以Char为最小单位在Reader/Writer中单向流动
 * 4. JDK中的java.io包提供了同步IO功能
 * 5. Java中IO流的接口和实现是分离的：
 *    字节流接口：InputStream/OutputStream
 *    字符流接口：Reader/Writer
 * 6. 区分如何使用：使用文本时用Reader/Writer;其余使用InputStream/OutputStream
 */
public class IOStreamMain {

}

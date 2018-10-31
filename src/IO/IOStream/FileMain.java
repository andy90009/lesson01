package IO.IOStream;

/**
 * @author Liaohaibo
 * @date 2018/10/31 下午9:45
 */

import java.io.File;
import java.io.IOException;

/**
 * java.io.File 表示文件系统中的一个文件或目录: 创建File本身不会有IO操作
 * 1. 构造方法：File(String pathname)
 * 2. 返回路径
 *    String getPath(): 返回构造方法中的pathname
 *    String getAbsolutePath(): 返回绝对路径
 *    String getCanonialPath(): 返回规范路径
 * 3. 返回文件或目录
 *    boolean is File(): 是否是文件
 *    boolean is Directory(): 是否是目录
 * 4. 当File对象表示一个文件时(isFile() == true)
 *    boolean canRead(): 是否允许读取该文件
 *    boolean canWrite(): 是否允许写入该文件
 *    boolean canExecute(): 是否允许运行该文件
 *    long length(): 获取该文件大小
 *
 *    boolean createNewFile(): 创建一个新文件
 *    static boolean createTempFile(String prefix, String suffix): 创建一个临时文件
 *    boolean delete(): 删除该文件
 *    void deleteOnExit(): 在JVM退出时删除该文件
 * 5. 当File对象表示一个目录时(isDirectory == true)
 *    String[] list(): 列出目录下的文件和子目录名
 *    File[] listFiles(): 列出目录下的文件和子目录名
 *    File[] listFiles(FileFilter filter): 过滤不想要的文件
 *    File[] listFiles(FilenameFilter filter)：过滤
 *
 *    boolean mkdir(): 创建该目录
 *    boolean mkdirs(): 创建该目录，并在必要时将需要的父目录页创建出来
 *    boolean delete(): 删除该目录
 */

public class FileMain {

    public static void main(String[] args) throws IOException {

        File mac = new File("/Users/liaohaibo/Desktop/coding/learn/javaLearn/lesson01/src/IO/IOStream");
        System.out.println(mac.isDirectory());
        File file = new File("/Users/liaohaibo/Desktop/coding/learn/javaLearn/lesson01/src/IO/IOStream/FileMain.java");
        System.out.println(file.isFile());
        File dir = new File("/Users/liaohaibo/Desktop/coding/learn/javaLearn/lesson01/src/IO/IOStream/mkdir");
        System.out.println(dir.mkdir());        // 创建了mkdir 目录
        File readme = new File("/Users/liaohaibo/Desktop/coding/learn/javaLearn/lesson01/src/IO/IOStream/mkdir/readme.md");
        System.out.println(readme.isFile());    // false,目前没有创建该文件
        System.out.println(readme.getAbsolutePath());
        System.out.println(readme.getCanonicalFile());

    }

}

package IO.IOStream.ClassPath;

/**
 * @author Liaohaibo
 * @date 2018/11/1 下午10:04
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

/**
 *  从classPath中读取文件可以避免不同操作系统的文件路径不一致的问题
 *  try (InputStream input = getClass().getResourceAsStream("/default.properties")) {
 *      // 如果资源文件不存在，会返回null
 *      if (input != null) {
 *
 *      }
 *  };
 *
 */
public class ClassPathMain {

    /**
     * 从classPath中读取文件
     * "/" 表示当前工程的src目录下
     *
     */
    public static void main(String[] args) throws IOException {

        try (InputStream input = ClassPathMain.class.
                getResourceAsStream("/IO/IOStream/ClassPath/config.properties")) {
            if(input != null ) {
                System.out.println("Read /IO/IOStream/ClassPath/config.properties...");
                Properties props = new Properties();
                props.load(input);
                System.out.println("config.properties: " + props.getProperty("key") + "," + props.getProperty("value"));
            }
        }

        String data = "/IO/IOStream/ClassPath/data.txt";
        try (InputStream input = ClassPathMain.class.getResourceAsStream(data)){
            if(input != null) {
                System.out.println("Read /IO/IOStream/ClassPath/data.txt...");
                BufferedReader reader = new BufferedReader(new InputStreamReader(input));
                System.out.println(reader.readLine());
                System.out.println(reader.readLine());
            }else {
                System.out.println("resource not found: " + data);
            }
        }


    }
}

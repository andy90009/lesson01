package collections.Properties;

/**
 * @author Liaohaibo
 * @date 2018/10/30 下午4:17
 */

import java.io.IOException;
import java.util.Properties;

/**
 *  Properties 配置文件
 *
 *  Properties用于读取配置
 *  1. 每一行表示一个 key = value;
 *  2. Properties文件只能使用ASCII码 注意中文的使用
 *  3. 可以从文件系统中读取 .properties文件
 *     String f = "C:\\conf\setting.properties";
 *     Properties props = new Properties();
 *     props.load(new FileInputStream(f));
 *     String url = props.getProperties("url");
 *     String decs = props.getProperties("description","default")       //第二个为默认值
 *
 *  4. 可以从ClassPath中读取 .properties文件
 *     Properties props = new Properties();
 *     props.load(getClass().getResourceAsStream("/common/setting.properties"));
 *     String url = props.getProperties("url");
 *     String decs = props.getProperties("description","default")
 *  5. 可以读取多个.properties 文件
 *  6. 后读取的.properties文件将覆盖先读取的（相同key）
 */


public class PropertiesMain {

    public static void main(String[] args) throws IOException {

        Properties props = new Properties();
        props.load(PropertiesMain.class.getResourceAsStream("/collections/Properties/setting.properties"));
        String url = props.getProperty("url");
        String language = props.getProperty("language");
        String courseTitle = props.getProperty("course.title");
        System.out.println(url);
        System.out.println(language);
        System.out.println(courseTitle);
    }

}

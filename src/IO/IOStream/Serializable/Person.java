package IO.IOStream.Serializable;

import java.io.Serializable;

/**
 * @author Liaohaibo
 * @date 2018/11/1 下午10:51
 */
public class Person implements Serializable{

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

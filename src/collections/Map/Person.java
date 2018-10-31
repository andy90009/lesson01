package collections.Map;

import java.util.Objects;

/**
 * @author Liaohaibo
 * @date 2018/10/30 下午2:53
 */
public class Person {

    private String name;

    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "(Person: " + name + "," + age + ")";
    }

    // 覆写equals()
    @Override
    public boolean equals(Object o) {
        // 首先判断传入对象是不是当前对象
        if (this == o) {
            return true;
        }
        // 判断是否是Person类型
        if(o instanceof Person) {
            Person p = (Person) o;
            return Objects.equals(this.name, p.name) && this.age == p.age;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.age);
    }
}

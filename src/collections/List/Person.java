package collections.List;

import java.util.Objects;

/**
 * @author Liaohaibo
 * @date 2018/10/30 上午11:12
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
        return "(Person: " + name +", " + age +")";
    }

    @Override
    public boolean equals(Object o) {

        if(this == o) {
            return true;
        }
        if(o instanceof Person) {
            Person p = (Person) o;
            return Objects.equals(p.name,this.name) && p.age == this.age;
        }
        return false;
    }
}

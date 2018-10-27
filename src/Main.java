import classLearn.Person;

public class Main {

    public static void main(String[] args) {

        Person person = new Person();
        person.setName("小明");
        person.setAge(28);
        System.out.println("person.name = " + person.getName());
        System.out.println("person.age = " + person.getAge());
    }
}

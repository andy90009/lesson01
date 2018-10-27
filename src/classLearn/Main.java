package classLearn;



public class Main {

    public static void main(String[] args) {

        Person person = new Person("小明",28);
//        person.setName("小明");
//        person.setAge(28);

        System.out.println("person.name = " + person.getName());
        System.out.println("person.age = " + person.getAge());
        System.out.println("birth = " + person.getBirth());

        Person person1 = new Person("Xiaohu");
        System.out.println("person1.name = " + person1.getName());
        System.out.println("person1.age = " + person1.getAge());

        Person person2 = new Person();
        System.out.println("Person2.name = "+ person2.getName());
        System.out.println("Person2.age = "+ person2.getAge());

        person.setName("haibo","liao");
        System.out.println("person.name = " + person.getName());

        Student student = new Student();
        System.out.println("student.hello() = " + student.hello());
        System.out.println(person.run());
        System.out.println(student.run());

        // 向上转型
        Person person3 = student;
        System.out.println("person3.name = " + person3.getName());
        System.out.println("person3.age = " + person3.getAge());

        // instanceof操作符可以判断对象的类型
        Student n = null;
        System.out.println(person3 instanceof Person);          // true
        System.out.println(student instanceof Person);          // true
        System.out.println(person3 instanceof Student);         // 注意person3 本身就是充student类型赋值过去的
        System.out.println(person1 instanceof Student);         // false
        System.out.println(n instanceof Student);


    }
}

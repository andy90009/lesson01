package IO.IOStream.Serializable;

/**
 * @author Liaohaibo
 * @date 2018/11/1 下午10:32
 */

/**
 *  序列化：序列化是指将一个Java对象变为二进制内容(byte[] b)
 *  1. 序列化后可以将byte[] 保存在文件中
 *  2. 序列化后可以将byte[] 通过网络传输
 */

/**
 *  一个java对象要实现序列化，必须实现Serializable接口
 *  1. Serializable接口没有任何方法
 *  2. 空接口被称为"标记接口",(marker interface)
 */

/**
 *  反序列化是指将一个二进制内容byte[]变成java对象
 *  1. 反序列化后可从文件读取byte[]并变为java对象
 *  2. 反序列化后可从网络读取byte[]并变为java对象
 */

/**
 *  序列化
 *  ObjectOutputStream负责将一个java对象写入二进制流
 *  try (ObjectOutputStream output = new ObjectOutputStram(...)) {
 *      output.writeObject(new Person("xiaoMing"))
 *      output.writeObject(new Person("xiaoHong"))
 *  }
 */

import java.io.*;

/**
 *  反序列化：不用调用构造方法，直接有JVM构造出java对象
 *  ObjectInputStream负责从二进制流读取一个java对象
 *  try (ObjectInputStream input = new ObjectInputStream(...)) {
 *      Object p1 = input.readObject();
 *      Person p2 = (Person) input.readObject();
 *  }
 *
 *  readObject可能抛出的异常
 *  1. ClassNotFoundException: 没有找到对应的class
 *  2. InvalidClassException: class不匹配
 */

public class SerializableMain {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

       String data = "src/IO/IOStream/Serializable/data.txt";
        // 序列化ObjectOutputStream
        try (ObjectOutputStream output = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(data)))) {
            output.writeInt(999);
            output.writeUTF("Hello,Serializable!");
            output.writeObject(new Person("XiaoMing"));
        }

        System.out.println("Read....");
        // 反序列化
        try (ObjectInputStream input = new ObjectInputStream(new BufferedInputStream(new FileInputStream(data)))) {
            System.out.println(input.readInt());
            System.out.println(input.readUTF());
            Person p = (Person) input.readObject();
            System.out.println(p);
        }



    }
}

package tryCatch;

/**
 * @author Liaohaibo
 * @date 2018/10/29 下午3:14
 */
public class Main {

    public static void main(String[] args) {
       // process1();

        Class cla1 = String.class;
        String s = "hello";
        Class cla2 = s.getClass();
        System.out.println(cla1 == cla2);
        try {
            Class cla3 = Class.forName("java.lang.String");
            System.out.println(cla1 == cla3);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }



    }

    static void process1() {

        try {
            process2();
        } catch (Exception e) {
            e.printStackTrace();            // 打印异常信息
        } finally {
            System.out.println("end");
        }

    }

    static void process2() {
        process3();
    }

    static void process3() {
        try {
            Integer.parseInt(null);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(e);      //将原始异常e 传入新异常
        }

    }


}

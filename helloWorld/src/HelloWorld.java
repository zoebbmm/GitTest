/**
 * Created by weizhou on 2/6/15.
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        String str = "Wei";
        System.out.println(str);

//        String str1 = "Zhou &&&&&";
//
//        String str2 = "Second branch";
//
        String str3 = "%%%%%%%";
//
//        String str4 = "new test";

        String str5 = "123455";
        int value = 123455443;
        long l = (long) 23.2;


//        String str6 = "hello";
//
//        String str7 = "Foobar";
//
//        String str8 = "hhshhs";

        HelloWorld hw = new HelloWorld();
        hw.test(value);
        hw.newTest(str5);

    }

    public void test(int s) {
        try {
//            int a = Integer.parseInt(s);
//            System.out.println(a);
            System.out.println(s);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void newTest(String s) {
        System.out.println(s);
    }
}

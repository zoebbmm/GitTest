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
//        String str3 = "*******";
//
//        String str4 = "new test";

        String str5 = "36474";

//        String str6 = "hello";
//
//        String str7 = "Foobar";
//
//        String str8 = "hhshhs";

        HelloWorld hw = new HelloWorld();
        hw.test(str5);

    }

    public void test(String s) {
        try {
            int a = Integer.parseInt(s);
            System.out.println(a);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

public class MethodsExample {
    public static void main(String[] args) {
        SayHello();
        Student mark = new Student();
        System.out.println(mark.getName());

        SecondTest.myMethod();
    }
    public static void SayHello() {
        System.out.println("Hello!");
    }
}

class SecondTest {
    public static void myMethod() {
        MethodsExample.SayHello();
        AnotherHello.SayHello();
    }
}

class Student {
    private String name = "Mark";
    public String getName() {
        return name;
    }
}

class AnotherHello {
    public static void SayHello() {
        System.out.println("make me!!");
    }
}

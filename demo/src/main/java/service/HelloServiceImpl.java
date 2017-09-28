package service;

public class HelloServiceImpl implements HelloService {

    private  String message;

    private String name;

    public void sayHello() {
        System.out.println("hello world!");
        System.out.println(name);
        System.out.println(message);
    }
    public HelloServiceImpl(String message) {
        this.message = message;
    }

    public HelloServiceImpl() {
    }

//    @java.beans.ConstructorProperties({"HelloServiceImplMessage", "HelloServiceImplIndex"})
    public HelloServiceImpl(String message, String name) {
        this.message = message;
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

package service;

public class HelloServiceImpl implements HelloService {

    private  String message;

    private String name;

    private boolean isOk;

    public void sayHello() {
        System.out.println("hello world!");
        System.out.println(name);
        System.out.println(message);
        System.out.println(isOk);
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

    public HelloServiceImpl(String message, String name, boolean isOk) {
        this.message = message;
        this.name = name;
        this.isOk = isOk;
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

    public boolean isOk() {
        return isOk;
    }

    public void setOk(boolean ok) {
        isOk = ok;
    }
}

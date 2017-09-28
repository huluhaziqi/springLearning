package service;

public class HelloFactory {
    public static HelloService newInstance(String message){
        return new HelloServiceImpl(message);
    }

    public HelloService newInstance1(String message){
        return new HelloServiceImpl(message);
    }
}

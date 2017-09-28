package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.test.context.junit4.SpringRunner;
import service.HelloService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Test01 {

    @Test
    public void test01(){
            //1、读取配置文件实例化一个IoC容器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:hello.xml");
            //2、从容器中获取Bean，注意此处完全“面向接口编程，而不是面向实现”
            HelloService helloApi = context.getBean("hello", HelloService.class);
            //3、执行业务逻辑
            helloApi.sayHello();
        System.out.println(context.containsBean("hello"));
        Resource resource = new ClassPathResource("hello.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);
        HelloService helloService = beanFactory.getBean("hello",HelloService.class);
        helloService.sayHello();


        }
    @Test
    public void test02(){
        //1、读取配置文件实例化一个IoC容器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:hello2.xml");
        //2、从容器中获取Bean，注意此处完全“面向接口编程，而不是面向实现”
        HelloService helloApi = context.getBean("hello1", HelloService.class);
        //3、执行业务逻辑
        helloApi.sayHello();
        System.out.println(context.containsBean("hello1"));

        HelloService alias11 = context.getBean("alias11",HelloService.class);
        alias11.sayHello();
        String[] aliasesStr = context.getAliases("hello1");
        for (String alias : aliasesStr) {
            System.out.println("alias :" + alias);
        }
        Resource resource = new ClassPathResource("hello.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);
        HelloService helloService = beanFactory.getBean("hello",HelloService.class);
        helloService.sayHello();

        Assert.assertEquals(helloApi,alias11);
        String[] bean3Alias = context.getAliases("hello1");
        System.out.println("bean3Alias : " + bean3Alias.length);
        //因此别名不能和id一样，如果一样则由IoC容器负责消除冲突
//        Assert.assertEquals(0, bean3Alias.length);

        HelloService helloService1 = context.getBean("hello2",HelloService.class);
        helloService1.sayHello();
    }

    @Test
    public void test03(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classpath:helloFactory.xml");
        HelloService helloService = classPathXmlApplicationContext.getBean("hello4",HelloService.class);
        helloService.sayHello();
    }
    @Test
    public void test04(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classpath:helloFactory2.xml");
        HelloService helloService = classPathXmlApplicationContext.getBean("hello5",HelloService.class);
        helloService.sayHello();
    }
    @Test
    public void test05(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classpath:hello3.xml");
        HelloService helloService = classPathXmlApplicationContext.getBean("byIndex",HelloService.class);
        helloService.sayHello();
        HelloService helloService1 = classPathXmlApplicationContext.getBean("byType",HelloService.class);
        helloService1.sayHello();
        HelloService helloService2 = classPathXmlApplicationContext.getBean("byName",HelloService.class);
        helloService2.sayHello();
    }

    @Test
    public void test06(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classpath:hello4.xml");
        HelloService helloService = classPathXmlApplicationContext.getBean("byIndex",HelloService.class);
        helloService.sayHello();
        HelloService helloService1 = classPathXmlApplicationContext.getBean("byType",HelloService.class);
        helloService1.sayHello();
        HelloService helloService2 = classPathXmlApplicationContext.getBean("byName",HelloService.class);
        helloService2.sayHello();
    }

    @Test
    public void test07(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classpath:hello5.xml");
        HelloService helloService = classPathXmlApplicationContext.getBean("byIndex",HelloService.class);
        helloService.sayHello();
        HelloService helloService1 = classPathXmlApplicationContext.getBean("byType",HelloService.class);
        helloService1.sayHello();
        HelloService helloService2 = classPathXmlApplicationContext.getBean("byName",HelloService.class);
        helloService2.sayHello();
    }
}

package com.example.demo;

import com.example.model.ArrayBean;
import com.example.model.ListBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collection;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Test02 {

    @Test
    public void test01(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classpath:Collections.xml");
        ListBean listBean =  classPathXmlApplicationContext.getBean("list", ListBean.class);
        System.out.println(listBean.getList().size());
        ListBean listBean2 =  classPathXmlApplicationContext.getBean("collection", ListBean.class);
        Collection<String> collection = listBean2.getCollection();
        for(String s : collection){
            System.out.println(s);
        }
        System.out.println(listBean.getList().size());
    }

    @Test
    public void test02(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classpath:DependencyInjectTest.xml");
        ArrayBean arrayBean =  classPathXmlApplicationContext.getBean("arrayBean", ArrayBean.class);
        System.out.println(arrayBean.getArray().length);
        ListBean listBean2 =  classPathXmlApplicationContext.getBean("collection", ListBean.class);
        Collection<String> collection = listBean2.getCollection();
        for(String s : collection){
            System.out.println(s);
        }
        System.out.println(listBean2.getList().size());
    }
}

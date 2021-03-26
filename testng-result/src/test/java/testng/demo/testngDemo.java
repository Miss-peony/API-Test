package testng.demo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class testngDemo {
    @Test
    public void test1(){
            System.out.println("这是第一个方法");
    }
    @Test
    public void test2(){
        System.out.println("这是第二个方法");
    }
    @Test
    public void test3(){
        Reporter.log("这是我自己的日志");
        throw  new RuntimeException();
    }


}

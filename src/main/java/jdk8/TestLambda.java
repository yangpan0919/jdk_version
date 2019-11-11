package jdk8;

import org.junit.Test;

import java.util.Comparator;
import java.util.function.Consumer;

/**
 * Created by Administrator on 2019/3/25.
 */
public class TestLambda {

    @Test
    public void test1(){
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("helloWorld");
            }
        };
        r.run();
        System.out.println("---------------------------------");
        Runnable r1 = () ->   System.out.println("Hello Lambda");
        r1.run();
    }

    @Test
    public void test2(){
        Consumer<String> con = (x) -> System.out.println(x);
        con.accept("我是一个大猪头");
    }

    @Test
    public void test3(){
        Comparator<Integer> com = (x,y) -> {
            System.out.println("函数式接口");
            return  Integer.compare(x,y);
        };

    }
}

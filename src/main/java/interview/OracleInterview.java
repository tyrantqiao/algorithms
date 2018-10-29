package interview;

import java.lang.annotation.Retention;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 * @author tyrantqiao
 * date: 2018/10/27
 * blog: tyrantqiao.com
 * contact: tyrantqiao@icloud.com
 */
public class OracleInterview {
    /**
     * for里面塞方法
     */
    public void testForWithMethod() {
        for (int i = 0; i < 10; System.out.println("hello")) {
            i++;
        }
    }

    public static void main(String[] args){
        OracleInterview oracleInterview=new OracleInterview();
        oracleInterview.testForWithMethod();
    }

}

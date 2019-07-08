package io.github.zdp072;

/**
 * 功能描述:
 * 必须回收自定义的ThreadLocal变量
 *
 * @ClassName: Case7
 * @Author: zdp072
 * @Date: 2019-07-08 23:39
 * @Version: V1.0
 */
public class Case7 {
    public static void main(String[] args) {
        ThreadLocal<String> objectThreadLocal = new ThreadLocal<String>();
        objectThreadLocal.set("a");
        try {
            System.out.println(objectThreadLocal.get());
        } finally {
            objectThreadLocal.remove();
        }
    }
}

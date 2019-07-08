package io.github.zdp072;

/**
 * 功能描述:
 * 变量为外部参数时,需要先判空
 *
 * @ClassName: Case9
 * @Author: zdp072
 * @Date: 2019-07-08 23:56
 * @Version: V1.0
 */
public class Case9 {
    public static void main(String[] args) {
        method(null);
    }

    public static void method(Integer param) {
        switch (param) {
            // 肯定不是进入这里
            case 0:
                System.out.println("it's 0");
                break;
            // 也不是进入这里
            case 1:
                System.out.println("it's 1");
                break;
            // 也不是进入这里
            default:
                System.out.println("default");
        }
    }
}

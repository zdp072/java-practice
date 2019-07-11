package io.github.zdp072;

/**
 * 功能描述:
 * 返回类型为基本数据类型，return包装数据类型的对象时，自动拆箱有可能产生NPE
 *
 * @ClassName: Case12
 * @Author: zdp072
 * @Date: 2019-07-09 23:58
 * @Version: V1.0
 */
public class Case12 {

    public static Integer i;

    /**
     * 反例,会抛出空指针异常
     *
     * @return
     */
    public static int f() {
        return new Integer(i);
    }

    public static void main(String[] args) {
        System.out.println(f());
    }
}

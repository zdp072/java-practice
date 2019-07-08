package io.github.zdp072;

import java.math.BigDecimal;

/**
 * 功能描述:
 * 浮点数之间的等值判断，基本数据类型不能用==来比较，包装数据类型不能用equals来判断。
 *
 * @ClassName: Case1
 * @Author: zdp072
 * @Date: 2019-07-08 00:17
 * @Version: V1.0
 */
public class Case1 {
    public static void main(String[] args) {
        // test1();
        // test2();
        test3();
    }

    public static void test1() {
        float a = 1.0f - 0.9f;
        float b = 0.9f - 0.8f;
        System.out.println(a);
        System.out.println(b);
        if (a == b) {
            // 预期进入此代码快，执行其它业务逻辑
            // 但事实上 a==b 的结果为 false
        }
        Float x = Float.valueOf(a);
        Float y = Float.valueOf(b);
        System.out.println(x);
        System.out.println(y);
        if (x.equals(y)) {
            // 预期进入此代码快，执行其它业务逻辑
            // 但事实上 equals 的结果为 false
        }
    }

    public static void test2() {
        // 指定一个误差范围，两个浮点数的差值在此范围之内，则认为是相等的。
        float a = 1.0f - 0.9f;
        float b = 0.9f - 0.8f;
        float diff = 1e-6f;
        if (Math.abs(a - b) < diff) {
            System.out.println("true");
        }
    }

    public static void test3() {
        // 使用BigDecimal来定义值，再进行浮点数的运算操作。
        BigDecimal a = new BigDecimal("1.0");
        BigDecimal b = new BigDecimal("0.9");
        BigDecimal c = new BigDecimal("0.8");
        // 做减法
        BigDecimal x = a.subtract(b);
        BigDecimal y = b.subtract(c);
        if (x.equals(y)) {
            System.out.println("true");
        }
    }
}

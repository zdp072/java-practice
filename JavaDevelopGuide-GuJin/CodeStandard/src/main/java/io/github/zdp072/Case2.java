package io.github.zdp072;

import java.math.BigDecimal;

/**
 * 功能描述:
 * 为了防止精度损失，禁止使用构造方法BigDecimal(double)的方式把double值转化为BigDecimal对象。
 *
 * @ClassName: Case2
 * @Author: zdp072
 * @Date: 2019-07-08 21:55
 * @Version: V1.0
 */
public class Case2 {
    public static void main(String[] args) {
        // 正确
        BigDecimal recommend1 = new BigDecimal("0.1");

        // 正确
        BigDecimal recommend2 = BigDecimal.valueOf(0.1);

        // 错误 - 会损失精度
        BigDecimal recommend3 = new BigDecimal(0.1f);
    }
}

package io.github.zdp072;

/**
 * 功能描述:
 * 不要在finally块中使用return。
 *
 * @ClassName: Case11
 * @Author: zdp072
 * @Date: 2019-07-09 23:44
 * @Version: V1.0
 */
public class Case11 {

    private static int x = 0;

    /**
     * 以下为错误的写法
     * @return
     */
    public static int checkReturn() {
        try {
            // x等于1，此处不返回
            return ++x;
        } finally {
            // 返回的结果是2
            return ++x;
        }
    }

    public static void main(String[] args) {
        System.out.println(checkReturn());
    }
}

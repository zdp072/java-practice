package io.github.zdp072;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 功能描述:
 * SimpleDateFormat线程安全的写法
 *
 * @ClassName: Case6
 * @Author: zdp072
 * @Date: 2019-07-08 23:33
 * @Version: V1.0
 */
public class Case6 {

    public static void main(String[] args) {
        System.out.println(df.get().format(new Date()));
    }

    private static final ThreadLocal<DateFormat> df = new ThreadLocal<DateFormat>() {
        @Override
        protected DateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd");
        }
    };

}

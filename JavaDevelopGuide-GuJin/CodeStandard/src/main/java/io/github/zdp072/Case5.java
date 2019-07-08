package io.github.zdp072;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 功能描述:
 * 循环remove 元素请使用Iterator 方式
 *
 * @ClassName: Case5
 * @Author: zdp072
 * @Date: 2019-07-08 22:47
 * @Version: V1.0
 */
public class Case5 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            if ("2".equals(item)) {
                iterator.remove();
            }
        }
    }
}

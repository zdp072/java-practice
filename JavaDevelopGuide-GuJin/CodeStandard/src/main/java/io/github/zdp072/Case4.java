package io.github.zdp072;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 功能描述:
 * ArrayList的subList结果不可强转成ArrayList
 *
 * @ClassName: Case4
 * @Author: zdp072
 * @Date: 2019-07-08 22:31
 * @Version: V1.0
 */
public class Case4 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c");
        List<String> subList = list.subList(0, 1);
        ArrayList a = (ArrayList) subList;
    }
}

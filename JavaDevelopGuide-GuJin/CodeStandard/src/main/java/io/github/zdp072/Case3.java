package io.github.zdp072;

/**
 * 功能描述:
 * 使用索引访问用 String 的 split 方法得到的数组时，需做最后一个分隔符后有无内容的检查
 *
 * @ClassName: Case3
 * @Author: zdp072
 * @Date: 2019-07-08 22:15
 * @Version: V1.0
 */
public class Case3 {
    public static void main(String[] args) {
        String str = "a,b,c,,";
        String[] ary = str.split(",");
        // 预期大于3，结果是3
        System.out.println(ary.length);
    }
}

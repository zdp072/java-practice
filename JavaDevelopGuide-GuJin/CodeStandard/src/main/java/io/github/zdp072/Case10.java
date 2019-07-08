package io.github.zdp072;

/**
 * 功能描述:
 * 代码逻辑先考虑失败、异常、中断、退出等直接返回的情况，解决代码中判断分支嵌套的问题
 *
 * @ClassName: Case10
 * @Author: zdp072
 * @Date: 2019-07-09 00:04
 * @Version: V1.0
 */
public class Case10 {
    public void findBoyfriend(Man man) {
        if (man.isUgly()) {
            System.out.println("本姑娘是外貌协会的资深会员");
            return;
        }
        if (man.isPool()) {
            System.out.println("贫贱夫妻百事哀");
            return;
        }
        if (man.isBadTemper()) {
            System.out.println("银河有多远，你就给我滚多远");
            return;
        }

        // 类似else
        System.out.println("可以先交往一段时间看看");
    }

    class Man {
        public boolean isUgly() {
            return true;
        }

        public boolean isPool() {
            return true;
        }

        public boolean isBadTemper() {
            return true;
        }
    }
}

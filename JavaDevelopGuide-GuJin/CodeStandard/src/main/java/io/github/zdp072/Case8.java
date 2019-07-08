package io.github.zdp072;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 功能描述:
 * 使用尝试机制来获取锁,需要判断当前线程是否持有锁
 *
 * @ClassName: Case8
 * @Author: zdp072
 * @Date: 2019-07-08 23:47
 * @Version: V1.0
 */
public class Case8 {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        boolean isLocked = lock.tryLock();
        if (isLocked) {
            try {
                System.out.println("xxx");
            } finally {
                lock.unlock();
            }
        }
    }
}

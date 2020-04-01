package com.dsy.pattern.singleton.Lazy;

/**
 *  classpath: LazyStatic.class 首先加载classpath下class文件
 *              LazyStatic$LazyHolder.class 只有使用到的时候才会被加载
 *
 *   优点：写法优雅，利用了Java本身语法特点，性能高，避免了内存的浪费
 *   缺点：能够反射破坏
 *
 */
public class LazyStatic {

    private LazyStatic(){};

    public static LazyStatic getInstance() {
        return LazyHolder.instance;
    }

    private static class LazyHolder {
        private static final LazyStatic instance = new LazyStatic();
    }
}

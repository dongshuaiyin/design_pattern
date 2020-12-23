package com.dsy.pattern.chain.optimiaze;

import com.dsy.pattern.chain.Member;

/**
 * @Desc：责任链处理器
 * @Author：dongshuaiyin
 * @Date：2020/12/17 22:50
 * @Version 1.0
 */
public abstract class Handler<T> {

    protected Handler next;

    public void next(Handler next) {
        this.next = next;
    }


    public abstract void doHandler(Member member);

    public static class Builder<T> {
        private Handler<T> head;
        private Handler<T> tail;

        public Builder<T> addHandler(Handler handler) {
            if (this.head == null) {
                this.head = this.tail = handler;
            }
            this.tail.next = handler;
            this.tail = handler;
            return this;
        }

        public Handler<T> buildHandler() {
            return this.head;
        }
    }

}

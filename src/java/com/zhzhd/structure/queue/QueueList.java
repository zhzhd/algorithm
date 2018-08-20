package com.zhzhd.structure.queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

;
/**
 *@author zhangzhendong1
 *@date 2018/8/10
 *@package com.zhzhd.structure.queue
 *@describe
 **/
public class QueueList {

    Queue queue1 = new LinkedList();
    /**
     * 不支持多线程
     */
    Queue queue2 = new PriorityQueue();
    /**
     * 多线程优先队列
     */
    Queue queue3 = new PriorityBlockingQueue();

    public static void main(String[] args) {

    }
}
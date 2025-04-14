package org.example;

import org.example.model.Queue;
import org.example.model.StaticQueue;
import org.example.util.QueueUtil;

public class App {

    public static void main(String[] args) {
        Queue queue = new StaticQueue();

        for(int i = 0; i < 10; i++) {
            queue.add(i);
        }
        QueueUtil.revert(queue);
        QueueUtil.print(queue);
    }

}

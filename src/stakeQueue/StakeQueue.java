package stakeQueue;

import java.util.*;

public class StakeQueue {
      static void main(String[] args) {

        Queue<Integer> queue = new ArrayDeque<>();
        //single ended queue

        //enqueue
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);

        //front peak
        System.out.println(queue.peek());

        //pop
        System.out.println(queue.poll());



        Deque<Integer> q = new ArrayDeque<>();
        q.add(33);
        q.add(44);
        q.addLast(22);
        q.addFirst(99);
        q.addFirst(66);
        System.out.println(q);

        System.out.println(q.peekFirst());
        System.out.println(q.peekLast());

        System.out.println(q.remove());
        System.out.println(q.removeFirst());
        System.out.println(q.removeLast());










    }
}

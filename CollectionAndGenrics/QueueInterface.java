package CollectionAndGenrics;

import java.util.LinkedList;
import java.util.Queue;

class QueueInterface {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        queue.add(5);
        queue.offer(4);
        queue.offer(0);

        ListUtility.print(queue);

        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.element());
        System.out.println(queue.poll());
        ListUtility.print(queue);
    }
}

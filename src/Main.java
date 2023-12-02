public class Main {
    public static void main(String[] args) {
        testPriorityQueue();
        testMaxHeap();
    }

    public static void testPriorityQueue() {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(10);
        priorityQueue.add(20);
        priorityQueue.add(15);
        priorityQueue.add(5);
        priorityQueue.add(25);

        System.out.println(priorityQueue + " size: " + priorityQueue.size());

        priorityQueue.changePriority(2, 30);

        System.out.println(priorityQueue);

        System.out.println("Peek: " + priorityQueue.peek());

        while (priorityQueue.size() > 0) {
            System.out.println("Poll: " + priorityQueue.poll());
            System.out.println(priorityQueue + " size: " + priorityQueue.size());
        }
    }

    private static void testMaxHeap() {
        MaxHeap<Integer> maxHeap = new MaxHeap<>();

        maxHeap.add(10);
        maxHeap.add(5);
        maxHeap.add(20);
        maxHeap.add(15);
        maxHeap.add(7);
        System.out.println(maxHeap + " size: " + maxHeap.size());

        System.out.println("Peek: " + maxHeap.peek());

        maxHeap.add(25);

        System.out.println(maxHeap + " size: " + maxHeap.size());

        System.out.println("Peek: " + maxHeap.peek());

    }
}

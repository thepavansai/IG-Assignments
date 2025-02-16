
public class QueueTest {
    public static void main(String[] args) {
        Queue<Integer> intQueue = new Queue<>();
        intQueue.enqueue(1);
        intQueue.enqueue(2);
        intQueue.enqueue(3);
        System.out.println("Integer Queue:");
        while (!intQueue.isEmpty()) {
            System.out.println(intQueue.dequeue());
        }

        Queue<Double> doubleQueue = new Queue<>();
        doubleQueue.enqueue(1.1);
        doubleQueue.enqueue(2.2);
        doubleQueue.enqueue(3.3);
        System.out.println("\nDouble Queue:");
        while (!doubleQueue.isEmpty()) {
            System.out.println(doubleQueue.dequeue());
        }

        Queue<String> stringQueue = new Queue<>();
        stringQueue.enqueue("Hello");
        stringQueue.enqueue("World");
        System.out.println("\nString Queue:");
        while (!stringQueue.isEmpty()) {
            System.out.println(stringQueue.dequeue());
        }
    }
}
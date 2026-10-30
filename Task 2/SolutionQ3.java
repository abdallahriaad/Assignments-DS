
public class SolutionQ3 {

    private Queue<Integer> queue;

    public SolutionQ3(int i) {
        queue = new ArrayQueue<>(i);
    }

    public int ping(int t) {
        queue.enqueue(t);
        while (!queue.isEmpty() && queue.first() < t - 3000) {
            queue.dequeue();
        }

        return queue.size();
}
}

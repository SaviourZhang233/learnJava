import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RecentCounter {
    Queue<Integer> Q = new LinkedList<>();
    public RecentCounter() {

    }

    public int ping(int t) {
        Q.offer(t);
        while (Q.peek() < t - 3000) {
            Q.poll();
        }
        return Q.size();
    }
}

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class leastInterval {

    public int leastIntervalConst(char[] tasks, int n) {
        if(n == 0) return tasks.length;
        int[] count = new int[26];
        for (int t : tasks) count[t-'A']++;
        PriorityQueue<int[]> maxheap = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[1] - o1[1];
            }
        });
        for (int i = 0; i < 26; i++) {
            if (count[i] > 0) maxheap.add(new int[]{i, count[i]});
        }
        LinkedList<int[]> waitlist = new LinkedList<>();
        int t = 0, waitCount = 0;
        while (!maxheap.isEmpty() || waitCount > 0) {
            t++;
            int[] top = null;
            if (!maxheap.isEmpty()) top = maxheap.poll();
            if (top == null || --top[1] == 0) {
                waitlist.add(null);
            } else {
                waitlist.add(top);
                waitCount++;
            }
            if (waitlist.size() == n+1) {
                int[] job = waitlist.poll();
                if (job != null) {
                    maxheap.add(waitlist.poll());
                    waitCount--;
                }
            }
        }
        return t;
    }
}

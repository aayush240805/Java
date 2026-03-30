package CollectionFramework.Queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

class delayedTask implements Delayed {
    private final String taskName;
    private final long startTime;

    public delayedTask (String taskName, long delay, TimeUnit unit) {
        this.taskName = taskName;
        this.startTime = System.currentTimeMillis() + unit.toMillis(delay);
    }

    @Override
    public long getDelay(TimeUnit unit) {
        long remaining = startTime - System.currentTimeMillis();
//        return unit.toMillis(remaining);
        return unit.convert(remaining, TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        if (this.startTime < ((delayedTask) o).startTime){
            return -1;
        }
        if (this.startTime > ((delayedTask) o).startTime){
            return 1;
        }
        else {
            return 0;
        }
    }
    public String getTaskName() {
        return taskName;
    }
}

public class _5DelayQueue {
    public static void main(String[] args) throws InterruptedException {
        // Thread-Safe unbounded queue
        // Elements can only be taken from the queue when their delay expired
        // Useful for scheduling tasks to be executed after a certain delay
        // Internally works priority queue

        BlockingQueue<delayedTask> delayQueue = new DelayQueue<>();
        delayQueue.put(new delayedTask("Task 1", 5, TimeUnit.SECONDS));
        delayQueue.put(new delayedTask("Task 2", 3, TimeUnit.SECONDS));
        delayQueue.put(new delayedTask("Task 3", 10, TimeUnit.SECONDS));

        while (!delayQueue.isEmpty()){
            delayedTask task = delayQueue.take(); // blocks until a task's delay has expired
            System.out.println("Executed : " + task.getTaskName() + " at " + System.currentTimeMillis());
        }
    }
}

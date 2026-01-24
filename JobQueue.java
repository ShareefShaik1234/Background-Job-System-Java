import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class JobQueue {

    private BlockingQueue<Job> queue = new LinkedBlockingQueue<>();

    public void addJob(Job job) {
        queue.add(job);
        System.out.println(job.getJobId() + " added to queue");
    }

    public Job getJob() throws InterruptedException {
        return queue.take(); // waits if queue is empty
    }
}
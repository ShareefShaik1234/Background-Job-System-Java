public class Worker implements Runnable {

    private JobQueue jobQueue;

    public Worker(JobQueue jobQueue) {
        this.jobQueue = jobQueue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Job job = jobQueue.getJob();
                job.run();
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}
public class Main {

    public static void main(String[] args) {

        JobQueue jobQueue = new JobQueue();

        // Create workers
        Thread worker1 = new Thread(new Worker(jobQueue), "Worker-1");
        Thread worker2 = new Thread(new Worker(jobQueue), "Worker-2");

        worker1.start();
        worker2.start();

        // Add jobs
        jobQueue.addJob(new Job("Job-1"));
        jobQueue.addJob(new Job("Job-2"));
        jobQueue.addJob(new Job("Job-3"));
        jobQueue.addJob(new Job("Job-4"));
    }
}
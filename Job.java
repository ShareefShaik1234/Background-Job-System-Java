public class Job implements Runnable {

    private String jobId;
    private JobStatus status;

    public Job(String jobId) {
        this.jobId = jobId;
        this.status = JobStatus.PENDING;
    }

    @Override
    public void run() {
        try {
            status = JobStatus.RUNNING;
            System.out.println(jobId + " is RUNNING");

            // Simulate long task
            Thread.sleep(3000);

            status = JobStatus.COMPLETED;
            System.out.println(jobId + " COMPLETED");

        } catch (Exception e) {
            status = JobStatus.FAILED;
            System.out.println(jobId + " FAILED");
        }
    }

    public String getJobId() {
        return jobId;
    }

    public JobStatus getStatus() {
        return status;
    }
}
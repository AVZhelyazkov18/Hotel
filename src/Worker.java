import Enums.JobType;

public class Worker extends Guest {
    private JobType job;
    private float salary;

    public Worker(String userFName, String userLName, String age, String pin, String job, float salary) {
        super(userFName, userLName, age, pin);
        this.job = JobType.valueOf(job);
        this.salary = salary;
    }

    public JobType getJob() {
        return job;
    }

    public void setJob(JobType job) {
        this.job = job;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}

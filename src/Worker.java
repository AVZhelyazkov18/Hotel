public class Worker extends Guest {
    private String job;
    private float salary;

    public Worker(String userFName, String userLName, String age, String pin, String job, float salary) {
        super(userFName, userLName, age, pin);
        this.job = job;
        this.salary = salary;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}

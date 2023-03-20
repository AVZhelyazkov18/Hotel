public class Guest {
    private String userFName;
    private String userLName;
    private String age;
    private String pin;

    public Guest(String userFName, String userLName, String age, String pin) {
        this.userFName = userFName;
        this.userLName = userLName;
        this.age = age;
        this.pin = pin;
    }

    public String getUserFName() {
        return userFName;
    }

    public void setUserFName(String userFName) {
        this.userFName = userFName;
    }

    public String getUserLName() {
        return userLName;
    }

    public void setUserLName(String userLName) {
        this.userLName = userLName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }
}

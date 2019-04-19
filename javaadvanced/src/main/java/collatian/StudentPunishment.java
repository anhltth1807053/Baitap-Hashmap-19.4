package collatian;

public class StudentPunishment {
    private String rollNumber;
    private String name;
    private double money;

    public StudentPunishment(String rollNumber, String name, double money) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.money = money;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}

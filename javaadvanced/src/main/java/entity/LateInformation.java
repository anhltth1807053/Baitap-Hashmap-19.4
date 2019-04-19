package entity;

public class LateInformation {
    private String day;
    private String rollNumber;
    private String name;
    private double money;

    public LateInformation(String day, String rollNumber, String name, double money) {
        this.day = day;
        this.rollNumber = rollNumber;
        this.name = name;
        this.money = money;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
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

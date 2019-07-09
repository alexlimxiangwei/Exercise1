package sg.edu.rp.c346.demoandroidlist;

public class Employee {

    private String name;
    private String role;
    private double pay;

    public Employee(String name, String role, double pay) {
        this.name = name;
        this.role = role;
        this.pay = pay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }
}

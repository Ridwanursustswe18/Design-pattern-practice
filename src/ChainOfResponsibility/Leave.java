package ChainOfResponsibility;

public class Leave {
    private int numberOfDays;
    private int employeeTier;
    private String reason;
    public Leave(int numberOfDays,int employeeTier,String reason){
        this.numberOfDays = numberOfDays;
        this.employeeTier = employeeTier;
        this.reason = reason;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public int getEmployeeTier() {
        return employeeTier;
    }

    public String getReason() {
        return reason;
    }
}

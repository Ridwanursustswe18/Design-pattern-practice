package Factory;

import java.util.Scanner;

public class GetBll {
    public static void main(String[] args) {
        GetPlanFactory planFactory = new GetPlanFactory();

        System.out.println("Enter the plan you want to get");
       Scanner scanner = new Scanner(System.in);
       String planName = scanner.nextLine();

        System.out.println("Enter the units");
        int units = scanner.nextInt();
        Plan plan = planFactory.getPlanType(planName);
        System.out.println("Bill amount for " + planName + "of" + units + "units is: ");
        plan.getRate();
        plan.calculateBill(units);
    }


}

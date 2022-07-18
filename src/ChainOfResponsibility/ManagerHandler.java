package ChainOfResponsibility;

public class ManagerHandler extends LeaveHandler{
    @Override
    public String approveRequest(Leave leave) {
        if(leave.getNumberOfDays() > 21){
            if(leave.getEmployeeTier() <=2  && !leave.getReason().equalsIgnoreCase("Regular")){
                return "Your leave has been approved";
            }


        }


            return "Your leave has been denied";

    }
}

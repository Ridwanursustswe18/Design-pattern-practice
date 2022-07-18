package ChainOfResponsibility;

public class HRHandler extends LeaveHandler{
    @Override
    public String approveRequest(Leave leave) {
        if(leave.getNumberOfDays() <= 21){
            if(leave.getEmployeeTier() <= 3 && !leave.getReason().equalsIgnoreCase("Regular")){
                return "Your leave has been approved";
            }
            else {
                return "Your leave has been denied";

            }
        }
        else {
            return nextLeaveHandler.approveRequest(leave);
        }
    }
}

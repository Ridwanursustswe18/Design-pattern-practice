package ChainOfResponsibility;

public class TeamLeaderHandler extends LeaveHandler{

    @Override
    public String approveRequest(Leave leave) {
        if(leave.getNumberOfDays() <= 7){
            if(leave.getEmployeeTier() <= 4){
                return "Your leave has been approved";
            }
            else {
                return "Your employee tier level is too low for request "+leave.getNumberOfDays();

            }
        }
        else {
            System.out.println(nextLeaveHandler.approveRequest(leave));
            return nextLeaveHandler.approveRequest(leave);
        }
}
}

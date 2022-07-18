package ChainOfResponsibility;

import java.util.logging.Handler;

public class ProjectLeaderHandler extends LeaveHandler {
    @Override
    public String approveRequest(Leave leave) {
        if(leave.getNumberOfDays() <= 14){
            if(leave.getEmployeeTier() <= 3){
                return "Your leave has been approved by project handler";
            }
            else {
                return "Your employee tier level is too low for request "+leave.getNumberOfDays();

            }
        }
        else {
            return nextLeaveHandler.approveRequest(leave);
        }
    }
}

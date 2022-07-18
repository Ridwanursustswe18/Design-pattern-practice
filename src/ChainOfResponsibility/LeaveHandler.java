package ChainOfResponsibility;

public abstract class LeaveHandler {
    LeaveHandler nextLeaveHandler;

    public void setNextLeaveHandler(LeaveHandler nextLeaveHandler) {
        this.nextLeaveHandler = nextLeaveHandler;
    }

    public abstract String approveRequest(Leave leave);
}

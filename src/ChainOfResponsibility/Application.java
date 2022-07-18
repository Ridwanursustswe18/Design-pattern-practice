package ChainOfResponsibility;

public class Application {
    public static void main(String[] args) {
        Leave leave = new Leave(15,3,"Critical");
        TeamLeaderHandler teamLeaderHandler = new TeamLeaderHandler();
        ProjectLeaderHandler projectLeaderHandler = new ProjectLeaderHandler();
        HRHandler hrHandler = new HRHandler();
        ManagerHandler managerHandler = new ManagerHandler();
        teamLeaderHandler.setNextLeaveHandler(projectLeaderHandler);
        projectLeaderHandler.setNextLeaveHandler(hrHandler);
        hrHandler.setNextLeaveHandler(managerHandler);
        System.out.println(teamLeaderHandler.approveRequest(leave));

    }
}

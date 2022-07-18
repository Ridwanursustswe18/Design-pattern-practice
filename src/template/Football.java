package template;

public class Football extends Game{
    @Override
    public void initialize() {
        System.out.println("EA sports ,its in the game....");
    }

    @Override
    public void start() {
        System.out.println("Click play to start the football match");
    }

    @Override
    public void end() {
        System.out.println("the football match ended");
    }
}

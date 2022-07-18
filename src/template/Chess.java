package template;

public class Chess extends Game{
    @Override
    public void initialize() {
        System.out.println("chess master ......");
    }

    @Override
    public void start() {
        System.out.println(" the chess game has started" );
    }

    @Override
    public void end() {
        System.out.println(" End the chess game :3");
    }
}

package Observer;

public class OctalObserver extends Subscriber{
    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.subscribe(this);
    };
    @Override
    public void update() {
        System.out.println("Octal String: " + Integer.toOctalString( subject.getState()));
    }
}

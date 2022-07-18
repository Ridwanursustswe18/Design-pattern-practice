package Observer;

public class BinaryObserver extends Subscriber {
    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.subscribe(this);
    }
    @Override
    public void update() {
        System.out.println("Binary String: " + Integer.toBinaryString( subject.getState()));
    }
}

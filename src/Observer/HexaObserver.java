package Observer;

public class HexaObserver extends Subscriber{
    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.subscribe(this);
       // this.subject.unsubscribe(this);
    }
    @Override
    public void update() {
        System.out.println("Hexadecimal String: " + Integer.toHexString( subject.getState()));
    }
}

package Observer;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

       Subscriber hexObserver =  new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);
        System.out.println("First state change");
        subject.setState(15);
        subject.unsubscribe(hexObserver);

        System.out.println("Second state change");
        subject.setState(10);
        System.out.println("third state change :");
        subject.subscribe(hexObserver);
        subject.setState(30);



    }
}

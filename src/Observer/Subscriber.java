package Observer;

public abstract class Subscriber {
    protected Subject subject;
    public abstract void update();
}

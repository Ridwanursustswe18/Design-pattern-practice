package Strategy;

public class Context {
    public Strategy strategy;
    public Context(Strategy strategy){
        this.strategy = strategy;
    }
    public String executeStrategy(String bookTitle){
      return strategy.bookTitleFormatter(bookTitle);
    }
}

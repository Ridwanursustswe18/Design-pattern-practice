package Strategy;

public class DemoFormatter {
    public static void main(String[] args) {
      Context context = new Context(new allLowercaseFormatter());
        System.out.println(context.executeStrategy("A brief history of time"));
      Context context1 = new Context(new oneLowercaseFormatter());
        System.out.println(context1.executeStrategy("A Brief history of time"));
        Context context2 = new Context(new uppercaseFormatter());
        System.out.println(context2.executeStrategy("A Brief history of time"));

    }
}

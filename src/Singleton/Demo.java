package Singleton;

public class Demo {
    public static void main(String[] args) {
        database sql = database.getInstance();
        String query = sql.query("insert into table(name);");
        System.out.println(query);
    }
}

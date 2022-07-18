package Singleton;

public class database {
    private static database instance ;
    private database(){}

    public static database getInstance() {
        if (instance == null){
            synchronized (database.class){
                if(instance == null){
                    instance = new database();
                }
            }
        }
        return instance;
    }
    public String query(String sql){
        return sql;
    }
}

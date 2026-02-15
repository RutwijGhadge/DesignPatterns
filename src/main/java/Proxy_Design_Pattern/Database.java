package Proxy_Design_Pattern;

public class Database {

    public Database() {
    }

    public void execute(String query, String id){
        System.out.println("Executing query "+ query+" on Database");
    }
}

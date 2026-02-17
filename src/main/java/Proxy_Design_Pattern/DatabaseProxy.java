package Proxy_Design_Pattern;

import java.util.Objects;

public class DatabaseProxy implements DataBaseExecutor{
    String id;
    Database db;

    public DatabaseProxy(String id) {
        db = new Database();
        this.id = id;
    }

    @Override
    public void executeQuery(String query) {
        if(query.equals("DELETE") && !Objects.equals(this.id,"ADMIN")){
            System.out.println("Cannot Execute Query , ADMIN Permission Needed");
            return;
        }
        db.execute(query,this.id); //Only Admin can execute the Query
    }
}

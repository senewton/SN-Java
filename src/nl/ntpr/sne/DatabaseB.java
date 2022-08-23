package nl.ntpr.sne;

import java.util.ArrayList;
import java.util.Arrays;

public class DatabaseB implements DataConnectionInterface {

    String[] dbTable = { "January", "February", "March", "April", "May", "June", "July",
            "August", "September", "October", "November", "December" } ;

    @Override
    public boolean openConnection(String password) {

        String masterPassword = "6789pqrs";

        if(password.equals(masterPassword)){
            System.out.println("Data Source B Open.");
            return true;
        }
        return false;
    }

    @Override
    public ArrayList<String> retrieveData(String query) {

        if(query.equals("select * from months")) {
            System.out.println("Database A: Executing query: " + query );
            return new ArrayList<>(Arrays.asList(dbTable));
        } else {
            System.out.println("Database B: Error: query not recognised.");
            return null;
        }
    }

    @Override
    public boolean closeConnection() {
        System.out.println("Database B: Closed connection");
        return true;
    }
}

package nl.ntpr.sne;

import java.util.ArrayList;
import java.util.List;

public class DatabaseB implements DataConnectionInterface {
    private boolean isOpen = false;
    private String masterPassword = "6789pqrs";

    ArrayList<String> dbTable ;

    @Override
    public boolean openConnection(String password) {
        if(password.equals(masterPassword)){
            System.out.println("Data Source B Open.");
            isOpen = true;
            return isOpen;
        }
        return isOpen;
    }

    @Override
    public ArrayList<String> retrieveData(String query) {
        if(isOpen==true ) {
            if(query.equals("select * from months")) {
                System.out.println("Database A: Executing query: " + query );
                dbTable = new ArrayList<>(List.of("January", "February", "March", "April", "May", "June", "July",
                        "August", "September", "October", "November", "December"));
                return dbTable;
            } else {
                System.out.println("Database B: Error: query not recognised.");
                return null;
            }
        } else{
            System.out.println("Database B: Error: connection not open.");
            return null;
        }
    }

    @Override
    public boolean closeConnection() {
        if(isOpen==true){
            isOpen = false;
            System.out.println("Database B: Closed connection");
            return isOpen;
        } else {
            System.out.println("Error: Database B already closed");
            return isOpen;
        }
    }
}

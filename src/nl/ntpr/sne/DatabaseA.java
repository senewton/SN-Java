package nl.ntpr.sne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DatabaseA implements DataConnectionInterface {
    private boolean isOpen = false;
    private String masterPassword = "1234abcd";

    ArrayList<String> dbTable ;

    @Override
    public boolean openConnection(String password) {
        if(password.equals(masterPassword)){
            System.out.println("Data Source A Open.");
            isOpen = true;
            return isOpen;
        }
        return isOpen;
    }

    @Override
    public ArrayList<String> retrieveData(String query) {
        if(isOpen==true ) {
            if(query.equals("select * from weekdays")) {
                System.out.println("Database A: Executing query: " + query );
                dbTable = new ArrayList<>(List.of("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
                return dbTable;
            } else {
                System.out.println("Database A: Error: query not recognised.");
                return null;
            }
        } else{
            System.out.println("Database A: Error: connection not open.");
            return null;
        }
    }

    @Override
    public boolean closeConnection() {
        if(isOpen==true){
            isOpen = false;
            System.out.println("Database A: Closed connection");
            return isOpen;
        } else {
            System.out.println("Error: Database A already closed");
            return isOpen;
        }
    }
}

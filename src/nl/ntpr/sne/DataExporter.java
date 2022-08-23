package nl.ntpr.sne;

import java.util.ArrayList;

public class DataExporter {
    public static void main(String[] args) {
        System.out.println("\n## Data Exporter Class");

        // 1. Read weekdays from source A
        DatabaseA dba = new DatabaseA();
        dba.openConnection("1234abcd");
        ArrayList<String> dbaResult = dba.retrieveData("select * from weekdays");
        dba.closeConnection();

        // 2. Read months from source B
        DatabaseB dbb = new DatabaseB();
        dbb.openConnection("6789pqrs");
        ArrayList<String> dbbResult = dbb.retrieveData("select * from months");
        dbb.closeConnection();

        // 3. Combine into one list
        ArrayList<String> dbCombined = new ArrayList<>();
        dbCombined.addAll(dbaResult);
        dbCombined.addAll(dbbResult);
        System.out.println("\n##Created Combined List: Size: " + dbCombined.size() );

        // 4. Export data as CSV

        // 5. Export data as XML
    }
}

package nl.ntpr.sne;

import java.util.ArrayList;

public class DataExporter {

    public static void main(String[] args) {
        System.out.println("\n## Data Exporter Class");

        // 1. Read weekdays from source A
        DatabaseA dba = new DatabaseA();
        dba.openConnection("1234abcd");
        ArrayList<String> dbaResult = dba.retrieveData("select * from weekdays");

        // 2. Read months from source B
        DatabaseB dbb = new DatabaseB();
        dbb.openConnection("6789pqrs");
        ArrayList<String> dbbResult = dbb.retrieveData("select * from months");

        // 3. Combine into one list
        ArrayList<String> dbCombined = new ArrayList<>();
        dbCombined.addAll(dbaResult);
        dbCombined.addAll(dbbResult);
        System.out.println("\n##Created Combined List: Size: " + dbCombined.size() );

        // 4. Export data as CSV
        System.out.println("\n##Exporting CSV File");
        CsvExporter csv = new CsvExporter("myexportfile", "csv");
        csv.openFile();
        csv.exportData(dbCombined);

        // 5. Export data as XML
        System.out.println("\n##Exporting XML File");
        XmlExporter xml = new XmlExporter("myexportfile", "xml");
        xml.openFile();
        xml.exportData(dbCombined);

        // 6. Close Connections
        closeConnection(dba);
        closeConnection(dbb);
        closeExporters(csv);
        closeExporters(xml);

    }

    private static void closeConnection(DataConnectionInterface dci){
        System.out.println("\n##Carrying out Cleanup: Closing database connections");
        dci.closeConnection();
    }

    private static void closeExporters(Exporter exp){
        System.out.println("\n##Carrying out Cleanup: Closing exporters");
        exp.closeFile();
    }
}

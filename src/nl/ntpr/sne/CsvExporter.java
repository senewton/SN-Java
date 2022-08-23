package nl.ntpr.sne;

import java.util.ArrayList;

public class CsvExporter extends Exporter{

    CsvExporter(String fileName, String fileType) {
        super(fileName, fileType);
    }

    @Override
    public int exportData(ArrayList<String> data) {
        int counter = 1;
        System.out.println("ID;Description");
        for(String s: data){
            System.out.println(counter + ";" + s);
            counter += 1;
        }
        return counter;
    }
}

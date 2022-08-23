package nl.ntpr.sne;

import java.util.ArrayList;

public class XmlExporter extends Exporter {

    XmlExporter(String fileName, String fileType) {
        super(fileName, fileType);
    }

    @Override
    public int exportData(ArrayList<String> data) {
        int counter = 1;
        System.out.println("<mydata>");
        for(String s: data){
            System.out.println("\t<record>");
            System.out.println("\t\t<id>" + counter + "</id>");
            System.out.println("\t\t<description>" + s + "</description>");
            System.out.println("\t</record>");
            counter += 1;
        }
        System.out.println("</mydata>");
        return counter;
    }
}

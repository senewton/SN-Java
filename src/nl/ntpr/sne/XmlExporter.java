package nl.ntpr.sne;

import java.util.ArrayList;

public class XmlExporter extends Exporter {
    XmlExporter(String fileName, String fileType) {
        super(fileName, fileType);
    }

    @Override
    public boolean exportData(ArrayList<String> data) {
        return false;
    }
}

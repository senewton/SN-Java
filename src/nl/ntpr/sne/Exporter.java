package nl.ntpr.sne;

import java.util.ArrayList;

public abstract class Exporter {
    private String filePath = "c:/home/code/SN-Java/";
    private String fileName = null;
    private String fileType = null;

    Exporter(String fileName, String fileType){
        this.fileName = fileName;
        this.fileType = fileType;
    }

    public boolean openFile(){
        System.out.println("Exporter: Opened output file: " + filePath + fileName + "." + fileType );
        return true;
    }

    abstract public boolean exportData(ArrayList<String> data);
}

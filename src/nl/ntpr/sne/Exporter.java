package nl.ntpr.sne;

import java.util.ArrayList;

public abstract class Exporter {

    private final String filePath = "c:/home/code/SN-Java/";

    private String fileName ;
    private String fileType ;

    Exporter(String fileName, String fileType){
        this.fileName = fileName;
        this.fileType = fileType;
    }

    public boolean openFile(){
        System.out.println("Exporter: Opened output file: " + filePath + fileName + "." + fileType );
        return true;
    }

    public boolean closeFile(){
        System.out.println("Exporter: Closed output file: " + filePath + fileName + "." + fileType );
        return true;
    }

    abstract public int exportData(ArrayList<String> data);


    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }
}

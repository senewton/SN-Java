package nl.ntpr.sne;

import java.util.ArrayList;

public interface DataConnectionInterface {
    boolean openConnection(String password);
    ArrayList<String> retrieveData(String query);
    boolean closeConnection();
}

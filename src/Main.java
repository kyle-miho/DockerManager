import com.database.manager.DatabaseManager;
import com.statemanager.StateManager;
import com.statemanager.constants.StateManagerConstants;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        StateManager stateManager = new StateManager();
        DatabaseManager databaseManager = new DatabaseManager();

        stateManager.promptNewAction();

        stateManager.promptNewDatabase(databaseManager);

        if (stateManager.getAction() == StateManagerConstants.START) {
            databaseManager.startContainer(stateManager.getDatabase());
        } else if (stateManager.getAction() == StateManagerConstants.STOP) {
            databaseManager.stopContainer(stateManager.getDatabase());
        }
    }
}

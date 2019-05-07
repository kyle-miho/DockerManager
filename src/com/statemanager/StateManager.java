package com.statemanager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import com.database.manager.DatabaseManager;
import com.statemanager.constants.StateManagerConstants;

public class StateManager {

    public int getAction() {
        return _action;
    }

    public int getDatabase() {
        return _database;
    }

    public void promptNewAction() throws IOException {
        String newAction = "";

        do {
            System.out.println("Do you want to start or stop a container? (START/STOP)");

            newAction = bufferedReader.readLine();
        } while (_validateNewAction(newAction) == false);

        if (newAction.equals("START")) {
            _action = StateManagerConstants.START;
        } else if (newAction.equals("STOP")) {
            _action = StateManagerConstants.STOP;
        }
    }

    //TODO add more than 1
    public void promptNewDatabase(DatabaseManager databaseManager) throws IOException {
        String newDatabase = "";

        do {
            System.out.println(
                "Which database do you want to use? " + databaseManager.getDatabaseNames());

            newDatabase = bufferedReader.readLine();
        } while (_validateNewDatabase(newDatabase) == false);

        if (newDatabase.equals("MYSQL")) {
            _database = StateManagerConstants.MYSQL;
        } else if (newDatabase.equals("SQL_SERVER")) {
            _database = StateManagerConstants.SQL_SERVER;
        }
    }

    private boolean _validateNewAction(String action) {
        if (action.equals("START") || action.equals("STOP")) {
            return true;
        }

        System.out.println("Error, '" + action + "' does not equal START/STOP");

        return false;
    }

    //TODO add more than 1
    private boolean _validateNewDatabase(String database) {
        if (database.equals("MYSQL") || database.equals("SQL_SERVER")) {
            return true;
        }

        System.out.println("Error, '" + database + "' does not equal MYSQL or SQL_SERVER");

        return false;
    }

    private int _action;
    private int _database;

    private BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
}

package com.database.manager;

import java.util.ArrayList;
import java.util.List;

import com.database.Database;
import com.database.mysql.Mysql;
import com.database.sqlserver.SqlServer;


public class DatabaseManager {

    public DatabaseManager() {
        //MYSQL
        databases.add(new Mysql());

        //SQL_SERVER
        databases.add(new SqlServer());
    }

    public void startContainer(int database) {
        System.out.println(database);

        databases.get(database).startContainer();
    }

    public void stopContainer(int database) {
        System.out.println(database);

        databases.get(database).stopContainer();
    }

    public List<Database> getDatabases() {
        return databases;
    }

    public List<String> getDatabaseNames() {
        List<String> databaseNames = new ArrayList<String>();

        for (int i = 0; i < databases.size(); ++i) {
            databaseNames.add(databases.get(i).getName());
        }

        return databaseNames;
    }

    private List<Database> databases = new ArrayList<Database>();
}

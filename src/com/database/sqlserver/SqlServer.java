package com.database.sqlserver;

import com.database.Database;

public class SqlServer extends Database {

    public SqlServer() {
        super();
    }

    public void startContainer() {
        System.out.println("Starting " + this.getName() + " container");
    }

    public void stopContainer() {
        System.out.println("Stopping " + this.getName() + " container");
    }
}

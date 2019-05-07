package com.database.mysql;

import com.database.Database;

public class Mysql extends Database {

    public Mysql() {
        super();
    }

    public void startContainer() {
        System.out.println("Starting " + this.getName() + " container");
    }

    public void stopContainer() {
        System.out.println("Stopping " + this.getName() + " container");
    }
}

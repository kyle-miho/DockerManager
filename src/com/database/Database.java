package com.database;

public abstract class Database implements BaseDatabaseModel {

    public Database() {
        _name = this.getClass().getSimpleName();
    }

    public String getName() { return _name; }

    public abstract void startContainer();

    public abstract void stopContainer();

    private String _name;
}

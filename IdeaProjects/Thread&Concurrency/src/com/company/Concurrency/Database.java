package com.company.Concurrency;

public class Database {
    private String Name;
    private static Database Instance;

    public static synchronized Database getInstance(String name) {
        if (null == Instance) {
            Instance = new Database(name);
        }

        return Instance;
    }
    private Database(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }
    @Override
    public String toString () {
        return String.format("Database Name : %s" , this.Name);
    }
}

package com.seanhu93.ood.creational.singleton;

public class Database {

    private static Database databaseInstance;

    private Database(String value) {

        // The following code emulates slow initialization, which makes race conditon easier to happen.
        try {
            Thread.sleep(1000); // 1 sec.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        text = value;
    }

    public static Database getInstance(String value) {

        // This implementation is vulnerable to race conditions
        // when multiple threads invokes getInstance() at the same time.
        if (databaseInstance == null) {
            databaseInstance = new Database(value);
        }
        return databaseInstance;
    }

    private String text;

    public String getText() {
        return text;
    }
}

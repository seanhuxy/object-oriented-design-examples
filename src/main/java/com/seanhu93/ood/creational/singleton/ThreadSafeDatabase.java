package com.seanhu93.ood.creational.singleton;

public class ThreadSafeDatabase {

    private static ThreadSafeDatabase databaseInstance;

    private ThreadSafeDatabase(String value) {

        // The following code emulates slow initialization, which makes race conditon easier to happen.
        try {
            Thread.sleep(1000); // 1 sec.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        text = value;
    }

    public static synchronized ThreadSafeDatabase getInstance(String value) {

        if (databaseInstance == null) {
            databaseInstance = new ThreadSafeDatabase(value);
        }
        return databaseInstance;
    }

    private String text;

    public String getText() {
        return text;
    }
}

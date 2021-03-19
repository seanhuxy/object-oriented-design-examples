package com.seanhu93.ood.creational.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DatabaseTest {

    @Test
    public void testDatabaseSingleThread() {

        Database d1 = Database.getInstance("d1");
        Database d2 = Database.getInstance("d2");

        Assertions.assertEquals(d1.getText(), d2.getText());
    }

    @Test
    public void testSingletonMultiThread() throws InterruptedException {

        int numberOfThreads = 10;
        ExecutorService service = Executors.newFixedThreadPool(numberOfThreads);
        CountDownLatch latch = new CountDownLatch(numberOfThreads);

        AtomicInteger nDatabases = new AtomicInteger(0);

        for (int i = 0; i < numberOfThreads; i++) {
            service.execute(() -> {
                String threadId = Thread.currentThread().getName();
                Database d = Database.getInstance(threadId);
                if (threadId.equals(d.getText())) {
                    log.info("Thread {}, text {} -- matched", threadId, d.getText());
                    nDatabases.incrementAndGet();
                } else {
                    log.info("Thread {}, text {} -- not matched", threadId, d.getText());
                }
                latch.countDown();
            });
        }
        latch.await();

        // If the singleton is thread safe, the result be should 1
        Assertions.assertNotEquals(nDatabases.get(), 1);
    }
}

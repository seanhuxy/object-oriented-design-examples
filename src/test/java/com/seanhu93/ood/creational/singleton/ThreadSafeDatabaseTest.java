package com.seanhu93.ood.creational.singleton;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ThreadSafeDatabaseTest {

    @Test
    public void testThreadSafeDatabaseSingleThread() {

        ThreadSafeDatabase d1 = ThreadSafeDatabase.getInstance("d1");
        ThreadSafeDatabase d2 = ThreadSafeDatabase.getInstance("d2");

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
                ThreadSafeDatabase d = ThreadSafeDatabase.getInstance(threadId);
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
        Assertions.assertEquals(nDatabases.get(), 1);
    }
}


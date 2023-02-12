package com.abndev.sample.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class SimpleThreadPool {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            Runnable worker = new WorkerThread("" + i, "" + i);
            executor.execute(worker);
        }
        executor.shutdown();
        while (!executor.isTerminated()) {
            // wait
        }

        LOG.info("Finished ALL Threads.");
    }
}

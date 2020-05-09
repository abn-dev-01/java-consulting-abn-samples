package com.abndev.sample.threadpool;

import org.slf4j.Logger;

public class WorkerThread
        implements Runnable {

    private static final Logger LOG = org.slf4j.LoggerFactory.getLogger(WorkerThread.class);
    private final String name;

    private String command;

    /**
     * Constructor.
     *
     * @param command
     */
    public WorkerThread(String command, String name) {
        this.command = command;
        this.name = name;
    }

    @Override
    public void run() {
        Thread.currentThread().setName("Thread_" + name);
        LOG.info("{} Start. Command = {}", Thread.currentThread().getName(), command);
        processCommand();
        LOG.info("{} End. Command = {}", Thread.currentThread().getName(), command);
    }

    private void processCommand() {
        try {
            final long sleepTime = 1000 + Math.round(Math.random() * 10000);
            LOG.info(" > {} sleep: {}", Thread.currentThread().getName(), sleepTime);
            Thread.sleep(sleepTime);
        }
        catch (InterruptedException e) {
            LOG.error("Thread interrupted. ", e);
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("WorkerThread{");
        sb.append("command='").append(command).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

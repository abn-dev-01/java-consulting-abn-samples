package com.abndev.sample.threadpool.monitor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

public class RejectedExecutionHandlerImpl
        implements RejectedExecutionHandler {

    private static final Logger LOG = LoggerFactory.getLogger(RejectedExecutionHandlerImpl.class);

    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        LOG.info("{} is rejected", executor.toString());
    }

}

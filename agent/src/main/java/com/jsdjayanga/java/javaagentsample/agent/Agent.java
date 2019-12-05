package com.jsdjayanga.java.javaagentsample.agent;

import java.lang.instrument.Instrumentation;
import java.util.logging.Logger;

public class Agent {
    private static final Logger logger = Logger.getLogger(Agent.class.getName());

    public static void premain(String agentArgs, Instrumentation inst) {
        logger.info("Thread Id:" + Thread.currentThread().getId() + ", Thread Name:" + Thread.currentThread().getName());
    }
}

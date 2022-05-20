package com.studionode.chatwizard;

import java.util.Arrays;
import java.util.logging.Logger;

public class Debug {
    private static Logger logger;

    public static void setLogger(Logger logger) {
        Debug.logger = logger;
    }

    public static void consoleInfo(String... messages) {
        StringBuilder builder = new StringBuilder();
        Arrays.stream(messages).forEach(message1 -> builder.append(message1).append(" "));
        consoleInfo(builder.toString());
    }
    public static void consoleInfo(String message) {
        logger.info(message);
    }

    public static void consoleWarn(String... messages) {
        StringBuilder builder = new StringBuilder();
        Arrays.stream(messages).forEach(message1 -> builder.append(message1).append(" "));
        consoleWarn(builder.toString());
    }
    public static void consoleWarn(String message) {
        logger.warning(message);
    }

    public static void consoleError(String... messages) {
        StringBuilder builder = new StringBuilder();
        Arrays.stream(messages).forEach(message1 -> builder.append(message1).append(" "));
        consoleError(builder.toString());
    }
    public static void consoleError(String message) {
        logger.severe(message);
    }
}

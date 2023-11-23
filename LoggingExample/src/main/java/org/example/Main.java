package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Error world!");
        System.out.println("Hello world!");

        Logger logger1 =Logger.getInstance();
        Logger logger2 =Logger.getInstance();
        System.out.println("Are both loggers of the same reference? " + (logger1 == logger2));

        logger1.setLogLevel(LogLevel.TRACE);
        System.out.println("\nTRACE level defined.... ");
        logger1.log(LogLevel.TRACE, "trace level log message");
        logger1.log(LogLevel.DEBUG, "debug level log message");
        logger1.log(LogLevel.INFO, "info level log message");
        logger1.log(LogLevel.WARN, "info level log message");
        logger1.log(LogLevel.ERROR, "error level log message");

        // Display all logged message
        System.out.println("Displaying all logged messages...");
        logger1.displayLogs();
    }
}
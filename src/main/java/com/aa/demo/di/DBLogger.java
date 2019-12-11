package com.aa.demo.di;

public class DBLogger implements ILogger {
    @Override
    public void log() {
        System.out.println("I am logging at the database");
    }
}

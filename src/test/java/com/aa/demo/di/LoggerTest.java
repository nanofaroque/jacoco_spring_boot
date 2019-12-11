package com.aa.demo.di;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class LoggerTest {
    ILogger consoleLogger,databeLogger;

    @BeforeEach
    public void init() {
        consoleLogger = Mockito.mock(ConsoleLogger.class);
        databeLogger=Mockito.mock(DBLogger.class);
    }

    @Test
    public void whenLoggerIsConsoleLogger() {
        consoleLogger.log();
        verify(consoleLogger, times(1)).log();
    }


    @Test
    public void whenLoggerIsDatabaseLogger() {
        databeLogger.log();
        verify(databeLogger, times(1)).log();
    }
}

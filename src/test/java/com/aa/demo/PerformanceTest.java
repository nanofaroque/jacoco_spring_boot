package com.aa.demo;

import com.github.noconnor.junitperf.JUnitPerfRule;
import com.github.noconnor.junitperf.JUnitPerfTest;
import com.github.noconnor.junitperf.reporting.providers.ConsoleReportGenerator;
import com.github.noconnor.junitperf.reporting.providers.CsvReportGenerator;
import com.github.noconnor.junitperf.reporting.providers.HtmlReportGenerator;
import com.github.noconnor.junitperf.statistics.StatisticsCalculator;
import org.junit.Rule;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

public class PerformanceTest {
    @Rule
    public JUnitPerfRule perfTestRule = new JUnitPerfRule(new ConsoleReportGenerator());


    @Test
    @JUnitPerfTest(threads = 500000, durationMs = 125_000, rampUpPeriodMs = 2_000, warmUpMs = 10_000, maxExecutionsPerSecond = 11_000)
    public void whenExecuting11Kqps_thenApiShouldNotCrash() throws InterruptedException {
        TimeUnit.SECONDS.sleep(10L);
    }
}

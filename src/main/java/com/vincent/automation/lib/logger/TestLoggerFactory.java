package com.vincent.automation.lib.logger;

import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;

public class TestLoggerFactory implements LoggerFactory
{
    @Override
    public Logger makeNewLoggerInstance(String name)
    {
        return new TestLogger(name);
    }
}

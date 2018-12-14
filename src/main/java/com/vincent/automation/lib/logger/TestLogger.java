package com.vincent.automation.lib.logger;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class TestLogger extends Logger
{
    private static final TestLoggerFactory                 s_factory  = new TestLoggerFactory();
    private static final List<ErrorLog<String, ErrorType>> s_errors   = Collections
            .synchronizedList(new ArrayList<ErrorLog<String, ErrorType>>());
    private static final List<String>                      s_warnings = Collections
            .synchronizedList(new ArrayList<String>());

    protected TestLogger(String name)
    {
        super(name);
    }

    @Override
    public void error(Object message)
    {
        s_errors.add(new ErrorLog<String, ErrorType>(String.valueOf(message), ErrorType.UNVERIFIED));
        super.error(message);
    }

    public void error(Object message, ErrorType type)
    {
        s_errors.add(new ErrorLog<String, ErrorType>(String.valueOf(message), type));
        super.error(message);
    }

    @Override
    public void fatal(Object message)
    {
        s_errors.add(new ErrorLog<String, ErrorType>(String.valueOf(message), ErrorType.UNVERIFIED));
        super.fatal(message);
    }

    public void fatal(Object message, ErrorType type)
    {
        s_errors.add(new ErrorLog<String, ErrorType>(String.valueOf(message), type));
        super.fatal(message);
    }

    @Override
    public void warn(Object message)
    {
        s_warnings.add(String.valueOf(message));
        super.warn(message);
    }

    @Override
    public void debug(Object message)
    {
        super.debug(message);
    }

    @Override
    public void info(Object message)
    {
        super.info(message);
    }

    public static Logger getLogger(@SuppressWarnings("rawtypes") Class clazz)
    {
        return Logger.getLogger(clazz.getSimpleName(), s_factory);
    }

    public static Logger getLogger(String name)
    {
        return Logger.getLogger(name, s_factory);
    }

    public static void clearComments()
    {
        s_errors.clear();
        s_warnings.clear();
    }

    public static List<ErrorLog<String, ErrorType>> errors()
    {
        return s_errors;
    }

    public static List<String> warnings()
    {
        return s_warnings;
    }

    // public static Logger setupLogger(String logFilepath, Class<?> clazz)
    // {
    // URL log4jUrl = null;
    //
    // new File(logFilepath).mkdirs();
    // log4jUrl =
    // TestLogger.class.getClassLoader().getResource("log4j.properties");
    //
    // if (log4jUrl == null) {
    // throw new NullPointerException();
    // }
    //
    // System.setProperty("LOG_PATH", logFilepath);
    // PropertyConfigurator.configure(log4jUrl);
    // return TestLogger.getLogger(clazz.getName());
    // }
}

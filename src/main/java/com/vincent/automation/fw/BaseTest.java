package com.vincent.automation.fw;

import org.apache.commons.lang3.StringUtils;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.vincent.automation.fw.parameter.TestObjects;
import com.vincent.automation.lib.logger.TestLogger;

public abstract class BaseTest<T extends TestObjects> implements BaseInterface<T>
{
    protected final TestLogger LOGGER = (TestLogger) TestLogger.getLogger(this.getClass());

    protected T                m_testObjects;

    @BeforeSuite
    public void beforeSuite(ITestContext context) throws Exception
    {
        setTestStep("@BeforeSuite");
    }

    @BeforeTest
    public void beforeTest()
    {
        setTestStep("@BeforeTest");
    }

    @BeforeClass
    public void beforeClass()
    {
        setTestStep("@BeforeClass");
    }

    @Test
    public void test(ITestContext context)
    {
        setTestStep("@Test");

    }

    protected void setTestStep(String str)
    {
        int asterisk = (100 - str.length()) / 2;
        String msg = StringUtils.repeat("=", asterisk) + str
                + StringUtils.repeat("=", asterisk + (100 - str.length()) % 2);
        LOGGER.info(msg);
    };
}

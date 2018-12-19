package com.vincent.automation.fw.parameter;

import java.util.Map;

import com.vincent.automation.lib.logger.TestLogger;

public abstract class TestObjectsImpl implements TestObjects
{
    protected TestLogger                    LOGGER = (TestLogger) TestLogger.getLogger(this.getClass());

    protected final Map<Parameters, String> m_params;

    public TestObjectsImpl(Map<Parameters, String> params)
    {
        m_params = params;
    }

    @Override
    public void add(Map<Parameters, String> map)
    {
        m_params.putAll(map);
    }

}

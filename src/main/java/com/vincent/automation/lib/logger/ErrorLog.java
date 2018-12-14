package com.vincent.automation.lib.logger;

public class ErrorLog<M, N>
{
    private final M m_text;
    private final N m_type;

    public ErrorLog(M text, N type)
    {
        m_text = text;
        m_type = type;
    }

    public M text()
    {
        return m_text;
    }

    public N type()
    {
        return m_type;
    }
}

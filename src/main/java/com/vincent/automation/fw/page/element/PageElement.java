package com.vincent.automation.fw.page.element;

import org.openqa.selenium.WebElement;

import com.vincent.automation.fw.utils.ByType;

public abstract class PageElement
{
    private final WebElement m_element;
    private final ByType     m_type;
    private final String     m_id;

    public PageElement(WebElement element, ByType type, String id)
    {
        m_element = element;
        m_type = type;
        m_id = id;
    }

    public PageElement(WebElement element)
    {
        m_element = element;
        m_type = ByType.UNKNOWN;
        m_id = "";
    }

    public WebElement element()
    {
        return m_element;
    }

    protected ByType type()
    {
        return m_type;
    }

    protected String id()
    {
        return m_id;
    }
}

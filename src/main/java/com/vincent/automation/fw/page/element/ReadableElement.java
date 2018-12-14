package com.vincent.automation.fw.page.element;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

import com.vincent.automation.fw.page.element.action.Readable;
import com.vincent.automation.fw.utils.ByType;

public class ReadableElement extends PageElement implements Readable
{
    public ReadableElement(SearchContext element, ByType type, String id)
    {
        super((WebElement) element, type, id);
    }

    public ReadableElement(SearchContext element)
    {
        super((WebElement) element);
    }

    @Override
    public String read()
    {
        return element().getText();
    }

    @Override
    public boolean isEnabled()
    {
        return element().isEnabled();
    }

    @Override
    public boolean isDisplayed()
    {
        return element().isDisplayed();
    }
}

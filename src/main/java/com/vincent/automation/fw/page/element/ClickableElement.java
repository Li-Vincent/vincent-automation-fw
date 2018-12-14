package com.vincent.automation.fw.page.element;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

import com.vincent.automation.fw.page.element.action.Clickable;
import com.vincent.automation.fw.utils.ByType;

public class ClickableElement extends PageElement implements Clickable
{
    public ClickableElement(SearchContext element, ByType type, String id)
    {
        super((WebElement) element, type, id);
    }

    public ClickableElement(SearchContext element)
    {
        super((WebElement) element);
    }

    @Override
    public void click()
    {
        element().click();
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

    @Override
    public boolean isClicked()
    {
        return element().isSelected();
    }

}

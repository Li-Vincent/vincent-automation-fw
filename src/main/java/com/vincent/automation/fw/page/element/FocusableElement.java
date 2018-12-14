package com.vincent.automation.fw.page.element;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.vincent.automation.fw.page.element.action.Focusable;
import com.vincent.automation.fw.utils.ByType;

public class FocusableElement extends PageElement implements Focusable
{
    public FocusableElement(SearchContext element, ByType type, String id)
    {
        super((WebElement) element, type, id);
    }

    public FocusableElement(SearchContext element)
    {
        super((WebElement) element);
    }

    @Override
    public void focus(WebDriver driver)
    {
        Actions actions = new Actions(driver);
        actions.moveToElement(element()).build().perform();
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

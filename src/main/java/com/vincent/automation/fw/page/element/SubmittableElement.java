package com.vincent.automation.fw.page.element;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.vincent.automation.fw.page.element.action.Slidable;
import com.vincent.automation.fw.page.element.action.Submittable;
import com.vincent.automation.fw.utils.ByType;

public class SubmittableElement extends PageElement implements Submittable
{

    public SubmittableElement(SearchContext element, ByType type, String id)
    {
        super((WebElement) element, type, id);
    }

    public SubmittableElement(SearchContext element)
    {
        super((WebElement) element);
    }

    @Override
    public boolean submit()
    {
        element().submit();
        return true;
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

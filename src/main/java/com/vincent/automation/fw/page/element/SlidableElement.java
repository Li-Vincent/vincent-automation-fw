package com.vincent.automation.fw.page.element;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.vincent.automation.fw.page.element.action.Slidable;
import com.vincent.automation.fw.utils.ByType;

public class SlidableElement extends PageElement implements Slidable
{

    public SlidableElement(SearchContext element, ByType type, String id)
    {
        super((WebElement) element, type, id);
    }

    public boolean slide(WebDriver driver, int minValue, int maxValue, int targetMinValue, int targetMaxValue)
    {
        // TODO Auto-generated method stub
        return false;
    }

    public SlidableElement(SearchContext element)
    {
        super((WebElement) element);
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

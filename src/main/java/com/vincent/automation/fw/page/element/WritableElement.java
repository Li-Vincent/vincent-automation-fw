package com.vincent.automation.fw.page.element;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

import com.vincent.automation.fw.page.element.action.Writable;
import com.vincent.automation.fw.utils.ByType;

public class WritableElement extends PageElement implements Writable
{
    private static final int STRING_LENGTH = 500;

    public WritableElement(SearchContext element, ByType type, String id)
    {
        super((WebElement) element, type, id);
    }

    public WritableElement(SearchContext element)
    {
        super((WebElement) element);
    }

    public void write(String str)
    {
        element().clear();
        if (StringUtils.isEmpty(str) || str.length() < STRING_LENGTH) {
            element().sendKeys(str);
        } else {
            writeLongKeys(str, STRING_LENGTH);
        }
        element().sendKeys(Keys.ESCAPE);
    }

    public void append(String str)
    {
        element().sendKeys(str);
    }

    private void writeLongKeys(String str, int maxLength)
    {
        int size = (str.length() % maxLength == 0) ? (str.length() / maxLength) : (str.length() / maxLength) + 1;
        for (int i = 0; i < size; i++) {
            String divideStr = divideString(str, i * maxLength, (i + 1) * maxLength);
            element().sendKeys(divideStr);
        }
    }

    private String divideString(String str, int beginIndex, int endIndex)
    {
        if (beginIndex > str.length()) {
            return "";
        }
        if (endIndex > str.length()) {

        }
        return str.substring(beginIndex, endIndex);
    }

    public String read()
    {
        return element().getText();
    }

    public boolean isEnabled()
    {
        return element().isEnabled();
    }

    public boolean isDisplayed()
    {
        return element().isDisplayed();
    }

}

package com.vincent.automation.fw.page.element.action;

import org.openqa.selenium.WebElement;

/**
 * Action for all element
 * 
 * @author Li-Vincent
 *
 */
public interface WebElementAction
{
    WebElement element();

    boolean isEnabled();

    boolean isDisplayed();
}

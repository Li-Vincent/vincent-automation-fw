package com.vincent.automation.fw.page.element.action;

import org.openqa.selenium.WebDriver;

/**
 * Action for focusable element.
 * 
 * @author Li-Vincent
 */
public interface Focusable extends WebElementAction
{
    void focus(WebDriver driver);
}

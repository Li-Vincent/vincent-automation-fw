package com.vincent.automation.fw.page.element.action;

import org.openqa.selenium.WebDriver;

/**
 * Action for Slidable element like slider, range slider, etc.
 * 
 * @author Li-Vincent
 */
public interface Slidable extends WebElementAction
{
    boolean slide(WebDriver driver, int minValue, int maxValue,
            int targetMinValue, int targetMaxValue);
}

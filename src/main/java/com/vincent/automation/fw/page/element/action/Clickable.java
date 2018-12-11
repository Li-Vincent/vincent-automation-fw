package com.vincent.automation.fw.page.element.action;

/**
 * Action for clickable element like button, radio button, check box, tick box,
 * etc.
 * 
 * @author Li-Vincent
 */
public interface Clickable extends WebElementAction
{
    void click();

    boolean isClicked();
}

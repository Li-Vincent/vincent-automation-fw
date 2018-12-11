package com.vincent.automation.fw.page.element.action;

/**
 * Action for readable element like button, radio button, check box, tick box,
 * Be careful:there are lots of Readable interface in Java API 
 * @author Li-Vincent
 *
 */
public interface Readable extends WebElementAction
{
    String read();
}

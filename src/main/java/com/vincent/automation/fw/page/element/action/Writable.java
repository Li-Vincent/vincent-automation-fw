package com.vincent.automation.fw.page.element.action;

/**
 * Action for writable element like input box.
 * 
 * @author Li-Vincent
 */
public interface Writable extends Readable, WebElementAction
{
    void write(String str);

    void append(String str);
}

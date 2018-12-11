package com.vincent.automation.fw.page.element.action;

/**
 * Action for service of upload file,photos etc.
 * 
 * @author Li-Vincent
 */
public interface Uploadable extends WebElementAction
{
    boolean uploadFile(String filePath);
}

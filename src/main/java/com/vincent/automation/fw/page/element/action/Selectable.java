package com.vincent.automation.fw.page.element.action;

/**
 * Action for Selectable element like DropdownList, ListBox, etc.
 * 
 * @author Li-Vincent
 */
public interface Selectable extends WebElementAction
{
    void select(int index);

    void selectByValue(String str);

    void selectByText(String str);
}

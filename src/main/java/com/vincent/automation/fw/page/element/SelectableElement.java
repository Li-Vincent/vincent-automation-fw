package com.vincent.automation.fw.page.element;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.vincent.automation.fw.page.element.action.Selectable;
import com.vincent.automation.fw.utils.ByType;

public class SelectableElement extends PageElement implements Selectable
{
    public SelectableElement(SearchContext element, ByType type, String id)
    {
        super((WebElement) element, type, id);
    }

    public SelectableElement(SearchContext element)
    {
        super((WebElement) element);
    }

    public void select(int index)
    {
        Select select = new Select(element());
        select.selectByIndex(index);
    }

    public void selectByValue(String str)
    {
        Select select = new Select(element());
        select.selectByValue(str);
    }

    public void selectByText(String str)
    {
        Select select = new Select(element());
        // if target value has already been selected, just return
        List<WebElement> selection = select.getAllSelectedOptions();
        for (WebElement selected : selection) {
            if (!StringUtils.isEmpty(selected.getText()) && selected.getText().equalsIgnoreCase(str)) {
                return;
            }
        }
        select.selectByVisibleText(str);
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

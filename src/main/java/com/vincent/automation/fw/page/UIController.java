package com.vincent.automation.fw.page;

import org.openqa.selenium.SearchContext;

import com.vincent.automation.fw.page.element.action.Clickable;
import com.vincent.automation.fw.page.element.action.Submittable;
import com.vincent.automation.fw.page.element.action.Writable;
import com.vincent.automation.fw.utils.ByType;

public interface UIController
{
    public abstract boolean click(Clickable element);

    public abstract boolean isClicked(Clickable element);

    public abstract boolean submit(Submittable element);

    public abstract boolean write(Writable element, String str);

    public abstract boolean hasElement(ByType by, String id);

    public abstract boolean hasElement(SearchContext context, ByType by, String id);

    public abstract boolean getElement(SearchContext context, ServiceElement element, String id);
}

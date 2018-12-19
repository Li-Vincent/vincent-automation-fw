package com.vincent.automation.fw.page;

import com.vincent.automation.fw.page.element.action.WebElementAction;
import com.vincent.automation.fw.utils.ByType;

public interface ServiceElement
{
    public ByType byType();

    public Class<? extends WebElementAction> action();
}

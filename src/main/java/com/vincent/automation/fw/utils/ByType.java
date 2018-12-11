package com.vincent.automation.fw.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.By.*;
import org.openqa.selenium.support.ByIdOrName;

public enum ByType {
    BY_ID(ById.class),
    BY_NAME(ByName.class),
    BY_ID_OR_NAME(ByIdOrName.class),
    BY_CLASS_NAME(ByClassName.class),
    BY_CSS_SELECTOR(ByCssSelector.class),
    BY_LINK_TEXT(ByLinkText.class),
    BY_PARTIAL_LINK_TEXT(ByPartialLinkText.class),
    BY_TAG_NAME(ByTagName.class),
    BY_X_PATH(ByXPath.class),
    UNKNOWN(By.class);

    Class<? extends By> m_by;

    ByType(Class<? extends By> by)
    {
        m_by = by;
    }

    public Class<? extends By> val()
    {
        return m_by;
    }

    public static ByType getType(Class<? extends By> by)
    {
        for (ByType type : values()) {
            if (type.val().equals(by)) {
                return type;
            }
        }
        return UNKNOWN;
    }
}

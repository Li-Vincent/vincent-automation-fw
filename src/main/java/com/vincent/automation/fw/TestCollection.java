package com.vincent.automation.fw;

import com.vincent.automation.fw.parameter.TestObjects;

public interface TestCollection<T extends TestObjects>
{
    T testObjects();
}

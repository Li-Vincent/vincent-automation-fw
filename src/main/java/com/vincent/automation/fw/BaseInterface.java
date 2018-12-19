package com.vincent.automation.fw;

import com.vincent.automation.fw.parameter.TestObjects;

@FunctionalInterface
public interface BaseInterface<T extends TestObjects>
{
    T testObjects();
}

package com.vincent.automation.fw.parameter;

import java.util.Map;

public interface TestObjects
{
    final String YES = "yes";
    final String NO  = "no";

    void purge();

    void add(Map<Parameters, String> map);
}

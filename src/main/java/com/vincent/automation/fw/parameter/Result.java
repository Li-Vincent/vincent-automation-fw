package com.vincent.automation.fw.parameter;

public enum Result {
    PASS(1),
    FAIL(2),
    SKIP(3),
    UNKNOWN(0);
    int m_val;

    Result(int val)
    {
        m_val = val;
    }

    public int val()
    {
        return m_val;
    }

    public boolean passed()
    {
        return m_val == 1;
    }

    public boolean failed()
    {
        return m_val != 1;
    }

    public boolean skiped()
    {
        return m_val == 2;
    }

    public static Result get(int result)
    {
        for (Result res : values()) {
            if (res.val() == result) {
                return res;
            }
        }
        return UNKNOWN;
    }
}

package com.vincent.automation.lib.logger;

public enum ErrorType implements Parameters {

    TIME_OUT("Timeout Exception"),
    SERVER_ERROR("Server Error"),
    PROXY_ISSUE("Proxy Issue"),
    NO_TEST_DATA("No Test Data"),
    TEST_PARAMETERS_ERROR("Test parameters error"),
    UNAUTHORIZED_ERROR("Unauthorized Error"),
    PAGE_LOAD_ERROR("Page Load Error"),
    PROBABLE_BUG("Probable Bug"),
    UNVERIFIED("Unverified"),
    UNKNOWN("unknown error type");
    private String m_val;

    private ErrorType(String val)
    {
        m_val = val;
    }

    @Override
    public String val()
    {
        return m_val;
    }

    @Override
    public Parameters unknown()
    {
        return UNKNOWN;
    }

}

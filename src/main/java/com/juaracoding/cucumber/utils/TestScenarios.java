package com.juaracoding.cucumber.utils;

public enum TestScenarios {
	
	T1("TC01 form contact"),
	T2("TC02 form contact"),
	T3("TC03 form contact"),
	T4("TC04 form contact"),
	T5("TC05 form contact"),
	T6("TC06 form contact"),
    T7("tcc07 form contact invalid email"),
    T8("tcc08 form contact invalid Phone number");

    private String testName;

    TestScenarios(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }

}

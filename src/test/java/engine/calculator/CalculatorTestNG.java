package engine.calculator;

import org.testng.Assert;

public class CalculatorTestNG {
    Calculator test = new Calculator();
    @org.testng.annotations.BeforeMethod
    public void setUp() throws Exception {


    }

    @org.testng.annotations.AfterMethod
    public void tearDown() throws Exception {

    }

    @org.testng.annotations.Test
    public void testAddition() throws Exception {
        int addValue = test.addition(10, 12);
        Assert.assertEquals(22, addValue);
    }

    @org.testng.annotations.Test
    public void testSubtraction() throws Exception {

    }

    @org.testng.annotations.Test
    public void testMultiply() throws Exception {

    }

    @org.testng.annotations.Test
    public void testDivide() throws Exception {

    }

}
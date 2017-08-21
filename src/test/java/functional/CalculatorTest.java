package functional;

import engine.calculator.Calculator;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(SerenityRunner.class)
public class CalculatorTest {

    Calculator test= new Calculator();

    @Test
    @WithTagValuesOf({"epic:calculator", "stories:add_operation"})
    @Title(value = "Addition test 1")
    public void addTest(){
        int addValue = test.addition(10, 12);
        Assert.assertEquals(22, addValue);
    }

    @Test
    @WithTagValuesOf({"epic:calculator", "stories:sub_operation"})
    public void subTest(){
        int subValue = test.subtraction(10, 12);
        Assert.assertEquals(2, subValue);
    }

    @Test
    @WithTagValuesOf({"epic:calculator", "stories:add_operation", "stories:sub_operation"})
    @Pending
    public void multiplyTest(){
        int multiply = test.multiply(10, 12);
        Assert.assertEquals(120, multiply);
    }

    @Test
    @WithTagValuesOf({"epic:calculator", "stories:sub_operation"})
    public void divisionTest(){
        int divide = test.divide(10, 10);
        Assert.assertEquals(1, divide);
    }

    public void addTest1(){
        int addValue = test.addition(100000000, 120000000);
        Assert.assertEquals(22, addValue);
    }

    @Test
    @Ignore
    public void subTest1(){
        int subValue = test.subtraction(10, 12);
        Assert.assertEquals(-2, subValue);
    }

    @Test
    public void multiplyTest1(){
        int multiply = test.multiply(10, 12);
        Assert.assertEquals(120, multiply);
    }

    @Test
    public void divisionTest1(){
        int divide = test.divide(10, 10);
        Assert.assertEquals(1, divide);
    }

    @Test
    public void addTest2(){
        int addValue = test.addition(10, 12);
        Assert.assertEquals(2, addValue);
    }

    @Test
    public void subTest2(){
        int subValue = test.subtraction(10, 12);
        Assert.assertEquals(-23, subValue);
    }

    @Test
    public void multiplyTest2(){
        int multiply = test.multiply(10, 12);
        Assert.assertEquals(120, multiply);
    }

    @Test
    public void divisionTest2(){
        int divide = test.divide(10, 10);
        Assert.assertEquals(10, divide);
    }

    @Test
    public void addTest4(){
        int addValue = test.addition(10, 12);
        Assert.assertEquals(22, addValue);
    }

    @Test
    public void subTest4(){
        int subValue = test.subtraction(10, 12);
        Assert.assertEquals(-2, subValue);
    }

    @Test
    public void multiplyTest4(){
        int multiply = test.multiply(10, 12);
        Assert.assertEquals(10, multiply);
    }

    @Test
    public void divisionTest4(){
        int divide = test.divide(10, 10);
        Assert.assertEquals(10, divide);
    }

}

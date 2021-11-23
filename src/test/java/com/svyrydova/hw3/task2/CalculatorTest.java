package com.svyrydova.hw3.task2;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class CalculatorTest {

    private UserInput userInputMock;
    Calculator calculator = new Calculator();

    @Before
    public void setUp() {
        userInputMock = Mockito.mock(UserInput.class);
    }

    @Test
    public void getSum() {
        Mockito.when(userInputMock.addSymbol()).thenReturn('+');
        Mockito.when(userInputMock.addNum1()).thenReturn(5.0d);
        Mockito.when(userInputMock.addNum2()).thenReturn(7.0d);
        double actual = calculator.getResult(userInputMock);
        double expected = 12.0d;
        assertEquals(expected, actual, 0.0d);
    }

    @Test
    public void getMinus() {
        Mockito.when(userInputMock.addSymbol()).thenReturn('-');
        Mockito.when(userInputMock.addNum1()).thenReturn(7.0d);
        Mockito.when(userInputMock.addNum2()).thenReturn(3.0d);
        double actual = calculator.getResult(userInputMock);
        double expected = 4.0d;
        assertEquals(expected, actual, 0.0d);
    }

    @Test
    public void getMultiply() {
        Mockito.when(userInputMock.addSymbol()).thenReturn('*');
        Mockito.when(userInputMock.addNum1()).thenReturn(3.0d);
        Mockito.when(userInputMock.addNum2()).thenReturn(7.0d);
        double actual = calculator.getResult(userInputMock);
        double expected = 21.0d;
        assertEquals(expected, actual, 0.0d);
    }

    @Test
    public void getDiv() {
        Mockito.when(userInputMock.addSymbol()).thenReturn('/');
        Mockito.when(userInputMock.addNum1()).thenReturn(25.0d);
        Mockito.when(userInputMock.addNum2()).thenReturn(5.0d);
        double actual = calculator.getResult(userInputMock);
        double expected = 5.0d;
        assertEquals(expected, actual, 0.0d);
    }

    @Test
    public void getNull() {
        Mockito.when(userInputMock.addSymbol()).thenReturn('0');
        double actual = calculator.getResult(userInputMock);
        double expected = -5.0d;
        assertEquals(expected, actual, 0.0d);
    }

    @Test
    public void getDefault() {
        Mockito.when(userInputMock.addSymbol()).thenReturn('!');
        double actual = calculator.getResult(userInputMock);
        double expected = -2.0d;
        assertEquals(expected, actual, 0.0d);
    }

    @Test
    public void getDivNull() {
        Mockito.when(userInputMock.addSymbol()).thenReturn('/');
        Mockito.when(userInputMock.addNum1()).thenReturn(10.0d);
        Mockito.when(userInputMock.addNum2()).thenReturn(0.0d);
        double actual = calculator.getResult(userInputMock);
        double expected = -3.0d;
        assertEquals(expected, actual, 0.0d);
    }
}
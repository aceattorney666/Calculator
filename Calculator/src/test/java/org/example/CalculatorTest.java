package org.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void divide() {
        double result = calculator.divide(10, 2);
        assertEquals(5, result, 0);
    }

    @Test
    public void sum() {
        double[] sumInputs = {1, 2, 3};
        double result = calculator.sum(sumInputs);
        assertEquals(6,result, 0);
    }

    @Test
    public void sumWithNegativeNumbers() {
        double[] sumInputs = {-1,-2,-3};
        double result = calculator.sum(sumInputs);
        assertEquals(-6, result, 0);
    }

    @Test
    public void CommutativeSum() {
        double[] sumInputs = {2, 1, 3};
        double[] SumInputsAlt = {1, 2, 3};
        double resultAlt = calculator.sum(SumInputsAlt);
        double result = calculator.sum(sumInputs);
        boolean isSame = result == resultAlt;
        assertTrue(isSame);
    }

    @Test
    public void Multiplication() {
        double[] productInputs = {5, 2, 3};
        double result = calculator.Multiplication(productInputs);
        assertEquals(30, result, 0);
    }


    @Test
    public void MultiplicationZeroWorks() {
        double[] productInputs = {0, 7, 5};
        double result = calculator.Multiplication(productInputs);
        assertEquals(0, result, 0);
    }

    @Test
    public void OddParityMultiplication() {
        double[] productInputs = {9, -8, 6};
        double result = calculator.Multiplication(productInputs);
        assertTrue(result < 0);
    }

    @Test
    public void EvenParityMultiplication() {
        double[] productInputs = {-9, -8, 6};
        double result = calculator.Multiplication(productInputs);
        assertTrue(result > 0);
    }

    @Test
    public void IdentityMultiplication() {
        double[] productInputs = {1, 7};
        double result = calculator.Multiplication(productInputs);
        assertEquals(7, result, 0);
    }

    @Test
    public void MultiplicationDouble() {
        double[] productInputs = {7.8, 4.9, 1.5};
        double result = calculator.Multiplication(productInputs);
        assertEquals(57.33, result, 0);
    }

    @Test
    public void NegativeMultiplicationDouble() {
        double[] productInputs = {-7.8, -4.9, -1.5};
        double result = calculator.Multiplication(productInputs);
        assertEquals(-57.33, result, 0);
    }

    @Test
    public void MultiplicationZeroDouble() {
        double[] productInputs = {0, 5.5, 7.8};
        double result = calculator.Multiplication(productInputs);
        assertEquals(0, result, 0);
    }


    @Test
    public void CommutativeMultiplication() {
        double[] MultiplicationInputs = {2, 1, 3};
        double[] MultiplicationInputsAlt = {1, 2, 3};
        double resultAlt = calculator.Multiplication(MultiplicationInputsAlt);
        double result = calculator.Multiplication(MultiplicationInputs);
        boolean isSame = result == resultAlt;
        assertTrue(isSame);
    }

    @Test
    public void subtract() {
        double[] subtractInputs = {7, 4};
        double result = calculator.subtract(subtractInputs);
        assertEquals(3, result, 0);
    }
    @Test
    public void subtractOneNegative() {
        double[] subtractInputs = {-7, 4};
        double result = calculator.subtract(subtractInputs);
        assertEquals(-11, result, 0);
    }
    @Test
    public void subtractThreeNum() {
        double[] subtractInputs = {7, 4, 9};
        double result = calculator.subtract(subtractInputs);
        assertEquals(-6, result, 0);
    }

    @Test
    public void subtractOneZero() {
        double[] subtractInputs = {7, 0};
        double result = calculator.subtract(subtractInputs);
        assertEquals(7, result, 0);
    }
    @Test
    public void subtractTwoNegative() {
        double[] subtractInputs = {-7, -4};
        double result = calculator.subtract(subtractInputs);
        assertEquals(-3, result, 0);
    }

    @Test
    public void TwoSubtract() {
        double[] subtractInputs = {7, 4};
        double[] subtractInputsAlt = {4, 7};
        double result = calculator.subtract(subtractInputs);
        double resultAlt = calculator.subtract(subtractInputsAlt);
        boolean isNegative = result * -1 == resultAlt;
        assertTrue(isNegative);
    }

    @Test
    public void subtractTwoZeros() {
        double[] subtractInputs = {0, 0};
        double result = calculator.subtract(subtractInputs);
        assertEquals(0, result, 0);
    }
    @Test
    public void moduloOfTwoNum() {
        double result = calculator.moduloOfTwoNum(5.0, 3.0);
        assertEquals(2, result, 0);
    }

    @Test
    public void moduloOfNegative() {
        double result = calculator.moduloOfTwoNum(-5.0, 3.0);
        assertEquals(1, result, 0);
    }

    @Test
    public void moduloOfOne() {
        double result = calculator.moduloOfTwoNum(5, 1);
        assertEquals(0, result, 0);
    }

    @Test
    public void moduloOfEvenOdd() {
        double resultOdd = calculator.moduloOfTwoNum(5, 2);
        double resultEven = calculator.moduloOfTwoNum(6, 2);
        assertEquals(1, resultOdd, 0);
        assertEquals(0, resultEven, 0 );
    }

    @Test
    public void factorialLessThanZero() {
        double result = calculator.factorial(-5);
        assertEquals(0, result, 0);
    }

    @Test
    public void factorialReturnsOne() {
        double result = calculator.factorial(0);
        assertEquals(1, result, 0);
    }

    @Test
    public void factorialReturnsTwoInputOne() {
        double result = calculator.factorial(1);
        assertEquals(1, result, 0);
    }

    @Test
    public void factorialReturnsTwo() {
        double result = calculator.factorial(2);
        assertEquals(2, result, 0);
    }

    @Test
    public void factorialReturnsSix() {
        double result = calculator.factorial(3);
        assertEquals(6, result, 0);
    }

    @Test
    public void factorialInputFour() {
        double result = calculator.factorial(4);
        assertEquals(24, result, 0);
    }


    @Test
    public void Average() {
        double[] AverageInputs = {4, 10, 9};
        double result = calculator.Average(AverageInputs);
        assertEquals(7.66, result, 0.1);
    }


    @Test
    public void AverageOfTwoZeroes() {
        double[] AverageInputs = {0, 4, 0};
        double result = calculator.Average(AverageInputs);
        assertEquals(1.33, result, 0.1);
    }


    @Test
    public void AverageOfSameNumber() {
        double[] AverageInputs = {6, 6, 6};
        double result = calculator.Average(AverageInputs);
        assertEquals(6, result, 0);
    }

    @Test
    public void AverageIsZero() {
        double[] AverageInputs = {8, -8};
        double result = calculator.Average(AverageInputs);
        assertEquals(0, result, 0);
    }

    @Test
    public void MultiplicationAndMod() {
        double[] productInputs = {4, 3};
        double temp = calculator.Multiplication(productInputs);
        double result = calculator.moduloOfTwoNum(temp, 3);
        assertEquals(0, result, 0);
    }

    @Test
    public void squareRootMin() {
        double  squareRootInputs = -4;
        double result = calculator.squareRoot(squareRootInputs);
        assertEquals(Double.MIN_VALUE, result, 0);
    }

    @Test
    public void squareRootZero() {
        double squareRootInputs = 0;
        double result = calculator.squareRoot(squareRootInputs);
        assertEquals(0, result, 0);
    }

    @Test
    public void squareRootOne() {
        double squareRootInputs = 1;
        double result = calculator.squareRoot(squareRootInputs);
        assertEquals(1, result, 0);
    }

    @Test
    public void IntegerTest() {
        double squareRootInputs = 4;
        double result = calculator.squareRoot(squareRootInputs);
        assertEquals(2, result, 0);
    }

    @Test
    public void DoubleTest() {
        double squareRootInputs = 5;
        double result = calculator.squareRoot(squareRootInputs);
        assertEquals(2.23, result, 0.1);
    }

    @Test
    public void divideInputs() {
        double result = calculator.divide(4, 2);
        assertEquals(2, result, 0);
    }

    @Test
    public void divideIncreaseTolerance() {
        double result = calculator.divide(5, 3);
        assertEquals(1.666, result, 0.1);
    }

    @Test
    public void divideNeggieInputs() {
        double result = calculator.divide(-2, 5);
        assertEquals(-0.4, result, 0);
    }

    @Test
    public void divisionByZero() {
        double result = calculator.divide(4, 0);
        assertEquals(Double.MIN_VALUE, result, 0);
    }






}

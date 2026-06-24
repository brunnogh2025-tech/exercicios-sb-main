package com.example.exerciciossb.math;

import org.junit.jupiter.api.*;
import testes_unitarios.math.SimpleMath;

import static org.junit.jupiter.api.Assertions.fail;

@DisplayName("Tests of the class Simple Math")
public class SimpleMathTest {

    SimpleMath math;

    @BeforeAll
    static void setup(){
        System.out.println("Running @BeforeAll");
    }

    @AfterAll
    static void cleanup(){
        System.out.println("Running @AfterAll");
    }

    @BeforeEach
    void instance(){
        math = new SimpleMath();
        System.out.println("Running @BeforeEach method");
    }

    @AfterEach
    void afterEachMethod(){
        System.out.println("Running @AfterEach method");
    }

    @Test
    @DisplayName("Test 6.2 + 2 = 8.2")
    void testSum_When_SixDotTwoIsAddedByTwo_ShouldResultEightDotTwo(){
        //Given
        Double firstNum = 6.2D;
        Double secondNumber = 2D;
        Double expected = 8.2D;
        //When
        Double actual = math.sum(firstNum,secondNumber);
        //Then
        Assertions.assertEquals(expected, actual,() -> firstNum + " + " + secondNumber + " não produziu " + expected);
    }

    @Test
    @DisplayName("Test 7.5 - 2.5 = 5")
    void testSubtraction_When_SevenDotFiveIsSubtractedByTwoDotFive_ShouldReturnFive(){
        Double num1 = 7.5D;
        Double num2 = 2.5D;

        Double expected = 5D;
        Double actual = math.subtraction(num1, num2);

        Assertions.assertEquals(expected, actual, () -> num1 + " - " + num2 + " não resultaram em " + expected);
    }

    @Test
    @DisplayName("Test 3 * 8 = 24")
    void testMultiplication_When_ThreeIsMultipliedByEight_ShouldReturnTwentyFour(){
        Double n1 = 3D;
        Double n2 = 8D;

        Double expected = 24D;
        Double actual = math.multiplication(n1, n2);

        Assertions.assertEquals(expected, actual, () -> n1 + " * " + n2 + "não resultaram em " + expected);
    }

    @Test
    @DisplayName("Test 25 / 5 = 5")
    void testDivision_When_TwentyFiveIsDividedByFive_ShouldReturnFive(){

        Double n1 = 25D;
        Double n2 = 5D;

        Double expected = 5D;
        Double actual = math.division(n1, n2);

        Assertions.assertEquals(expected, actual, () -> n1 + " / " + n2 + "não resultaram em " + expected);
    }

    /*@Test
    @DisplayName("Test Number Divided By Zero")
    void testDivision_When_FirstNumDividedByZero_ShouldReturnArithmeticException(){
        fail();
    }*/

    @Test
    @DisplayName("Test (8 + 10) / 2 = 9")
    void testMean_WhenEightIsAddedByTenAndDividedByTwo_ShouldReturnNine(){

        Double n1 = 8D;
        Double n2 = 10D;

        Double expected = 9D;
        Double actual = math.mean(n1, n2);

        Assertions.assertEquals(expected, actual, () -> "Média de " + n1 + " e " + n2 + "não resultou em " + expected);
    }

    @Test
    @DisplayName("Test Square of 16 = 4")
    void testSquare_When_SquareOfSixteenIsCalculated_ShouldReturnFour(){

        Double num = 16D;

        Double expected = 4D;
        Double actual = math.square(num);

        Assertions.assertEquals(expected, actual, () -> "Raíz quadrada de " + num + "não resultou em " + expected);
    }

}

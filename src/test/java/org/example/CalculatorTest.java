// B211202379
// Ayşenur Büyükkarahan
// SOFTWARE VERIFICATION AND VALIDATION
// HOMEWORK 1
// https://github.com/aysenurbuyukkarahan/b211202379

package org.example;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @ParameterizedTest
    @DisplayName("Division with different inputs")
    @CsvSource({
            "10, 2, 5",
            "10, 4, 2.5",
            "12.5f, 2.5f, 5",
            "10, 2.5f, 4",
            "12.5f, 5, 2.5f"
    })
    void testDivision(float a, float b, float expectResult) {
        float mainResult = Calculator.divide(a, b);
        assertEquals(expectResult, mainResult, 0.001);
    }

    @ParameterizedTest
    @DisplayName("Division by zero throws IllegalArgumentException")
    @CsvSource({
            "10, 0"
    })
    void testDivideByZero(float a, float b) {
        assertThrows(IllegalArgumentException.class, () -> Calculator.divide(a, b));
    }
}
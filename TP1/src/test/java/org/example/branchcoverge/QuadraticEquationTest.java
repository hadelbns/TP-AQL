package org.example.branchcoverge;

import org.example.QuadraticEquation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuadraticEquationTest {
    @Test
    public void testSolveRealRoots() {
        double a = 1;
        double b = -3;
        double c = 2;
        double[] expectedRoots = {2.0, 1.0};
        assertArrayEquals(expectedRoots, QuadraticEquation.solve(a, b, c));
    }

    @Test
    public void testSolveOneRealRoot() {
        double a = 1;
        double b = -2;
        double c = 1;
        double[] expectedRoots = {1.0};
        assertArrayEquals(expectedRoots, QuadraticEquation.solve(a, b, c));
    }

    @Test
    public void testSolveNoRealRoots() {
        double a = 2;
        double b = 4;
        double c = 5;
        assertNull(QuadraticEquation.solve(a, b, c));
    }

    @Test
    public void testSolveZeroA() {
        double a = 0;
        double b = 1;
        double c = 2;
        assertThrows(IllegalArgumentException.class, () -> {
            QuadraticEquation.solve(a, b, c);
        });
    }
}
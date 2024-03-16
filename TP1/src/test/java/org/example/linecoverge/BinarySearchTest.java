package org.example.linecoverge;

import org.example.BinarySearch;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {
    @Test
    public void testBinarySearchFound() {
        // le 7 est le mid donc ce test assure l'execution
        // du 1 ere instruction directement in this type of test it's not important if the searched element situated in first or last place  )
        int[] array = {1, 3, 5, 7, 9, 11, 13};
        int element = 7;
        int expectedIndex = 3;
        assertEquals(expectedIndex, BinarySearch.binarySearch(array, element));
    }
    @Test
    public void testBinarySearchNotFound() {
        int[] array = {1, 3, 5, 7, 9, 11, 13};
        int element = 8;
        int expectedIndex = -1;
        assertEquals(expectedIndex, BinarySearch.binarySearch(array, element));
    }
    @Test
    public void testBinarySearchNullArray() {
        assertThrows(NullPointerException.class, () -> {
            BinarySearch.binarySearch(null, 5);
        });
    }

}